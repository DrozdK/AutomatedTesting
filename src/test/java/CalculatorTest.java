import Helpers.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void additionalTest() {
        Assert.assertEquals((Actions.calculator(5, 8, '+')), 13);
    }

    @Test
    public void substractTestWithPositiveResult() {
        Assert.assertEquals((Actions.calculator(12, 6, '-')), 6);
    }

    @Test
    public void substractTestWithNegativeResult() {
        Assert.assertEquals((Actions.calculator(10, 14, '-')), -4);
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals((Actions.calculator(7, 7, '*')), 49);
    }

    @Test
    public void divideTest() {
        Assert.assertEquals((Actions.calculator(55, 5, '/')), 11);
    }
}
