package lesson5.homework;

import java.util.Random;
import java.util.Scanner;

class HomeWorkPart5 {
  public static void main(String[] args) {
    //sumArray(args);
    //writeChessBoard(args);
    writeSnakeArray(args);
  }

  // Task 1
  public static void sumArray(String[] args) {
    int rows = 3;
    int cols = 3;
    int[][] array = new int[rows][cols];
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    // Fill the array with random numbers
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            array[i][j] = random.nextInt(100); // Random numbers between 0 and 99
        }
    }
    System.out.println("Original array:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Enter a number to add to each element:");
    int userInput = scanner.nextInt();

    int sum = 0;

    // Add user input to each element and calculate the sum
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            array[i][j] += userInput;
            sum += array[i][j];
        }
    }
    System.out.println("Changed array:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("The sum of all elements after addition is: " + sum);
    }

    // Task 2
    public static void writeChessBoard(String[] args) {
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        for (String[] row : board) {
            for (String square : row) {
                System.out.print(square + " ");
            }
            System.out.println();
        }
    }

    // Task *
    public static void writeSnakeArray(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int columns = input.nextInt();
        int[][] A = new int[rows][columns];

        int value = 0;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    A[i][j] = value++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    A[i][j] = value++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }
    }
}
