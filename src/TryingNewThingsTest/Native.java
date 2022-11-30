package TryingNewThingsTest;

public class Native {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;


    public Native (Human human){
        firstName = human.getFirstName();
        lastName = human.getLastName();
        phoneNumber = human.getPhoneNumber();
        address = human.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Human human = new Human();
        Native samuel = new Native(human);

        samuel.setFirstName("Shola");


    }

}
