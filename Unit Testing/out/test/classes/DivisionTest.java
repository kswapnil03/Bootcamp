import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

     private static Division division;



    @BeforeClass
    public static void setup() {
        division = new Division();
    }

    @Test (expected = ArithmeticException.class)
    public void testDivideByZero() {
        division.divideByZero(5);
    }

}
