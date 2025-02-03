package lesson12.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter text: ");
    String inputText = scanner.nextLine();

    // task 1
    System.out.println("Abbreviations:");
    findAbbreviations(inputText);

    // task*
    System.out.println("\nInformation:");
    findInformation(inputText);
}


private static void findAbbreviations(String text) {
    Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
        System.out.println(matcher.group());
    }
}

private static void findInformation(String text) {
    String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    Pattern emailPattern = Pattern.compile(emailRegex);
    Matcher emailMatcher = emailPattern.matcher(text);

    String documentRegex = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
    Pattern documentPattern = Pattern.compile(documentRegex);
    Matcher documentMatcher = documentPattern.matcher(text);

    String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}";
    Pattern phonePattern = Pattern.compile(phoneRegex);
    Matcher phoneMatcher = phonePattern.matcher(text);

    if (emailMatcher.find()) {
        System.out.println("email: " + emailMatcher.group());
    }

    if (documentMatcher.find()) {
        System.out.println("document number: " + documentMatcher.group());
    }

    if (phoneMatcher.find()) {
        System.out.println("phone number: " + phoneMatcher.group());
    }
}
}
