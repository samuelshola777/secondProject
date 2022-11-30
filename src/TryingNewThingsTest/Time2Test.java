package TryingNewThingsTest;

public class Time2Test {
    public static void main(String[] args) {

        ContructorOverLoad t1 = new ContructorOverLoad();
        ContructorOverLoad t2 = new ContructorOverLoad(2);
        ContructorOverLoad t3 = new ContructorOverLoad(21,34);
        ContructorOverLoad t4 = new ContructorOverLoad(12,25,42);
        ContructorOverLoad t5 = new ContructorOverLoad(t4);
        try{
            ContructorOverLoad t6 = new ContructorOverLoad(27, 74, 99);
        }
        catch (IllegalArgumentException smile){
            System.out.printf("%nException while initializing t6 : %s%n", smile.getMessage());
        }

        System.out.println("Constructed with:");
         displayTime("t1: all default arguments", t1);
         displayTime("t2: hour specified; default minute and second", t2);
         displayTime("t3: hour and minute specified; default second", t3);
         displayTime("t4: hour, minute and second specified", t4);
         displayTime("t5: Time2 object t4 specified", t5);



    }
    private static void displayTime(String header, ContructorOverLoad t){
        System.out.printf("%s%n  %s%n  %s%n ", header, t.toUniversalString(), t.toString());
    }

}
