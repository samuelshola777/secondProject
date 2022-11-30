package Array;

import java.util.Scanner;

public class InputingArray {
    public static void main(String[] args) {
        int receivingValue = 0;

        Scanner input = new Scanner(System.in);
            System.out.println("please the length you  ant the array to be\r");
               int length = input.nextInt();
                   int[] samArray = new int[length];

                     System.out.println("please input the value to in the array");

        for (int counter = 0; counter < samArray.length; counter++){
                 samArray[counter] = input.nextInt();
                 }

                for (int counter = 0 ;counter < samArray.length; counter++){
                         System.out.println("take your input Array  "+ samArray[counter]);
                    }
                    for (int counter = 0 ; counter < samArray.length; counter++){

                        for (int counter2 = counter ; counter2 < samArray.length; counter2++){

                            if (samArray[counter] > samArray[counter2]){

                                    receivingValue = samArray[counter];

                                     samArray[counter] = samArray[counter2];

                                         samArray[counter2] = receivingValue;
                        }
                    }


                    }
        System.out.println("<<---------------------------------------------------------------------------------->>");
            for (int counter = 0 ;counter < samArray.length; counter++){
                    System.out.println("take your array well arranged  "+ samArray[counter]);
                    }
                    }
                    }
