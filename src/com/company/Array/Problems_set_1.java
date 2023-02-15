package com.company.Array;



import java.util.Arrays;
import java.util.Scanner;

public class Problems_set_1 {
    public static void main(String[] args) {
        // Q-1 Find the max and min and reverse the element of an array!

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }


        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        minElement(array);
        maxElement(array);
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }

    static void minElement(int[] array) {
        int minimum = array[0];

        for (int j : array) {
            if (j < minimum) {
                minimum = j;

            }
        }
        System.out.println("Minimum element is:- "+minimum);
    }

    static void maxElement(int[] array){
        int maximum = array[0];

        for (int j : array) {
            if (j > maximum) {
                maximum = j;
            }
        }
        System.out.println("Maximum element is:- "+maximum);

    }

    static void reverseArray(int[] array) {
        int first = 0;
        int last = array.length-1;

       while (first<last) {
           swap(array , first , last);
           first++;
           last--;
       }



    }

     static void swap(int[] array, int first, int last) {
        int temp = array[first];
         array[first] = array[last];
         array[last] = temp;

    }
}
