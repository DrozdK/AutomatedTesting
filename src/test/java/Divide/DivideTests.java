package Divide;

import Helpers.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideTests {

    @Test
    public void divideMinTest() {
        Assert.assertEquals((Actions.calculator(-2147483648, -2147483648, '/')), "1");
    }

    @Test
    public void divideWithAllPositiveNumbersTest() {
        Assert.assertEquals((Actions.calculator(55, 5, '/')), "11");
    }

    @Test
    public void divideWithFirstPositiveNumberTest() {
        Assert.assertEquals((Actions.calculator(36, -6, '/')), "-6");
    }

    @Test
    public void divideWithSecondPositiveNumberTest() {
        Assert.assertEquals((Actions.calculator(-36, 6, '/')), "-6");
    }

    @Test
    public void divideWithAllNegativeNumbersTest() {
        Assert.assertEquals((Actions.calculator(-36, -6, '/')), "6");
    }

    @Test
    public void divideWithNotIntegerResultTest() {
        Assert.assertEquals((Actions.calculator(60, 33, '/')), "1.818181818181818181818181818181818");
    }

    @Test
    public void divideMaxTest() {
        Assert.assertEquals((Actions.calculator(2147483647, 2147483647, '/')), "1");
    }
}
