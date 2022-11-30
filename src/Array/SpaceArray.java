package Array;

public class SpaceArray {
    public static void main(String[] args) {


        int[][] smile = {{1, 0,1},{1 , 0, 1},{0, 1, 0},
                {1, 0, 1}
                ,{1, 0, 1},
                {1, 0, 1},{1, 0, 1}};

        for (int i = 0; i < smile.length; i++) {
            for (int j = 0; j < smile[i].length; j++) {
                if (smile[i][j] == 1){
                    System.out.printf("%2s", "*");
                }else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.println();
        }
//        for (int i = 0; i < smile.length; i++) {
//            for (int j = 0; j < smile.length; j++) {
//                System.out.println(smile[i][j]);
//            }
//        }

    }


}
