package TryingNewThingsTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleStarPrint {

    public static void main(String[] args) {


        System.out.println("enter number  ");
      int   star = TriangleStarPrint.tryAndCatch();
        for (int i = 0; i < star ; i++) {

            for (int j = 0; j < i; j++) {


                System.out.print( "samuelShola");

            }
            System.out.println();
        }


    }
    public static int tryAndCatch(){
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                 num = Integer.parseInt(scanner.next());
                break;
            } catch (IllegalArgumentException s) {
                System.out.println("you've entered a wrong input  ");
            }catch (InputMismatchException v){
                System.out.println("invalid input  ");
            }
        }
        return num;
    }

}
