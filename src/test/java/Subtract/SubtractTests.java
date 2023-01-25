package Subtract;

import Helpers.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractTests {

    @Test
    public void subtractMinTest() {
        Assert.assertEquals((Actions.calculator(-2147483648, -2147483648, '-')), "0");
    }

    @Test
    public void subtractWithPositiveResultTest() {
        Assert.assertEquals((Actions.calculator(12, 6, '-')), "6");
    }

    @Test
    public void subtractWithFirstPositiveNumberTest() {
        Assert.assertEquals((Actions.calculator(7, -10, '-')), "17");
    }

    @Test
    public void subtractWithSecondPositiveNumberTest() {
        Assert.assertEquals((Actions.calculator(-7, 10, '-')), "-17");
    }

    @Test
    public void subtractWithNegativeResultTest() {
        Assert.assertEquals((Actions.calculator(10, 14, '-')), "-4");
    }

    @Test
    public void subtractBoundaryValueTest() {
        Assert.assertEquals((Actions.calculator(2147483647, -2147483648, '-')), "4294967295");
    }

    @Test
    public void subtractMaxTest() {
        Assert.assertEquals((Actions.calculator(2147483647, 2147483647, '-')), "0");
    }
}