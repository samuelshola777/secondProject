package Array;

public class MaximumArray {
    public static void main(String[] args) {
        int[] array = {45, 32, 43, 42, 48, 49};
        int maximum = array[0];

        for (int counter = 0 ; counter < array.length; counter++){

            if (array[counter] > counter){
                maximum = array[counter];
            }

        }
        System.out.println(maximum);
    }
}
