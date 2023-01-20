import java.util.Scanner;

public class SimpleCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double fistNum = getNumber();
        char operation = getOperation();
        double secondNum = getNumber();
        double result = calculator(fistNum,secondNum,operation);
        System.out.println("Your result is: " + result);
    }

    public static int getNumber() {
        System.out.println("Enter an integer number:");
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println("Incorrect value. Try again");
            sc.next();
            number=getNumber();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println("Enter an operation:");
        char operation;
        if (sc.hasNext()) {
            operation=sc.next().charAt(0);
        }else {
            System.out.println("Invalid operation. Try again");
            sc.next();
            operation=getOperation();
        }
        return operation;
    }

    public static double calculator (double fistNum, double secondNum, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = fistNum + secondNum;
                break;
            case '-':
                result = fistNum - secondNum;
                break;
            case '*':
                result = fistNum * secondNum;
                break;
            case '/':
                result = fistNum / secondNum;
                break;
            default:
                System.out.println("Invalid operation.Valid values are: \"+\", \"-\", \"*\", \"/\". Try again");
                result = calculator(fistNum,secondNum,getOperation());
        }
        return result;
    }
}
