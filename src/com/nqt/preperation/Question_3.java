package com.nqt.preperation;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        /*
          Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable.
          The task is to find the minimum number of ‘’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘’ and ‘#’ are equal. The ‘’ and ‘#’ can be at any position in the string.
          Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

          (*>#): positive integer
          (#>*): negative integer
          (#=*): 0
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = input.nextLine();
        int numOfStar = 0;
        int numOfHash = 0;

        if(text.contains("*") || text.contains("#")){
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == '*'){
                   numOfStar++;
               } else if(text.charAt(i) == '#'){
                   numOfHash++;
              }
            }
        } else{
            System.out.println("Invalid String");
        }

        System.out.println(numOfStar-numOfHash);




    }
}
