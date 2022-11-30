package TryingNewThingsTest;

public class ContructorOverLoad {



    private int hour;
    private int minute;
    private int second;
    public ContructorOverLoad(){}
    public ContructorOverLoad(ContructorOverLoad contructorOverLoad){}

    public ContructorOverLoad(int hour, int minute, int second) {
        this.hour = hour;
        if (hour < 0 || hour >= 60){
            throw new IllegalArgumentException ("hour out of bound");
        }
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute out of bound");
        }
        this.minute = minute;
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("minute out of bound");

        }
        this.second = second;
    }
    public ContructorOverLoad(int hour){
    this.hour = hour;
        if (hour < 0 || hour >= 60){
            throw new IllegalArgumentException ("hour out of bound");
        }
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute out of bound");
        }
    }
    public ContructorOverLoad (int hour, int minute){
        this.hour = hour;
        if (hour < 0 || hour >= 60){
            throw new IllegalArgumentException ("hour out of bound");
        }
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute out of bound");
        }
        this.minute = minute;
    }
    public void setHour(int hour){
        if (hour < 0 || hour >24){
            throw new IllegalArgumentException("hour out of bound");
        }
        this.hour = hour;
    }
    public void setMinute(int minute){
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute out of bound ");
        }
    }
    public void setSecond(int second){
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("seconds out of bound");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String toUniversalString(){
        return String.format("%02d : %02d : %02d", getHour(), getMinute(), getSecond());

    }
    public String toString(){
        return String.format("%d: %02d : %02d",((getHour() == 0 ||
                        getHour() == 12)
                ? 12 : getHour() % 12),  getMinute(),
                getSecond(),(getHour() < 12 ? "AM" : "PM"));
    }
}
