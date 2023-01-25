package Helpers;

import java.math.BigDecimal;
import java.math.MathContext;

public class Operations {

    public static String addition (int firstNum, int secondNum) {
        BigDecimal firstNumLong = new BigDecimal(firstNum);
        BigDecimal secondNumLong = new BigDecimal(secondNum);
         return firstNumLong.add(secondNumLong, MathContext.DECIMAL128).toString();
    }

    public static String subtract (int firstNum, int secondNum) {
        BigDecimal firstNumLong = new BigDecimal(firstNum);
        BigDecimal secondNumLong = new BigDecimal(secondNum);
        return firstNumLong.subtract(secondNumLong, MathContext.DECIMAL128).toString();
    }

    public static String multiplication (int firstNum, int secondNum) {
        BigDecimal firstNumLong = new BigDecimal(firstNum);
        BigDecimal secondNumLong = new BigDecimal(secondNum);
        return firstNumLong.multiply(secondNumLong, MathContext.DECIMAL128).toString();
    }

    public static String divide (int firstNum, int secondNum) {
        BigDecimal firstNumLong = new BigDecimal(firstNum);
        BigDecimal secondNumLong = new BigDecimal(secondNum);
        return firstNumLong.divide(secondNumLong, MathContext.DECIMAL128).toString();
    }
}
