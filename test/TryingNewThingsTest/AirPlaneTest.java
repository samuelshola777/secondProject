package TryingNewThingsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AirPlaneTest {
    AirPlane plane;

    @BeforeEach
    void setUp() {
        plane = new AirPlane();
    }

    @Test
    void testThatPlaneExist() {
        assertNotNull(plane);
    }
    @Test
    void checkPowerStatus(){
        assertEquals(false, plane.getPowerStatus());
    }
    @Test
    void powerOnPlane(){
        assertEquals(true, plane.PowerOnPlane());
    }
    @Test
    void testThatCanHaveMotion(){
        assertEquals(true, plane.PowerOnPlane());
        assertEquals(2, plane.getCurrentMotion());
    }
    @Test
    void testThatCanHaveGear(){
        assertEquals(true, plane.PowerOnPlane());
        assertEquals(2, plane.getCurrentMotion());
        assertEquals(1,plane.getCurrectGear());
    }

    @Test
    void testThatPlanCanHaveSpeech(){
        powerOnPlane();
       plane.getCurrentMotion();
       plane.getCurrectGear();
       assertEquals(1,  plane.setPlaneSpeed());
    }
    


}
