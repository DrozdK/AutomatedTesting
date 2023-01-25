package Helpers;

import java.util.Scanner;

public class Actions {
    static Scanner sc = new Scanner(System.in);

    public static int getFirstNumber() {
        System.out.println(TextHelper.ENTER_FIRST_NUMBER_TEXT.getText());
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println(TextHelper.INCORRECT_NUMBER_TEXT.getText());
            sc.next();
            number = getFirstNumber();
        }
        return number;
    }

    public static int getSecondNumber() {
        System.out.println(TextHelper.ENTER_SECOND_NUMBER_TEXT.getText());
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println(TextHelper.INCORRECT_NUMBER_TEXT.getText());
            sc.next();
            number = getSecondNumber();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println(TextHelper.ENTER_OPERATION_TEXT.getText());
        char operation;
        operation = sc.next().charAt(0);
        return operation;
    }

    public static String calculator(int fistNum, int secondNum, char operation) {
        String result;
        switch (operation) {
            case '+':
                result = Operations.addition(fistNum, secondNum);
                break;
            case '-':
                result = Operations.subtract(fistNum, secondNum);
                break;
            case '*':
                result = Operations.multiplication(fistNum, secondNum);
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println(TextHelper.DIVIDE_BY_ZERO_TEXT.getText() + "\n"
                            + TextHelper.ENTER_SECOND_NUMBER_TEXT.getText());
                    secondNum = sc.nextInt();
                }
                result = Operations.divide(fistNum, secondNum);
                break;
            default:
                System.out.println(TextHelper.INCORRECT_OPERATION_TEXT.getText());
                result = calculator(fistNum, secondNum, getOperation());
        }
        return result;
    }
}