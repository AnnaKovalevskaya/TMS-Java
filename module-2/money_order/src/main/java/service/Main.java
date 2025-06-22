package service;

import exception.InsufficientFundsException;
import exception.InvalidAccountException;
import exception.InvalidTransferException;
import model.Account;
import service.FileParserService;
import service.TransferService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TransferService transferService = new TransferService();
        FileParserService fileParserService = new FileParserService();
        loadAccounts(transferService);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Введите 1 для парсинга файлов, 2 для вывода всех переводов, 0 для выхода:");
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        try {
                            List<model.Transfer> transfers = fileParserService.parseFiles("src/main/resources/input");
                            for (model.Transfer transfer : transfers) {
                                transferService.transfer(transfer.getFromAccount(), transfer.getToAccount(), transfer.getAmount());
                            }
                            System.out.println("Файлы успешно обработаны.");
                        } catch (IOException | InvalidTransferException e) {
                            System.err.println("Ошибка при парсинге файлов: " + e.getMessage());
                        } catch (InvalidAccountException | InsufficientFundsException e) {
                            System.err.println("Ошибка при выполнении перевода: " + e.getMessage());
                        }
                        break;
                    case 2:
                        transferService.getAccounts().forEach((accountNumber, account) -> {
                            System.out.println("Счет: " + accountNumber + ", Баланс: " + account.getBalance());
                        });
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Некорректный ввод. Попробуйте снова.");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }

    private static void loadAccounts(TransferService transferService) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/accounts.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String accountNumber = parts[0].trim();
                int balance = Integer.parseInt(parts[1].trim());
                transferService.addAccount(new Account(accountNumber, balance));
            }
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке счетов: " + e.getMessage());
        }
    }
}


