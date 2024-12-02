package lesson2.homework;

import java.util.Scanner;

 class HomeWorkPart2 {
  public static void main(String[] args) {
    //calculateFormula();
    //calculateValue();
    //calculateElseValue();
    //roundupValue();
    //calulateDivision();
    redefineValue();
  }

  //Task 1 а=4*(b+c-1)/2
  public static void calculateFormula() {
    int valueB = 8;
    int valueC = 15;

    int valueA = 4 * (valueB + valueC - 1) / 2;

    System.out.println(valueA);
  }

  //Task 2
  public static void calculateValue() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int valueN = input.nextInt();

    int valueOne = valueN / 10;
    System.out.println(valueOne);
    int valueTwo = valueN % 10;
    System.out.println(valueTwo);
    int sumN = valueOne + valueTwo;
    System.out.println(sumN);
  }

  //Task 3
  public static void calculateElseValue() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int valueN = input.nextInt();

    int valueOne = valueN / 100;
    System.out.println(valueOne);
    int valueTwo = valueN / 10;
    valueTwo = valueTwo % 10;
    System.out.println(valueTwo);
    int valueThree = valueN % 10;
    System.out.println(valueThree);
    int sumN = valueOne + valueTwo + valueThree;
    System.out.println(sumN);
  }

  //Task 4
  public static void roundupValue() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    float valueN = input.nextFloat();
    float valueOne = Math.round(valueN);
    System.out.println(valueOne);
  }

  //Task 5
  public static void calulateDivision(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int valueQ = input.nextInt();
    System.out.println("Enter a number");
    int valueW = input.nextInt();
    System.out.println("Division result: " + valueQ + "/" + valueW + " = " + valueQ/valueW + " and remainder is: " + valueQ%valueW);
  }

  // Task *
  public static void redefineValue() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number A");
    int valueA = input.nextInt();
    System.out.println("Enter a number B");
    int valueB = input.nextInt();
    // int valueC = valueA;
    // valueA = valueB;
    // valueB = valueC;
    // System.out.println("Value A: " + valueA);
    // System.out.println("Value B: " + valueB);

    valueA = valueA + valueB;
    valueB = valueA - valueB;
    valueA = valueA - valueB;
    System.out.println("Value A: " + valueA);
    System.out.println("Value B: " + valueB);
  }

}
