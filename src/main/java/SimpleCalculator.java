import Helpers.Actions;
import Helpers.TextHelper;

public class SimpleCalculator {

    public static void main(String[] args) {
            int fistNum = Actions.getFirstNumber();
            int secondNum = Actions.getSecondNumber();
            char operation = Actions.getOperation();
            double result = Actions.calculator(fistNum, secondNum, operation);
            System.out.println(TextHelper.RESULT_TEXT.getText() + result);
    }
}
