package nyc.c4q.mygo.logic;

import android.view.View;
import android.widget.*;
import java.util.*;
/**
 * Created by MarckemX on 10/27/17.
 */

public class Calculator {
    private static TextView numberField;
    private static Stack<Integer> numbers = new Stack<>();
    private static Stack<String> operators = new Stack<>();
    private static String currNumber="";

    public static void setNumberField(TextView textView){
        numberField = textView;
    }
    public static void buildNumber(View view){
        ButtonLogic.appendNumber(view, numberField, currNumber);
    }

    public static void completeNumber(){
        numbers.add(Integer.parseInt(currNumber));
        currNumber ="";
    }

    public static void addOperator(View view){
        completeNumber();
        operators.add(GeneralLogic.grabString(view));
        GeneralLogic.clearField(numberField);
    }




}
