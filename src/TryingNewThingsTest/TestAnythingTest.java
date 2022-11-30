package TryingNewThingsTest;

public class TestAnythingTest {
    public int printIraiseToI() {
        int recievce = 0;
        for (int i = 1; i < 6; i++) {
            recievce += i * (int) Math.pow(10, 5 - i);
        }

        return recievce;
    }

    public String printStar() {

        String star = " ";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
        return String.format("%c *");
    }


    public boolean createPaledrome() {
        boolean result = false;

        String trY = "12321";

        String empty = "";

        for (int i = trY.length()-1; i > 0 ; i--) {
         empty +=   trY.charAt(i);

        }
        if (trY.equals(empty)) {

            result  = true;
        }
        return true;
    }
    int mood;
    int raise ;
    int count = 0;
    public int binaryNumber() {


        int  simi = 111001;

        while (simi > 0) {

            mood = simi % 10;

            raise += mood * Math.pow(2, count);

            simi = simi / 10;

            count++;
        }
        return raise;
    }


    public boolean collectHigherThanFiveHundred() {
        int num = 500;
        boolean goat = false;
        if (num >= 500 ){
            goat = true;
        }
        return goat;

    }

    public int removeOne() {
        int minusNum = 1;
        int num = 5;
        return num - minusNum;
    }



}