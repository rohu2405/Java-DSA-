package com.nqt.preperation;

import java.util.Arrays;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        /*
          Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

          Note : 1st element of the array should be considered in the count of the result.

          For example,
          Arr[]={7,4,8,2,9}
          As 7 is the first element, it will consider in the result.
          8 and 9 are also the elements that are greater than all of its previous elements.
          Since total of  3 elements is present in the array that meets the condition.
          Hence the output = 3.
          Example 1:

          Input
          5 -> Value of N, represents size of Arr
          7-> Value of Arr[0]
          4 -> Value of Arr[1]
          8-> Value of Arr[2]
          2-> Value of Arr[3]
          9-> Value of Arr[4]

          Output :
          3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("size of array");
        int count = 1;
        int size = input.nextInt();
        int[] arr = new int[size];

        // taking input in the array
        for (int i = 0; i < size ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < size; i++) {
           if(arr[i] > max){
               count++;
               max = arr[i];
           }
        }
        System.out.println(count);





    }
}
