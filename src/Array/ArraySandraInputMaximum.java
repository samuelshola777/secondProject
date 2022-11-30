package Array;

import java.util.Scanner;

public class ArraySandraInputMaximum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("enter length of array\r ");

        int length = input.nextInt();

        int [] samArray = new int[length];

        System.out.println("enter element value that will be in the array\r");

        for (int counter = 0 ; counter < samArray.length ; counter++){
           samArray[counter] = input.nextInt();

        System.out.println(samArray[counter]);
        }



    }

}


