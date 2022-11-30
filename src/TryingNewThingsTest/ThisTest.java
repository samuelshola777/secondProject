package TryingNewThingsTest;

public class ThisTest {
    public static void main(String[] args) {
        SimpleTime bone = new SimpleTime(15, 30, 19);
        System.out.println(bone.buildstring());
    }
}
    class SimpleTime{
        private int hour;
        private int Minute;
        private int second;

        public SimpleTime(int hour, int minute, int second){
            this.hour = hour;
            this.Minute = minute;
            this.second = second;
        }
        public  String buildstring(){
            return String.format("%24s: %s%n%24s: %s", "this.toUniversalString() ",
                    this.toUniversalString(), "toUniversalString()", toUniversalString());
        }
        public String toUniversalString(){
            return String.format("%02d : %02d : %02d", this.hour, this.Minute, this.second);
        }
    }

