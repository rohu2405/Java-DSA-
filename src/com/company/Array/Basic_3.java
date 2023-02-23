package com.company.Array;

public class Basic_3 {
    public static void main(String[] args) {

        // Questions:1
        // Find the largest element of an array
//        int[] arr = {1 , 2 , 3 , 4 , 5};
//        System.out.println(Arrays.toString(arr));
//        largestElement(arr);
//        minimumElement(arr);
//        secondLargestElement(arr);
//        secondMinimumElement(arr);
//        thirdLargestElement(arr);

        /* Question 2
        int[] arr = {2,2,4,4,5,6,6,7,7};
        // res = 2,4,5,6,7
        int j = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i+1];
                j++;
            }

        }

        System.out.println(Arrays.toString(arr));

        // Approach 2
        int[] arr = {2,2,4,4,5,6,6,7,7};
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));*/





        }
        static void thirdLargestElement(int[] arr){
            int largest = 0;
            int secLargest = 0;
            int thirdLargest = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > largest){
                    largest = arr[i];
                }

            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > secLargest && arr[i] < largest){
                    secLargest = arr[i];
                }

            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > thirdLargest && arr[i] < secLargest){
                    thirdLargest = arr[i];
                }

            }
            System.out.println("Third largest element is : "+thirdLargest);
        }
        static void secondMinimumElement(int[] arr){
            int min = Integer.MAX_VALUE;
            int secMin = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < secMin && arr[i] > min){
                    secMin = arr[i];
                }
            }
            System.out.println("Second minimum element is : "+secMin);
        }
        static void secondLargestElement(int[] arr){
            int largest = 0;
            int secLargest = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > largest && arr[i] > secLargest){
                    largest = arr[i];

                }


            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > secLargest && arr[i] < largest){
                    secLargest = arr[i];
                }
            }
            System.out.println("Second largest element is : "+secLargest);
        }
        static void minimumElement(int[] arr){
            int smallest = arr[0];
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i] < smallest){
                    smallest = arr[i];
                }

            }
            System.out.println("Smallest element is : "+smallest);
        }
        static void largestElement(int[] arr){
            int largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
            System.out.println("Largest element is : "+largest);
        }

    }

       /* Delete element from an array
        int[] arr = {2 , 5 , 8 , 6 , 7 , 9};
        int key = 6;
        System.out.println(Arrays.toString(arr));
        int i = 0;
        for (; i < arr.length; i++) {
            if(arr[i] == key){
                break;
            }
        }
        for (int j = i; j < arr.length-1; j++) {
            arr[j] = arr[j+1];

        }
        System.out.println(Arrays.toString(arr));*/

