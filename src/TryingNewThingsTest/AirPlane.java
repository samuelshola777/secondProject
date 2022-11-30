package TryingNewThingsTest;

public class AirPlane {

    private boolean powerStatus;
    private int currentMotion;
    private int currentGear;
    private int planeSpeed;

    public boolean getPowerStatus() {
        return powerStatus;
    }

    public boolean PowerOnPlane() {
        if (!powerStatus){
            powerStatus = true;
        }
        return powerStatus;
    }

    public int getCurrentMotion() {
        if (powerStatus == true){
            currentMotion = 2;
        }if (currentMotion == 2){
            currentGear = 1;
        }if(currentGear == 1){
            currentMotion = 3;
        }if (currentMotion == 3){
            currentGear = 2;
        }if (currentGear == 2){
            currentMotion = 4;
        }if (currentMotion == 4){
            currentGear = 3;
        }if (currentGear == 3){
            currentMotion = 5;
        }
        return currentMotion;
    }

    public int getCurrectGear() {
        if (powerStatus == true && currentMotion == 2){
         currentGear = 1;
        }
        return currentGear;
    }

    public int getPlaneSpeed() {
        return planeSpeed;
    }

    public int setPlaneSpeed() {
        if (currentMotion == 2 && currentGear == 1){
            planeSpeed = 1;
        }if (currentMotion == 3 && currentGear == 2){
            planeSpeed = 2;
        }if (currentMotion == 4 && currentGear == 3){
            planeSpeed = 3;
        }if (currentMotion == 5 && currentGear == 4){
            planeSpeed = 4;
        }if (currentMotion == 6 && currentGear == 5){
            planeSpeed = 5;
        }
        return planeSpeed;
    }
}
