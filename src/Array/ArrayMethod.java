package Array;

import java.util.Scanner;

public class ArrayMethod {
    int sortNumber = 0;
    public static int[] methodArray() {

        Scanner input = new Scanner(System.in);

            System.out.println("please enter array length \r");

                int lengthNumber = input.nextInt();

                    int[] arrayNumber = new int[lengthNumber];

                        System.out.println("please enter value \r");

        for (int counter = 0; counter < arrayNumber.length; counter++) {

            arrayNumber[counter] = input.nextInt();

            }
        for (int i = 0; i < arrayNumber.length; i++) {

            System.out.println("input value at index " + i + " = " + arrayNumber[i]);

        }
return arrayNumber;


 }


  //  sortNumber =  arrayNumber[0];
}
