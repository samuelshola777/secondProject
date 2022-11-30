package florence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class floTest {
   MyAccount myAccount;
   @BeforeEach
   public  void setup(){
      myAccount = new MyAccount();
   }

   @Test
    public void testMyApp(){
      MyAccount myAccount = new MyAccount();
       assertNotNull(myAccount);
   }
   @Test
    public void testToCreateAccountUser(){
       myAccount.setName("SAMUELSHOLA");
       myAccount.setDateOfBirth("01/07/22");
       myAccount.setLocation("yaba");
       assertEquals("SAMUELSHOLA", myAccount.getName());
       assertEquals("yaba",myAccount.getLocation());
       assertEquals("01/07/22",myAccount.getDateOfBirth());

   }
   @Test
   public void testToCheckInitialBalance(){
      myAccount.setBalance(0.00);
      assertEquals(0.00,myAccount.getBalance());
   }
   @Test
   public void testToDeposit(){
      myAccount.setDeposit(243.89);
      assertEquals(243.89,myAccount.getBalance());
   }
   @Test
   public void testToWithdrawn(){
      myAccount.setBalance(850);
      myAccount.setWithdraw(450);
      assertEquals(400,myAccount.getWithdraw());
   }

}
