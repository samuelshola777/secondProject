package Array;

public class ArraySasndraMaximum {
    public static void main(String[] args) {
        int[] array = {60, 87, 45, 78};
        int maximum = array[0];
        for (int counter = 0 ; counter < array.length ; counter++){
            if (array[counter] > maximum){
                maximum = array[counter];

            }
        }
        System.out.println(maximum);


    }
}
