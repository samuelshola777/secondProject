package CompleteCodingPractise;

import org.junit.jupiter.api.Test;


public class TimeAndMethodAndThrowExceptionTest {

    @Test
    public void useConstructor() {
        TimeAndMethodAndThrowException time = new TimeAndMethodAndThrowException(23, 59, 59);
toString();
    }
    @Test
    public void returnTimeValue(){
        TimeAndMethodAndThrowException time = new TimeAndMethodAndThrowException(23, 59, 59);
        time.getHours();
        time.toString();

    }
}