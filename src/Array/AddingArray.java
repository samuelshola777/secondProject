package Array;

import java.util.Scanner;

public class AddingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number length ");
        int number = input.nextInt();

        System.out.println(" your total value is  "+addingUp(number));
    }
    public static int addingUp(int number) {
        int sum = 0;
    Scanner input = new Scanner(System.in);


        int[] bones = new int[number+1];
        for (int i = 1; i < number+1 ; i++) {
            System.out.println("please enter your sum up value  "+i);
            bones[i] = input.nextInt();

            sum = bones[i] + sum;
            System.out.println(sum  +" at counter  "+i);
//Integer.parseInt(("the total sum is  "))
        }
        return   sum;

    }
}