package florence;

public class MyAccount {
    private String name;
    private double balance;

    private String dateOfBirth;
    private double deposit;
    private String Location;
    private double withdraw;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        if( deposit > 0.00){
            balance = deposit + balance;
        }
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {

        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getWithdraw() {
        if(withdraw > balance){
            withdraw =balance;
            System.out.println("insufficient fund");
        }
        else if (withdraw < balance){
            withdraw = balance- withdraw;
        }

        return withdraw;

    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
}
