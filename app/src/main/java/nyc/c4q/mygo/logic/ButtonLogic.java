package nyc.c4q.mygo.logic;

import android.view.View;
import android.widget.*;
import android.view.*;
import java.util.*;

/**
 * Created by MarckemX on 10/26/17.
 */

public class ButtonLogic {


    public static void operateNext(View view, TextView textView){
        appendWithP(view,textView);
    }

    public static void operate(View view,TextView numberField,String number, ArrayList<String> equation){
        GeneralLogic.clearField(numberField);
        equation.add(number);
        equation.add(GeneralLogic.grabString(view));
    }

    public static void appendWithP(View view, TextView textView){
        textView.setText(GeneralLogic.append_(view, textView).concat("( )"));
    }

    public static void appendNumber(View view, TextView textView, String number){
        textView.setText(GeneralLogic.append_(view, textView));
        number += GeneralLogic.grabString(view);


    }

}
