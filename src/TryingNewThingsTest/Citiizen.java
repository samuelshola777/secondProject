package TryingNewThingsTest;

import java.math.BigDecimal;

public class Citiizen {
private  String FIrstName;
private String lastName;
private BigDecimal earning;

    public Citiizen(String FIrstName, String lastName, BigDecimal earning) {
        this.FIrstName = FIrstName;
        this.lastName = lastName;
        this.earning = earning;
    }

    public Citiizen(){}

    public String getFIrstName() {
        return FIrstName;
    }

    public void setFIrstName(String FIrstName) {
        this.FIrstName = FIrstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getEarning() {
        return earning;
    }

    public void setEarning(BigDecimal earning) {
        this.earning = earning;
    }
}
