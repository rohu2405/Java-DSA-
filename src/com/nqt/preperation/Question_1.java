package com.nqt.preperation;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        // Question - 1;
        /*
          He first turns and travels 10 units of distance
          His second turn is upward for 20 units
          Third turn is to the left for 30 units
          Fourth turn is the downward for 40 units
          Fifth turn is to the right(again) for 50 units
          … And thus he travels, every time increasing the travel distance by 10 units.


          Case 1
          Input : 3
          Expected Output :-20 20
          Case 2
          Input: 4
          Expected Output: -20 -20
          Case 3
          Input : 5
          Expected Output : 30 -20
          Case 4
          Input : 7
          Expected Output : 90 -20
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of steps");
        int steps = input.nextInt();

        int x = 0;
        int y = 0;
        int distance = 10;
        char direction = 'R';

        while(steps>0){
            switch(direction){
                case 'R':
                    x = x+distance;
                    distance+=10;
                    direction = 'U';
                    break;

                case 'U':
                    y = y+distance;
                    distance+=10;
                    direction = 'L';
                    break;

                case 'L':
                    x = x-distance;
                    distance+=10;
                    direction = 'D';
                    break;

                case 'D':
                    y = y-distance;
                    distance+=10;
                    direction = 'A';
                    break;

                case 'A':
                    x = x+distance;
                    distance+=10;
                    direction = 'R';
                    break;







            }
            steps--;
        }

        System.out.println(x + " " + y);
    }
}
