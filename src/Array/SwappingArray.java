package Array;

import java.util.Arrays;

public class SwappingArray {


    public static int[] swap2number(int[] num) {
        int take = num[0];
        num[0] = num[1];
        num[1] = take;
        return num;
    }

    public static void main(String[] args) {
        int[] num = {1,2};
        System.out.println(Arrays.toString(swap2number(num)));
}
}