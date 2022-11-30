package TryingNewThingsTest;

public class Time1 {
    private int hour;
    private int minute;
    private int second;


    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour >= 24 ){
            throw new IllegalArgumentException("hour our of range");

        }else {
            this.hour = hour;
        }if (minute < 0 || minute >= 60 ){
            throw new IllegalArgumentException("minute  our of range");

        }else {
            this.minute = minute;
        }if (second < 0 || second >= 60 ){
            throw new IllegalArgumentException("seconds  our of range");

        }else {
            this.second = second;
        }

    }
    public  String toUniversalString(){
        return String.format("%02d : %02d : %02d", hour , minute, second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12)? 12 : hour%12), minute, second, (hour < 12 ? "AM":"PM"));
    }


    public static void main(String[] args) {
     Time1 time = new Time1();

        System.out.println(time.toUniversalString());
    }
}
