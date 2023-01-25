package Multiply;

import Helpers.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTests {

    @Test
    public void multiplicationMinTest() {
        Assert.assertEquals((Actions.calculator(-2147483648, -2147483648, '*')), "4611686018427387904");
    }

    @Test
    public void multiplicationWithAllPositiveNumbersTest() {
        Assert.assertEquals((Actions.calculator(7, 7, '*')), "49");
    }

    @Test
    public void multiplicationWithFirstPositiveNumberTest() {
        Assert.assertEquals((Actions.calculator(7, -7, '*')), "-49");
    }

    @Test
    public void multiplicationWithSecondPositiveNumberTest() {
        Assert.assertEquals((Actions.calculator(-7, 7, '*')), "-49");
    }

    @Test
    public void multiplicationWithAllNegativeNumbersTest() {
        Assert.assertEquals((Actions.calculator(-7, -7, '*')), "49");
    }

    @Test
    public void multiplicationMaxTest() {
        Assert.assertEquals((Actions.calculator(2147483647, 2147483647, '*')), "4611686014132420609");
    }

}
