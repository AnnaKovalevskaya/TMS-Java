package service;

import exception.InvalidTransferException;
import model.Transfer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileParserService {
    public List<Transfer> parseFiles(String inputDir) throws IOException, InvalidTransferException {
        List<Transfer> transfers = new ArrayList<>();
        File dir = new File(inputDir);

        if (!dir.exists() || !dir.isDirectory()) {
            throw new IOException("Каталог не существует или не является каталогом.");
        }
        for (File file : dir.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] parts = line.split(",");
                        if (parts.length < 3) continue;
                        String fromAccount = parts[0].trim();
                        String toAccount = parts[1].trim();
                        int amount = Integer.parseInt(parts[2].trim());
                        if (amount <= 0) {
                            throw new InvalidTransferException("Сумма перевода должна быть положительной.");
                        }
                        transfers.add(new Transfer(fromAccount, toAccount, amount));
                    }
                }
                Files.move(file.toPath(), Paths.get("src/main/resources/archive/" + file.getName()));
            }
        }
        return transfers;
    }
}