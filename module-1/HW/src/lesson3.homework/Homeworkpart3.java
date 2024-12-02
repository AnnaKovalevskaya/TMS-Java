package lesson3.homework;

import java.util.Scanner;

 class HomeWorkPart3 {
  public static void main(String[] args) {
    calculateParity();
    //calculateTemperaure();
    //calculateCube();
    //writeSequence();
    //calculateSum();
  }

  // Task 1
  public static void calculateParity() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int valueN = input.nextInt();
    if (valueN % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }

  // Task 2
  public static void calculateTemperaure() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a temperature");
    int valueN = input.nextInt();
    if (valueN > -5) {
      System.out.println("Warm");
    } else if (valueN <= -5 && valueN >= -20) {
      System.out.println("Normal");
    } else if (valueN <= -20) {
      System.out.println("Cold");
    }
  }

  // Task 3
  public static void calculateCube() {
    for (int i = 10; i <= 20; i++) {
      System.out.println(i * i);
    }
  }

  // Task 4
  public static void writeSequence() {
    int value = 7;
    while (value < 100) {
      System.out.print(value + " ");
      value += 7;
    }
  }

  // Task*
  public static void calculateSum() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int valueN = input.nextInt();
    int sum = 0;
    for (int i = 1; i <= valueN; i++) {
        if (valueN > 0){
          sum += i;
        } else {
          break;
        }
    }
    System.out.println(sum);
  }
}
