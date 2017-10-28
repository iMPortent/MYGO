package nyc.c4q.mygo.logic;

import android.view.View;
import android.widget.*;
import android.view.*;
import java.util.*;

/**
 * Created by MarckemX on 10/26/17.
 */


public class ButtonLogic {

    //appends clicked number to the textview
    public static String append_(View view, TextView textView){
        return textView.getText().toString() + GeneralLogic.grabString(view);
    }

    // add parenthesis after funtions like ln()
//    public static void inlineOperation(View view, TextView textView){
//        textView.setText(append_(view, textView).concat("( )"));
//    }

    public static void addOperator(View view, TextView textView, Stack<String> operators, Stack<Integer> String number){
        operators.add(GeneralLogic.grabString(view));


    }
//    }



}
