package com.company.Array;

import java.util.Scanner;

public class Basic_1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("------ 1D ARRAY ------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = input.nextInt();

        // Intialization of array
        int[] num = new int[size];

        // Taking user input for the element of array
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }

        // Printing value of array
        for (int i = 0; i < size; i++) {
            System.out.print(num[i]+" ");
        }

    }
}
