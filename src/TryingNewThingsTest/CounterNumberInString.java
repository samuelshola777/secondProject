package TryingNewThingsTest;

import java.util.Scanner;

public class CounterNumberInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number and  strings together");
        String sentence = scanner.nextLine();
int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))){
                counter++;
            }

        }
        System.out.println("number of int is "+counter);

    }
    public static boolean inANumber(char value) {
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        boolean isANumber = false;
        for (char n : number){
            if (value == n) {
                isANumber = true;
            }
        }
        return isANumber;
    }


}
