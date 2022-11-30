package TryingNewThingsTest;

public class AutoBike {

    private static int fuelGage;
    private  static int gear;
    private static boolean powerStatus;
    private static boolean turnOn;
    private static int speed;
    public AutoBike(){}

    public AutoBike(boolean powerStatus) {

        AutoBike.powerStatus = powerStatus;
    }
    public static void setFuelGage(int fuelGage) {
        if (fuelGage > 0) {
            AutoBike.fuelGage = fuelGage;
        }
    }

    public static int getFuelGage() {
        return fuelGage;
    }
       public static int getGear() {
        return gear;
    }

    public static void setSpeed(boolean powerStatus ) {
        if (powerStatus){
            gear = 1;
        }
        for (int i = gear; i <= 5 ; i++) {
            gear = i;

            speed = i * 2 ;

        }
//        AutoBike.powerStatus = powerMode;
//        AutoBike.gear = gear;
//        AutoBike.speed = speed;
    }
    public static int getSpeed() {
        return speed;
    }

    public static void setTurnOn(boolean powerStatus){
        if (powerStatus == false){
            powerStatus = true;
        }
        AutoBike.powerStatus = powerStatus;
    }
    public static boolean getPowerStatus(){
        return powerStatus;
    }


    public static void main(String[] args) {



        AutoBike.setTurnOn(powerStatus);

        System.out.println();
        System.out.println(AutoBike.getPowerStatus());




    }


}
