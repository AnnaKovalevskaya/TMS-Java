package lesson6.homework;

public class CreditCard {
  private String accountNumber;
  private double balance;

  public CreditCard(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
}

public void deposit(double amount) {
  balance += amount;
}

public void withdraw(double amount) {
  if (amount <= balance) {
      balance -= amount;
  } else {
      System.out.println("Insufficient funds.");
  }
}

  public void displayInfo() {
    System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
}
public static void main(String[] args) {
  CreditCard card1 = new CreditCard("123456789", 1000.0);
  CreditCard card2 = new CreditCard("987654321", 500.0);
  CreditCard card3 = new CreditCard("555555555", 300.0);

  card1.deposit(200.0);
  card2.deposit(150.0);
  card3.withdraw(100.0);

  card1.displayInfo();
  card2.displayInfo();
  card3.displayInfo();
}
}
