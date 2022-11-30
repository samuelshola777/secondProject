package CompleteCodingPractise;

public class TimeAndMethodAndThrowException {

    private  int hours;
    private  int minutes;
    private  int seconds;

    public TimeAndMethodAndThrowException(int hours, int minutes, int seconds){
        invalidHour(hours);
            this.hours = hours;

        invalidMinute(minutes);
            this.minutes = minutes;

        invalidSeconds(seconds);
            this.seconds = seconds;

    }


    public void setHours(int hours) {
        invalidHour(hours);
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        invalidMinute(minutes);
        this.minutes = minutes;
    }

    public int getSeconds() {
         return seconds;
    }

    public void setSeconds(int seconds) {
        invalidSeconds(seconds);
            this.seconds = seconds;
    }

    public static void invalidHour(int hours) {

        if (hours > 23 || hours < 0) {

            throw new IllegalStateException("hours not invalid");
        }
    }
        public static void invalidMinute(int minutes){

            if (minutes > 59 || minutes < 0) {

                throw new IllegalStateException("intput minute not invalid");
            }
        }
        public static void invalidSeconds(int seconds){

            if (seconds > 59 || seconds <0 ){

                throw new IllegalStateException("intput second invalid");
        }


    }
    public  String toString(){
        return String.format("%d: %2d : %02d %s", ((hours == 0 || hours == 12)? 12 : hours% 12),
                minutes,seconds, (hours < 12 ? "AM" : "PM"));
    }


}
