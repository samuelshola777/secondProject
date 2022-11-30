package Array;

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        String [] names = {"samuel", "boneshaker" , "shola", "paul", "life saver"};
        ArrayList<String> reverseArraylist = new ArrayList<>();


      for (int i = names.length-1; i > -1; i--) {

          for (int j = 0; j < names.length; j++) {
              reverseArraylist.add(j, names[i]);
          }
          System.out.print(" "+reverseArraylist.get(i));
      }

//          for (int p = 0; p < reverseArraylist.size(); p++) {
//              System.out.println(p + " " + reverseArraylist.get(p) + " ,");
//
//          }














































//        for (int counter = 1;   counter < names.length; counter++){
//            for (int counter1 = 0 ; counter1 < counter ; counter1--){
//
//                names[counter1] = names[counter];
//
//            }
//
//
//        System.out.print(names[counter]);
//        }
//
//        for (int i = names.length-1 ; i > -1 ; i--) {
//           // System.out.print(" "+names[i]);
//            for (int j = 0; j < names.length-1; j++) {
//
//               // System.out.println(i);;
//                System.out.print("ssaa "+j);
//           // reverseArraylist.add(i,names[i]);
//            }
//           // System.out.println(reverseArraylist.get(i));
//        }

    }
}
