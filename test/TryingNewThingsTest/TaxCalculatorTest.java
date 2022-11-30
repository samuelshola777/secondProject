package TryingNewThingsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    private Citiizen mathias;
    private Citiizen dewunmi;
    private Citiizen deola;
    TaxCalculator taxCalculator;
    @BeforeEach
    @Test
   public void setUp() {
      taxCalculator  = new TaxCalculator();
      mathias = new Citiizen();
      mathias.setLastName("mathia");
      mathias.setFIrstName("boneshaker");
      BigDecimal salary = new BigDecimal(1700);
      mathias.setEarning(salary);

      BigDecimal money = new BigDecimal(2000);
      dewunmi.setEarning(money);
      dewunmi.setFIrstName("adewunmi");


      BigDecimal saved = new BigDecimal(6000);

      Citiizen adeola = new Citiizen("adeola"," adekunle",saved );

    }
    @Test
    public void CalculateTax(){
        BigDecimal mathiasTax = TaxCalculator.calculatyeTax(mathias);
        assertEquals(2550, mathiasTax.intValue() );

        BigDecimal
    }




}
