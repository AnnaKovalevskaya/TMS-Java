package lesson6.homework;
import java.util.HashMap;
import java.util.Map;

public class ATM {
    private int twentyCount;
    private int fiftyCount;
    private int hundredCount;

    public ATM(int twentyCount, int fiftyCount, int hundredCount) {
        this.twentyCount = twentyCount;
        this.fiftyCount = fiftyCount;
        this.hundredCount = hundredCount;
    }

    public void addMoney(int twenty, int fifty, int hundred) {
        this.twentyCount += twenty;
        this.fiftyCount += fifty;
        this.hundredCount += hundred;
    }

    public boolean withdraw(int amount) {
        Map<Integer, Integer> bills = new HashMap<>();
        int originalAmount = amount;

        while (amount > 0) {
            if (amount >= 100 && hundredCount > 0) {
                bills.put(100, bills.getOrDefault(100, 0) + 1);
                amount -= 100;
                hundredCount--;
            } else if (amount >= 50 && fiftyCount > 0) {
                bills.put(50, bills.getOrDefault(50, 0) + 1);
                amount -= 50;
                fiftyCount--;
            } else if (amount >= 20 && twentyCount > 0) {
                bills.put(20, bills.getOrDefault(20, 0) + 1);
                amount -= 20;
                twentyCount--;
            } else {
                break;
            }
        }

        if (amount == 0) {
            System.out.println("Issued:");
            for (Map.Entry<Integer, Integer> entry : bills.entrySet()) {
                System.out.println(entry.getValue() + " banknote(s) denomination " + entry.getKey());
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(10, 5, 2);
        atm.withdraw(200);
        atm.addMoney(5, 5, 5);
    }
}

