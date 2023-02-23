package com.company.Array;

import java.util.Arrays;

public class Problem_set_2 {
    public static void main(String[] args) {
        // Question 1 check array is sorted or not
        int[] arr = {21 , 42 , 63 , 74, 55};
        System.out.println(Arrays.toString(arr));
       // reverseArray2(arr);
       // reverseArray1(arr);
      //  System.out.println(checkArraySorted(arr));
    }
    static void reverseArray2(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(start , end , arr);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int start , int end , int[] arr){
        arr[start] = arr[start] ^ arr[end];
        arr[end] = arr[start] ^ arr[end];
        arr[start] = arr[start] ^ arr[end];

    }

    static void reverseArray1(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");

        }
    }
    static boolean checkArraySorted(int[] arr){

        boolean ans = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                ans = true;
            }else {
                ans = false;
            }

        }
        return ans;

    }
}
