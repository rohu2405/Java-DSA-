package com.company.Array;

import java.util.Scanner;

public class Basic_2 {
    public static void main(String[] args) {
        System.out.println("-----2D ARRAY-----");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of row in a matrix");
        int row = input.nextInt();
        System.out.println("Enter the no of column in a matrix ");
        int column = input.nextInt();
        int[][] matrix = new int[row][column];

        // Taking element of matrix by user
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Printing value of matrix
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
