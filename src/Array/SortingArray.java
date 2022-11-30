package Array;

public class SortingArray {
    public static void main(String[] args) {
int [] array = {2, 5, 8, 7 ,6 ,9, 4, 1, 10, 3};


for (int counter = 0; counter < array.length; counter++){
    System.out.println(array[counter]);
}
int  emptyArray = 0;

for (int counter1 = 0 ; counter1 < array.length; counter1++){

    for (int counter2 = counter1 ; counter2 < array.length ; counter2++){

        if (array[counter1] > array[counter2]){

          emptyArray =  array[counter1] ;

          array[counter1] = array[counter2];

         array[counter2]= emptyArray ;

        }


    }
}
    for (int printingCounter = 0 ; printingCounter < array.length; printingCounter++ ){
        System.out.println("ascending  array "+array[printingCounter]);
    }
//    int decendingArray = 0;
//
//    for (int goingThroughCounter = 0; goingThroughCounter < array.length; goingThroughCounter++){
//
//        for (int assigningCounter = goingThroughCounter; assigningCounter < array.length; assigningCounter++){
//
//            if (array[goingThroughCounter] > array[assigningCounter]){
//
//                decendingArray = array[goingThroughCounter];
//
//                array[goingThroughCounter] = array[assigningCounter];
//
//                array[goingThroughCounter] = decendingArray;
//            }
//        }
//
//    }
//        System.out.println("<<--------------------------------------------->>");
//
//for (int printingCounter = 0 ; printingCounter < array.length ; printingCounter++){
//    System.out.println("descending array  "+array[printingCounter]);
//}
    }
}
