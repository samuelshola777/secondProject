package Array;

public class TwoMaximumArray {

   public static int twoMaximum(int [] array) {
    int max1 = array[0];
    int max2 = array[1];

    for (int i = 0; i < array.length; i++) {
        if(array[i] > max1){
            max2 = max1;
            max1 = array[i];
        }
        if(array[i] < max1){
            if(array[i] > max2){
                max2 = array[i];
            }
        }

    }
    System.out.println(" the first maximum "+max1);
    System.out.println(" the second maximum  "+max2);
       System.out.println("the total sum of the two maximum is "+(max1 + max2));
       return max2;
}
    public static void main(String[] args) {

        int[] numb = {1, 2, 3, 4, 5, 6, 90, 70};

        twoMaximum(numb);

    }
}
