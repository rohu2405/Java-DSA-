package com.company.Array;

public class Intermediate_1 {
    public static void main(String[] args) {
        /* Question 1 Leaders in an array
         Approach 1 --> Time complexity O(n^2)
        int[] arr = {2 , 7 , 6 , 1 , 4 , 3};
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            boolean isLeader = true;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > curr){
                    isLeader = false;
                }

            }
            if(isLeader){
                System.out.print(arr[i]);
            }


        }*/

        /* Alternate Approach Time complexity--> O(n)
        int largest = Integer.MIN_VALUE;
        //int[] newArr = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i] > largest){
                largest = arr[i];
                System.out.println(arr[i] + "");
            }

        }

        // Question 2 replacwe every element on its right side
        int[] arr = {7,5,8,9,6,8,5,7,4,6};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    arr[i] = arr[j];
                    System.out.print(arr[i]);
                }


            }
            ---------------------------------------- Solution Pending -------------------------------------------------------



        }

        // Question 3 Maximum sum subarray (using kadanes algorithm)
        int[] arr = {6,-7,4,-2,1,5,-4};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currSum = currSum + arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }

        }
        System.out.println(maxSum);

        // Question 4 Max water in a container
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int right = arr[j];
                int distance = j-i;
                int area = Math.min(left , right) * distance;
                 maxArea= Math.max(area , maxArea);

            }

        }
        System.out.println(maxArea);

        // Alternate approach using two pointers technique (optimised approach)
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int height = Math.min(arr[start] , arr[end]);
            int distance = end - start;
            int area = height*distance;
            maxArea = Math.max(area , maxArea);
            if(arr[start] < arr[end]){
                start++;
            }else{
                end--;
            }
        }
        System.out.println(maxArea);*/
        





    }

}
