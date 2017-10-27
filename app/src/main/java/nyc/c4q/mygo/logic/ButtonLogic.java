package nyc.c4q.mygo.logic;

import android.view.View;
import android.widget.*;
import android.view.*;
import java.util.*;

/**
 * Created by MarckemX on 10/26/17.
 */

public class ButtonLogic {
    private static TextView numberField;
    private static String number="";
    private static ArrayList<String>equation;

    public static void setNumField(TextView numberField){
        this.numberField = numberField;
    }

    public static void appendNumber(View view) {
        GeneralLogic.appendNumber(view, numberField);
        number += GeneralLogic.grabString(view);
    }

    public static void operateNext(View view){
        GeneralLogic.appendWithP(view,numberField);
    }

    public static void operate(View view){
        GeneralLogic.clearField(view,numberField);
        equation.add(number);
        equation.add(GeneralLogic.grabString(view));
        number ="";
    }

}
