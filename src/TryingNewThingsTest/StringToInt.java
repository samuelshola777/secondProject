package TryingNewThingsTest;

import java.util.Scanner;

public class StringToInt {



    public static String stringConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any word and i'll you an int value ");
        String word =  scanner.nextLine();
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String nWord = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.toUpperCase().charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if(letter == alphabet[j]){
                    nWord += j;
                    break;
                }
            }

        }
        return nWord;
    }

    public static void main(String[] args) {
        System.out.println(stringConverter());
    }
}
