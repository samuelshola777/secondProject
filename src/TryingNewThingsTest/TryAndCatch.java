package TryingNewThingsTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
while (true) {

    Scanner input = new Scanner(System.in);
    int count = 0;

    try {
        System.out.println("please enter a number ");
        int tryNumber = input.nextInt();

        break;
    } catch (InputMismatchException e) {
        System.out.println("you've entered an invalid input");
       // System.out.println(e.getMessage());


    }
}

    }
}