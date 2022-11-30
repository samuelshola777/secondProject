package TryingNewThingsTest;

public class TryinToString {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public String toString(){
        return String.format("his name is  %s , his  %d old ",name,age);
    }

    public static void main(String[] args) {

        TryinToString me = new TryinToString();

        me.setName("samuel shola");
        me.setAge(20);

        System.out.println(me.toString());

        

    }
}
