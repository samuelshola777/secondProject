package Array;

import java.util.Scanner;

public class staticArrayMethods {

    public static int [] AcsendingSortArray(int  arrayNumber){

        Scanner input = new Scanner(System.in);

            int [] justArray =  new int [arrayNumber];

                int sortingVariable = justArray[0];

        System.out.println("please enter the value to store and sort in the array \r");

            for (int counter =  0 ; counter < justArray.length; counter++){

                justArray[counter] = input.nextInt();


        }
        for (int counter1 = 0 ; counter1 < justArray.length ; counter1++)

            for (int counter2 = 0;  counter2 < justArray.length; counter2++ ){

                if (justArray[counter1] > justArray[counter2]){

                    sortingVariable = justArray[counter1];

                        justArray[counter1] = justArray[counter2];

                            justArray[counter2] = sortingVariable;
                }
            }

        for (int counter3 = 0 ; counter3 < justArray.length ; counter3++){

            System.out.println("descending array "+ justArray[counter3]);
            }
                return justArray;
                }


public static int [] descenindSortArray(int  arrayNumber){

        Scanner input = new Scanner(System.in);

            int [] justArray =  new int [arrayNumber];

                 int sortingVariable = justArray[0];

                    System.out.println("please enter the value to store and sort in the array \r");
        for (int counter =  0 ; counter < justArray.length; counter++){
            justArray[counter] = input.nextInt();


        }
        for (int counter1 = 0 ; counter1 < justArray.length ; counter1++)

            for (int counter2 = 0;  counter2 < justArray.length; counter2++ ){

                if (justArray[counter1] < justArray[counter2]){

                    sortingVariable = justArray[counter1];

                        justArray[counter1] = justArray[counter2];

                            justArray[counter2] = sortingVariable;
                }
            }

        for (int counter3 = 0 ; counter3 < justArray.length ; counter3++){

            System.out.println("Ascending array "+ justArray[counter3]);
                    }
                    return justArray;
    }



}
