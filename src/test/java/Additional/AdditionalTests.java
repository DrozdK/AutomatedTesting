package Additional;

import Helpers.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionalTests {

    @Test
    public void additionalMinTest() {
        Assert.assertEquals((Actions.calculator(-2147483648, -2147483648, '+')), "-4294967296");
    }

    @Test
    public void additionalWithAllPositiveNumbersTest() {
        Assert.assertEquals((Actions.calculator(2, 6, '+')), "8");
    }

    @Test
    public void additionalWithFirstNegativeNumberTest() {
        Assert.assertEquals((Actions.calculator(-5, 4, '+')), "-1");
    }

    @Test
    public void additionalWithSecondNegativeNumberTest() {
        Assert.assertEquals((Actions.calculator(8, -3, '+')), "5");
    }

    @Test
    public void additionalWithAllNegativeNumbersTest() {
        Assert.assertEquals((Actions.calculator(-5, -8, '+')), "-13");
    }

    @Test
    public void additionalWithNegativeResultTest() {
        Assert.assertEquals((Actions.calculator(-20, 4, '+')), "-16");
    }

    @Test
    public void additionalMaxTest() {
        Assert.assertEquals((Actions.calculator(2147483647, 2147483647, '+')), "4294967294");
    }
}
