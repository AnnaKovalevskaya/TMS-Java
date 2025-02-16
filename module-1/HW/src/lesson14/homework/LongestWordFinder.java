package lesson14.homework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LongestWordFinder {   public static void main(String[] args) {
  String longestWord = "";
  try {
      BufferedReader br = new BufferedReader(new FileReader("src/lesson14/homework/RomeoAndJuliet.txt"));
      String line;
      while ((line = br.readLine()) != null) {
          String[] words = line.split("\\W+");
          for (String word : words) {
              if (word.length() > longestWord.length()) {
                  longestWord = word;
              }
          }
      }
      br.close();
  } catch (IOException e) {
      e.printStackTrace();
  }

  try {
      FileWriter writer = new FileWriter("src/lesson14/homework/LongestWord.txt");
      writer.write(longestWord);
      writer.close();
  } catch (IOException e) {
      e.printStackTrace();
  }
}
}
