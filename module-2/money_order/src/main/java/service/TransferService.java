package service;

import exception.InsufficientFundsException;
import exception.InvalidAccountException;
import model.Account;
import java.util.HashMap;
import java.util.Map;

public class TransferService {
    private final Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void transfer(String fromAccount, String toAccount, int amount) throws InvalidAccountException, InsufficientFundsException {
        Account from = accounts.get(fromAccount);
        Account to = accounts.get(toAccount);

        if (from == null || to == null) {
            throw new InvalidAccountException("Один из счетов не существует.");
        }
        if (from.getBalance() < amount) {
            throw new InsufficientFundsException("Недостаточно средств на счете.");
        }
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }
}
