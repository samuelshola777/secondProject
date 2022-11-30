package TryingNewThingsTest;

public class Palindrome {
    public static void main(String[] args) {

        String number = "12321";
boolean boneshaker = false;
        String justNum = "";

        for (int i = number.length()-1 ; i > 0 -1; i--) {

         justNum +=   number.charAt(i) ;
        }
        System.out.println(justNum);

        if (justNum.equals(number)) {
            boneshaker= true;
        }
        System.out.println(boneshaker);

    }



}
