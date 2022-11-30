package TryingNewThingsTest;

public class BinaryNumber {
    public static void main(String[] args) {

        System.out.println("binary");
        int num = TriangleStarPrint.tryAndCatch();

        int rem;
        int sum = 0;
        int i = 0;

       while (num > 0 ){


            rem = num % 10;
            sum += rem * Math.pow(2,i);
            num = num/10;
            i++;
//             justSpace = num % 10;
//
//             int raise += justSpace * Math.pow(2, i);

        }


        System.out.println(sum);
    }
}
