package ArrayTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstTestOfArray {


        ClassTestArray tryArray;
    @BeforeEach
        public void autoCreatObject(){
        ClassTestArray tryTestArray = new ClassTestArray();



    }

        @Test
        public void createArraySecondClass(){
            ClassTestArray tryTestArray = new ClassTestArray();
           assertNotNull(tryTestArray);

        }

    }

