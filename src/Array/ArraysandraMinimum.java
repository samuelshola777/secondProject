package Array;

import java.util.Arrays;
import java.util.List;

public class ArraysandraMinimum {
    public static void main(String[] args) {

        int [] arraySamuel = {34, 64, 32,  87 , 4};

        int minimum = arraySamuel[0];

        for (int counter = 0 ; counter < arraySamuel.length; counter++){

            if (arraySamuel[counter] < minimum){
                minimum = arraySamuel[counter];

            }
        }
        System.out.println("theh minimummy value is  "+minimum);


































//        List<Integer> arrayList = Arrays.asList(57, 86, 34, 45);
//        Integer minimum = arrayList;
//        for (int i = 0; i < arrayList.size(); i++){
//            if (arrayList.get(i) != minimum) {
//                minimum = arrayList.get(i);
//            }
//        }
//        System.out.println("The minimum value is " + minimum);
//
//


//        int minimum = 0 ;
//
//        int [] array = {57, 86, 34, 24, 45 };
//
//        for (int counter = 0; counter < array.length ; counter++) {
//           if (array[counter] != minimum ){
//               minimum = array[counter];
//            }
//        }
//        System.out.println(minimum);

    }

}
