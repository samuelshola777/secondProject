package TryingNewThingsTest;

import java.util.Scanner;

public class AccountClassTest {
public static void main(String[] args) {

AccountClass account1 = new AccountClass();


displayAccountClass(account1);

    }

    public static void displayAccountClass(AccountClass accountUser){
        Scanner string = new Scanner(System.in);
        Scanner bone = new Scanner(System.in);

        System.out.println("hi \n" +
                "welcome to wunmi mini bank  ");
        try {


            System.out.println("please enter your create a user name\n ");
         String boneshaker = string.nextLine();
         accountUser.setCustomerName(boneshaker);


        }catch (IllegalArgumentException smile){
            System.out.println("you input a wrong input ");
        }
        System.out.println();
        System.out.println("enter your mobile number ");
                accountUser.setCustomerPhoneNumber(bone.next());
    }

}
