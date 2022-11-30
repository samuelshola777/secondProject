package TryingNewThingsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankAccountTest {

    private  BankAccount bankAccount;
    @BeforeEach
    void setUpA(){
         bankAccount = new BankAccount();
    }
    @Test
    void testIfObjectExist(){
        assertNotNull(bankAccount);
    }
    @Test
    void testIfBanKHasBalance(){
        assertNotNull(bankAccount.getBankBalance());
    }
    @Test
    void testIfBankCanSaveMoney(){
        bankAccount.saveInToBank(6000);
        assertEquals(6000,bankAccount.getBankBalance());
    }
    @Test
    void testThatWeCanWithdrawFromBankAccounBalance(){
        bankAccount.saveInToBank(6000);
        bankAccount.withdrawFromBankBalance(3000);
        assertEquals(3000,bankAccount.getBankBalance());
    }



}
