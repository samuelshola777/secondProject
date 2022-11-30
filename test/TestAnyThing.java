import TryingNewThingsTest.TestAnythingTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnyThing {
    TestAnythingTest testAnythingTest;
    @BeforeEach
    public  void startUp(){
        testAnythingTest = new TestAnythingTest();
    }
    @Test
    public void testForLoop(){
        assertEquals(12345, testAnythingTest.printIraiseToI());
    }
//@Test
//    public void testForStar(){
//        assertEquals("******",raiseTwo.printStar());
//}

    @Test
    public void testPalindrome(){
        assertEquals(true, testAnythingTest.createPaledrome());
    }
    @Test
    public void testBinaryNumber(){
        assertEquals(57, testAnythingTest.binaryNumber());
    }
    @Test
    public void testThatMethodCanOnlyTakeValueHigherThan(){
        assertEquals(true, testAnythingTest.collectHigherThanFiveHundred());
    }
    @Test
    public void minusOne(){
        assertEquals(4, testAnythingTest.removeOne());
    }



}
