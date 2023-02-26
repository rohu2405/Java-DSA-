package com.company.Array;

public class Problem_Set_3 {
    public static void main(String[] args) {
        /* Question 1 Print the frequency of all element in the sorted array
        int[] arr = {2,2,2,3,4,4,5,6,7,7,7,8,8,9,9};

        System.out.println(Arrays.toString(arr));
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                freq++;
            } else{
                System.out.println("frequency of " + arr[i-1] + "is : " + freq);
                freq = 1;
            }
        }
        System.out.println("Frequency of " + arr[arr.length-1] + "is : " + freq);

        Question 2 find the longest length of all consecutive 1
        int arr[] = {1, 1, 1,1,1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                length++;
                maxLength = Math.max(length, maxLength);



            } else  {

                length = 0;
            }


        }
        System.out.println(maxLength);

         Question 3 Move all zeros to end of array
        int[] arr = {8,0,1,3,0,0,5};
       // int newArr[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < (arr.length); i++) {
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }

        }
        while (count<arr.length){
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));

         Question 4 Minimum sum of subarray
        int[] arr = {1 , -2 , 4 , 5 , 6};
        int min = Integer.MAX_VALUE;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr+=arr[i];
            if(arr[i] <0){
                curr = arr[i];
            }
            if(curr < min ){

                min = curr;
            }


        }
        System.out.println(min);*/



    }
}









