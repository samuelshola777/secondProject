package Array;

import java.util.ArrayList;

public class ArrayListLargeNumber {
    public static void main(String[] args) {


        int[] myNumArray = {90, 54 , 32, 5, 900, 900, 23 , 9000};

        ArrayList<Integer> rayList = new ArrayList<>();

        int max = rayList.indexOf(0);

        for (int i = 0; i < myNumArray.length; i++) {
            rayList.add(i,myNumArray[i]);



            if (rayList.get(i) > max){
                max = rayList.get(i);
            }
            System.out.print(" "+rayList.get(i));

        }
        System.out.println();
        System.out.println("<<------------------------------------->>");
       System.out.println(" the largest  of all is "+max);

        System.out.println("<<------------------------------------->>");
        for (int i = myNumArray.length -1; i != -1 ; i--) {

            for (int j = 0; j != myNumArray.length; j++) {

                rayList.add(j,myNumArray[i]);

            }

            System.out.print(" "+rayList.get(i));
        }
        System.out.println();
            System.out.println("<<------------------------------------->>");
            System.out.println(" does is element 5 exist?  "+rayList.contains(5));
    }
}
