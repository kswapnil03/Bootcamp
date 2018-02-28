import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    Subtraction subtraction;

    @Before
    public void setup() {
        subtraction = new Subtraction();
    }

    @Test
    public void subtractTwoInts() {
        Assert.assertEquals(subtraction.subtract(4,5), -1);

    }

    @Test
    public void subtractTwoDoubles() {
        Assert.assertEquals(subtraction.subtract(4.24,5.78), -1.54, 0);

    }

    @Ignore
    @Test
    public void subtractTwoFloats() {
        Assert.assertEquals(subtraction.subtract(8.8f, 7.3f), 1.5f, 0);
    }
}