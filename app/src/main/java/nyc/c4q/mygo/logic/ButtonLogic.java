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
        inlineOperation(view,textView);
    }

    public static void inputNumber(View view,TextView numberField,String number){
        GeneralLogic.clearField(numberField);
        number += GeneralLogic.grabString(view);
    }

    public static void inlineOperation(View view, TextView textView){
        textView.setText(GeneralLogic.append_(view, textView).concat("( )"));
    }

    public static void appendNumber(View view, TextView textView, String number){
        textView.setText(GeneralLogic.append_(view, textView));
        number += GeneralLogic.grabString(view);


    }

}
