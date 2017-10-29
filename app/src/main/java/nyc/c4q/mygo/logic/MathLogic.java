package nyc.c4q.mygo.logic;

import java.lang.Math;

/**
 * Created by MarckemX on 10/24/17.
 */

public class MathLogic {

    public static int pluralOperator(int one, int two, String operator){
        switch(operator.toLowerCase()){
            case "+":
                return one + two;
            case "-":
                return one - two;
            case "x":
                return one * two;
            case "/":
                return one / two;
            default:
                return 0;
        }
    }

    public static double singOperator(String operator, int number){
        switch(operator.toLowerCase()){
            case "sin":
                return Math.sin(number);
            case "tan":
                return Math.tan(number);
            case "cos":
                return Math.cos(number);
            case "x!":
                return factorial(number);
            case "log":
                return Math.log(number);
            default:
                return 0;
        }
    }

    public static int factorial(int number){
        for(int i = number; i > 0; i++){
            number*=i;
        }
        return number;
    }
}
