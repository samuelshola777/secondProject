package Array;

import java.util.Scanner;

public class MultidymentionArray {
    public static void main(String[] args) {
        
        int [][] samuelShola = {{90, 45, 65},{45, 23 ,23},{23, 57, 89}};


        for (int i = 0; i < samuelShola.length; i++) {
            for (int j = 0; j < samuelShola[0].length; j++) {
                System.out.print(samuelShola[i][j] + " ");

            }
            System.out.println();
            
        }
        Scanner input = new Scanner(System.in);
             System.out.println("please enter number of row ");
                 int row = input.nextInt();

                     System.out.println(" please enter number of colum ");
                         int colum = input.nextInt();

                             int[][] boneshaker = new int[row][colum];

                                 System.out.println(boneshaker.toString());

    }
}
