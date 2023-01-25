package Helpers;

public enum TextHelper {
    ENTER_FIRST_NUMBER_TEXT("Enter first number:"),
    ENTER_SECOND_NUMBER_TEXT("Enter second number:"),
    ENTER_OPERATION_TEXT("Enter an operation:"),
    INCORRECT_NUMBER_TEXT("Incorrect value. Try again"),
    INCORRECT_OPERATION_TEXT("Invalid operation.Valid values are: \"+\", \"-\", \"*\", \"/\". Try again"),
    DIVIDE_BY_ZERO_TEXT("You can't divide by zero. Try again"),
    RESULT_TEXT("Your result is: ");

    private final String textHelper;

    TextHelper(String textHelper) {
        this.textHelper = textHelper;
    }

    public String getText() {
        return textHelper;
    }
}
