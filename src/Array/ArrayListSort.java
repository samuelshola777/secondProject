package Array;

import java.util.ArrayList;

public class ArrayListSort {
    public static void main(String[] args) {

        int[] samArray = {78, 90, 99, 22, 9, 1, 22};

        ArrayList<Integer> boneArraylist = new ArrayList<>();
        int receive = 0;

        for (int i = 0; i < samArray.length; i++) {
            for (int j = 0; j < samArray.length; j++) {
                if (samArray[i] > samArray[j]){

                     receive = samArray[i];
                    samArray[i] = samArray[j];
                    samArray[j] = receive;


                }

            }
            
        }
//        for (int i = 0; i < samArray.length; i++) {
//            System.out.println(samArray[i]);
//        }
        

        for (int i = 0; i < samArray.length; i++) {
            boneArraylist.add(i, samArray[i]);
        }
        for (int i = 0; i < samArray.length; i++) {
            System.out.print(" "+boneArraylist.get(i));
        }

    }
}
