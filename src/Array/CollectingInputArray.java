package Array;


import java.util.Scanner;

public class CollectingInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int [] bigArray = new int[10];
bigArray[0] = 5;
        System.out.println("enter number of element \r");
       int element = input.nextInt();

       int array [] = new int[element];

        System.out.println("enter the element in the array \r");

        for (int counter = 0 ; counter < element; counter++){

            array[counter] = input.nextInt();
        }
        System.out.println("displaying array elements \r ");
        for (int counter = 0 ; counter < element; counter++){
            System.out.println(array[counter]);
        }

staticArrayMethods.AcsendingSortArray(element);

        }

        }

