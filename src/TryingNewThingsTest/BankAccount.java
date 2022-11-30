package TryingNewThingsTest;

public class BankAccount {

private int bankBalance;


public void saveInToBank(int amountDeposit){
    bankBalance += amountDeposit;
}
public void withdrawFromBankBalance(int amountWithDraw){
    bankBalance -= amountWithDraw;
}
    public int getBankBalance() {
        return bankBalance;
    }
}
