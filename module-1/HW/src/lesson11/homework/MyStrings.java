package lesson11.homework;

import java.util.Scanner;

public class MyStrings {

  public static void main(String[] args) {
    //findLength(args);
    //organiseStrings(args);
    //calculateAverageLength(args);
    //findUniqueStrings(args);
    doubleCharacters(args);
  }

  public static String[] inputStrings(int count) {
    Scanner input = new Scanner(System.in);
    String[] lines = new String[count];

    for (int i = 0; i < count; i++) {
      System.out.print("Enter a string " + (i + 1) + ":");
      lines[i] = input.nextLine();
    }

    return lines;
  }

  //task 1
  public static void findLength(String[] args) {
    String[] lines = inputStrings(3);

    String shortest = lines[0];
    String longest = lines[0];

    for (String line : lines) {
      if (line.length() < shortest.length()) {
        shortest = line;
      } else if (line.length() > longest.length()) {
        longest = line;
      }
    }

    System.out.println("Shortest string: " + shortest);
    System.out.println("Shortest string length: " + shortest.length());
    System.out.println("Longest string: " + longest);
    System.out.println("Longest string length: " + longest.length());
  }

  //task 2

  public static void organiseStrings(String[] args) {
    String[] lines = inputStrings(3);
    String first, second, third;
    if (lines[0].length() <= lines[1].length() && lines[0].length() <= lines[2].length()) {
        first = lines[0];
        if (lines[1].length() <= lines[2].length()) {
            second = lines[1];
            third = lines[2];
        } else {
            second = lines[2];
            third = lines[1];
        }
    } else if (lines[1].length() <= lines[0].length() && lines[1].length() <= lines[2].length()) {
        first = lines[1];
        if (lines[0].length() <= lines[2].length()) {
            second = lines[0];
            third = lines[2];
        } else {
            second = lines[2];
            third = lines[0];
        }
    } else {
        first = lines[2];
        if (lines[0].length() <= lines[1].length()) {
            second = lines[0];
            third = lines[1];
        } else {
            second = lines[1];
            third = lines[0];
        }
    }

    System.out.println("Strings in order of increasung length:");
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
  }

  //task 3
  public static void calculateAverageLength(String[] args) {
    String[] lines = inputStrings(3);
    int totalLength = 0;

    for (String line : lines) {
      totalLength += line.length();
    }
    double averageLength = totalLength / lines.length;
    System.out.println("Strings with length mine than average length (" + averageLength + "):");
    for (String line : lines) {
        if (line.length() < averageLength) {
            System.out.println(line + " (length: " + line.length() + ")");
        }
    }
  }

  //task 4
  public static void findUniqueStrings(String[] args) {
    String[] lines = inputStrings(3);

    for (String line : lines) {
      String[] words = line.split("\\s+");
      for (String word : words) {
        if (hasAllUniqueCharacters(word)) {
          System.out.println("First word with all unique characters: \"" + word + "\"");
          return;
        }
      }
    }
    System.out.println("There are no words with all unique characters.");

  }

  private static boolean hasAllUniqueCharacters(String word) {
  boolean[] charSet = new boolean[256];
  for (char c : word.toCharArray()) {
      if (charSet[c]) {
          return false;
      }
      charSet[c] = true;
  }
  return true;
  }

  //task 5

  public static void doubleCharacters(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string for doubling characters: ");
    String inputString = input.nextLine();
    StringBuilder duplicated = new StringBuilder();
    for (char c : inputString.toCharArray()) {
      duplicated.append(c).append(c);
    }
    System.out.println("Duplicated string: " + duplicated.toString());
    input.close();
  }
}
