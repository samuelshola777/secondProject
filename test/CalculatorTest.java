import SamuelSholaTest.TestCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    TestCalculator calculator;
    @BeforeEach
    public void setup(){
         calculator  = new TestCalculator();
    }

    @Test
    public void createObjectAuto(){
    TestCalculator calculator  = new TestCalculator();
    assertNotNull(calculator);
}
    @Test
    public void testCalculatorCanAddTwoNumber(){
    TestCalculator calculator  = new TestCalculator();
  // calculator.add(4, 5);
        assertEquals(9,calculator.add(4 ,5));
}
    @Test
    public void testThatCalculatorCanSubtract(){

        assertEquals(4,calculator.subtractTwoNumber(6,2));
}
    @Test
    public void testThatCalculatorCanDivideTwoNumber(){

        assertEquals(2, calculator.divide(6,3));
    }


}

