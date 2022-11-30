package TryingNewThingsTest;

public class TheToStringMethod {
    private int studentId;
    private String studentName;

    public TheToStringMethod(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
public String toString(){
        return studentId+" "+ studentName;
}

    public static void main(String[] args) {

        TheToStringMethod s1 = new TheToStringMethod(1,"samuel shola");
        TheToStringMethod s2 = new TheToStringMethod(2,"boneshaker");

        System.out.println(s1);
        System.out.println(" student 2 is "+s2);


    }
}
