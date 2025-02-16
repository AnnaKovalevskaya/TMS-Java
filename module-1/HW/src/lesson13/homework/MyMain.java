package lesson13.homework;

import java.util.Scanner;

public class MyMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter login: ");
    String login = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter confirm password: ");
    String confirmPassword = scanner.nextLine();

    try {
      boolean isValid = takeException(login, password, confirmPassword);
      if (isValid) {
          System.out.println("Login and password are valid.");
      }
    } catch (WrongLoginException | WrongPasswordException e) {
        System.err.println("Ошибка: " + e.getMessage());
    }

    scanner.close();

   // absentFinally(args);
  }

  // Task 1

  public static boolean takeException(String login, String password, String confirmPassword)
   throws WrongLoginException, WrongPasswordException {
    if (login.length() >= 20) {
      throw new WrongLoginException("Login is too long");
    }
    if (login.contains(" ")) {
      throw new WrongLoginException("Login contains spaces");
    }
    if (password.length() >= 20) {
      throw new WrongPasswordException("Password is too long");
    }
    if (password.contains(" ")) {
        throw new WrongPasswordException("Password contains spaces");
    }
    if (!password.matches(".*\\d.*")) {
        throw new WrongPasswordException("Password must contain at least one digit");
    }
    if (!password.equals(confirmPassword)) {
        throw new WrongPasswordException("Password is not confirmed");
    }

    return true;
  }

  // Task 2
  public static void absentFinally(String[] args) {
    try {
        System.out.println("Выполняется блок try.");
        System.exit(0);
    } catch (Exception e) {
        System.out.println("Выполняется блок catch.");
    } finally {
        System.out.println("Выполняется блок finally.");
    }
}
}
