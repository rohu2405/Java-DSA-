package com.nqt.preperation;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        /*
          * Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW).
          A company manager wants to make the production of both types of vehicle according to the given data below:

          1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
          2nd data, Total number of wheels = W
          The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of vehicle");
        int vehicle = input.nextInt();
        System.out.println("Enter the Number of wheels");
        int wheels = input.nextInt();

        int fourWheeler = (wheels - 2 * vehicle)/2;
        if(wheels >= 2 && wheels%2==0 && vehicle < wheels) {
            System.out.println("Number of two wheeler is : " + (vehicle - fourWheeler) +
                    " \n Number of four wheeler is : " + fourWheeler);
        } else{
            System.out.println("Invalid Input");
        }

    }
}
