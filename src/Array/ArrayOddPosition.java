package Array;

import java.util.ArrayList;

public class ArrayOddPosition {
    public static void main(String[] args) {

        int [] justarray = {80, 34, 90, 2, 12, 90 ,33, 200};

            ArrayList<Integer>oddNumber = new ArrayList<>();

                ArrayList<Integer>evenNumber = new ArrayList<>();

        for (int i = 0; i < justarray.length; i++) {

           if (i % 2 == 0){
               evenNumber.add(justarray[i]);
           }


           else{
               oddNumber.add(justarray[i]);
            }
        }
        for (int i = 0; i < evenNumber.size(); i++) {
            System.out.println(" even position in the array "+evenNumber.get(i));
        }
        System.out.println("<<--------------------------------->>");
        for (int i = 0; i < oddNumber.size(); i++) {
            System.out.println(" odd position in the array "+oddNumber.get(i));
        }


    }
}
