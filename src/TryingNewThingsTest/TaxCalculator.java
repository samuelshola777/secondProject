package TryingNewThingsTest;

import java.math.BigDecimal;

public class TaxCalculator {
    private Citiizen citiizen = new Citiizen();
    private final BigDecimal MINIMUM_EARNINH = new  BigDecimal(30000);
    private static final double BASE_TAXI_RATE = 0.15;
    private final  double ADDITIONAL_TAX_RATE = 0.20;

    public static  BigDecimal calculatyeTax(Citiizen citiizen){
        BigDecimal taxiAmount = BigDecimal.ZERO;
        taxiAmount = citiizen.getEarning().multiply(BigDecimal.valueOf(BASE_TAXI_RATE));
     return taxiAmount;
    }
    public static BigDecimal calculateTax(double  earnin){
        BigDecimal smile = BigDecimal.ZERO;
        return smile;

    }


}
