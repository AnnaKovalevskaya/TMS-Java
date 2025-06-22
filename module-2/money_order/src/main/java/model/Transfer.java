package model;

public class Transfer {
    private String fromAccount;
    private String toAccount;
    private int amount;

    public Transfer(String fromAccount, String toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public String getFromAccount() {

        return fromAccount;
    }

    public String getToAccount() {

        return toAccount;
    }

    public int getAmount() {

        return amount;
    }
}
