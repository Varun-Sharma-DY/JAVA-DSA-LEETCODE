package LEETCODE;

import java.util.Scanner;

public class zigzagConversion {

    public static void printZigzag(String s, int numRows) {

        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        int n = s.length();
        char[][] matrix = new char[numRows][n];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ' ';
            }
        }

        int row = 0, col = 0;
        boolean goingDown = true;

        for (int i = 0; i < n; i++) {

            matrix[row][col] = s.charAt(i);

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        // Print pattern
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        System.out.println("\nZigzag Pattern:\n");
        printZigzag(s, numRows);

        sc.close();
    }
}