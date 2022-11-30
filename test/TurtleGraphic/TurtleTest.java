package TurtleGraphic;

import Oop.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle turtle;
    @BeforeEach
    public void startAllTestWith(){

        turtle = new Turtle();
    }
    @Test
    public void IfTurtleExist(){
        assertNotNull(turtle);
    }
@Test
    public void testIfTurtleCanMovePenUp(){
        turtle.penUp();
        assertTrue(turtle.isPenUp());

}
}
