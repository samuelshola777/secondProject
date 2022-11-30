package TryingNewThingsTest;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        displayTime("After time objec is created ", time);
        System.out.println();


        time.setTime(21, 34, 42);
        displayTime("After calling setTime ", time);
        System.out.println();


        try {
            time.setTime(99, 99, 99);
        }catch (IllegalArgumentException sm) {
            System.out.printf("Exception : %s%n%n", sm.getMessage());


            displayTime("After calling setTime with invalid value ", time);
        }





    }
    private static  void displayTime(String header, Time1 t){
        System.out.printf("%s%n Universal time: %s%nStandard time : %s%n ",
                header, t.toUniversalString(), t.toString());
    }
}
