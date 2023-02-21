package com.java.basics;

public class Practise_Problems_2 {
    public static void main(String[] args) {
        // Question 1
        /* Write a java program to find the number greater than the average of the number of a given array?
        int[] array = {1 , 2 , 3 , 4 , 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
        System.out.println(sum);
        int average = sum/array.length;
        int number = 0;
        System.out.println(average);

        for (int i = 0; i < array.length; i++) {
            if(array[i] > average) {
                number = array[i];
                break;
            }
        }
        System.out.println(number);*/

        // Question 2
        /* Write a java program that takes a number as input and print its multiplication table upto 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number*i);
        }*/

        // Question 3
        /* Write a java program to sum values of an array
        int[] arr = {2 , 6 , 8 , 3 , 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);*/

        // Question 4
        /* Write a java program to find maximum and minimum value of an array

        int[] arr = {23 , 112 , 43 , 89 , 77};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        int[] arr = {123 , 112 , 143 , 289 , 177};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

        // Question 5
         Write a java program to seperate 0s on left side and 1s on right side of an array of 0s and 1s in random order

         Approach 1
        int[] arr = {1 , 0 , 0 , 1 , 1 , 0 , 1 , 1 , 0 , 0};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.println("Now array is ");
        System.out.println(Arrays.toString(arr));

        // Approach 2
        int[] arr = {1 , 0 , 0 , 1 , 1 , 0 , 1 , 1 , 0 , 0};
        int left = 0;
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] == 0){
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                ++left;
            }


        }
        System.out.println(Arrays.toString(arr));*/

        // Question 6
        /* Write a java method to find smallest number among three number
        int smallNumber = smallest(10 , 20 , 30);
        System.out.println("Smallest number is " + smallNumber);

        // Question 7
        // Write a java method to print fibonacci series of n terms where n is argument passed by user
        fibonacci(15);

        // Question 8
        // Write a program to find factorial of a number entered by user
         5! = 5*(5-1)*(5-2)*(5-3)*(5-4) = 5*4*3*2*1 = 120
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int x = input.nextInt();
        int factorial = 1;
        if(x == 0 && x == 1){
            factorial = 1;
        }

        for (int i = 0; i < x; i++) {
            factorial*=x-i;
        }
        System.out.println(factorial);*/





    }

    /*static void fibonacci(int x) {
        // 0 , 1 , 1 , 2 , 3 , 5 , 8...
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 2; i < x; i++) {
            c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
    static int smallest(int a , int b , int c){
        int smallest = 0;
        if(a < b && a<c){
            smallest = a;

        } else if(b<a && b<c){
            smallest = b;
        } else {
            smallest = c;
        }
        return smallest;
    }*/
}
