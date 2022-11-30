package TryingNewThingsTest;

import java.util.Scanner;

public class AccountClass {

    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public void makeDeposit(double depositAmount) {
        if (depositAmount < balance) {
            depositAmount = balance - depositAmount;
        } else {
            System.out.println("please make some deposit : insufficient funds ");
        }

    }

    public void deposit(double amountDeposit) {
        if (amountDeposit > 0.0) {
            balance = amountDeposit + balance;
        } else {
            System.out.println("you have entered an invalid amount : please make some deposit");
        }

    }

    public static int intTryAndCatch() {
        Scanner input = new Scanner(System.in);
        int boneshaker = 0;
        while (true) {
            try {
                boneshaker = Integer.parseInt(input.next());
                break;
            } catch (IllegalArgumentException chioma) {
                System.out.println("your entered a wrong input ");
            }
        }
            return boneshaker;




    }
    public static String stringTryAndCatch() {
        Scanner scanner = new Scanner(System.in);
        String word = " ";
        while (true){
        try {
            word = scanner.nextLine();
            break;
        } catch (IllegalArgumentException smile) {
            System.out.println("you entered a wrong input ");
        }
    }
        return word;
    }

}