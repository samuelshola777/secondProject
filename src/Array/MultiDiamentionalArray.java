package Array;

import java.util.Arrays;

public class MultiDiamentionalArray {
    public static void main(String[] args) {





int[][] boneshaker = new int[9][9];
        for (int i = 0; i< boneshaker.length; i++) {
            for (int j = 0; j < boneshaker[i].length; j++) {
                int value = i + j + 1;
                if (value > 9) {
                    value = value % 9;
                }
                boneshaker[i][j] = value;




//                boneshaker[i][j] = i;
//                boneshaker[i][j] = j;

//           boneshaker = boneshaker[i];
//            System.out.println(Arrays.toString(boneshaker[i]));
            }
            System.out.print(Arrays.toString(boneshaker[i]));
            System.out.println();
        }
      //  System.out.println(boneshaker[0][6]);
    }
}
