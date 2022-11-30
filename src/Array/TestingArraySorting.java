package Array;

public class TestingArraySorting {
    public static void main(String[] args) {

    int [] array = {40, 64, 89, 23, 98 , 34, 65, 6};
    int  receivingArray = 0 ;
    for (int counter1 = 0; counter1 < array.length; counter1++){
        for (int counter2 = 0 ; counter2 < array.length; counter2++){

       if (array[counter1] < array[counter2]){
           receivingArray = array[counter1];
           array[counter1] = array[counter2];
           array[counter2] = receivingArray;
       }

        }

    }

    for (int counter3 = 0 ; counter3 < array.length; counter3++){
        System.out.println(array[counter3]);

    }

    }

}
