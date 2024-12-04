package lesson4.homework;

import java.util.Arrays;
import java.util.Scanner;

 class HomeWorkPart4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a length of array: ");
    int value = input.nextInt();
    int[] numbers = new int[value];
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = (int) (Math.random() * 100);
      }

    for (int el : numbers){
        System.out.print(el + " ");
    }

    // writeArray(numbers);
    //findMinMax(numbers);
    //findIndexes(numbers);
    //comparingArrays(numbers);
    //swapElements(numbers);
    //checkSequence(numbers);
    int[] result = addOne(numbers);
    System.out.println(Arrays.toString(result));
  }

  // Task 1
  public static void writeArray(int numbers[]) {
    for (int el : numbers){
           System.out.print(el + " ");
    }
    System.out.println(" ");
    for (int index = numbers.length - 1; index >= 0; index--) {
        System.out.print(numbers[index] + " ");
    }
  }

  // Task 2
  public static void findMinMax(int numbers[]) {
    int min = numbers[0];
    int max = numbers[0];
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] > max) {
        max = numbers[index];
      }
      if (numbers[index] < min) {
        min = numbers[index];
      }
    }
    System.out.println("\nMin: " + min);
    System.out.println("Max: " + max);
  }

  // Task 3
   public static void findIndexes(int numbers[]) {
    int indexMin = 0;
    int indexMax = 0;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] > numbers[indexMax]) {
        indexMax = index;
      }
      if (numbers[index] < numbers[indexMin]) {
        indexMin = index;
      }
    }
    System.out.println("\nMin: " + indexMin);
    System.out.println("Max: " + indexMax);
  }

  // Task 4
  public static void comparingArrays(int numbers[]) {
    int counter = 0;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] == 0) {
        counter++;
      }
    }
    if (counter == 0) {
      System.out.println("\nThere are no zeros in the array.");
    } else {
      System.out.println("\nCounter: " + counter);
    }
  }

  // Task 5
  public static void swapElements(int numbers[]) {
    for (int index = 0; index < numbers.length/2; index++) {
        int temp = numbers[index];
        numbers[index] = numbers[numbers.length - index -1];
        numbers[numbers.length - index -1] = temp;
    }
    System.out.println("\nNew array: ");
    for (int el : numbers){
      System.out.print(el + " ");
    }
  }

  // Task 6
  public static void checkSequence(int numbers[]) {
    boolean flag = true;
    for (int index = 1; index < numbers.length; index++) {
          if(numbers[index]<=numbers[index-1]){
            flag = false;
            break;
        }
    }
    if(flag){
        System.out.println("\nMass is strictly increasing sequence");
    } else {
        System.out.println("\nMass is not strictly increasing sequence");
    }
  }

  // Task *
  public static int[] addOne(int numbers[]) {
    int n = numbers.length;
    for (int i = n - 1; i >= 0; i--) {
        if (numbers[i]%10 < 9) {
          numbers[i]++;
            return numbers;
        }
        numbers[i] = 0;
    }
    int[] newNumber = new int[n + 1];
    newNumber[0] = 1;
    return newNumber;
  }
}
