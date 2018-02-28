import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;



public class AdditionTest {

    private Addition addition;

    @Before
    public void setup() {
        addition = new Addition();
    }

    @Test
    public void canaryTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testTheSumWithTwoInts() {
        Assert.assertEquals(addition.sum(10,20),30);
        Assert.assertEquals(addition.sum(15,23),38);
    }

    @Test
    public void testTheSumWithTwoDoubles() {
        Assert.assertEquals(addition.sum(10.24,20.11),30.35,0);
        Assert.assertEquals(addition.sum(5.215,54.154),59.369,0);
    }

    @Test
    public void testTheSumWithTwoLists() {
        Assert.assertEquals(addition.sum(Arrays.asList(1, 2),Arrays.asList(3, 4)),Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(addition.sum(Arrays.asList(7, 5, 5), Arrays.asList(7, 5, 5)), Arrays.asList(7,5,5,7,5,5));
    }

    @Test
    public void testTheSumWithTwoStrings() {
        String result = addition.sum("abc", "def");
        Assert.assertEquals(result,"abcdef");
    }

}