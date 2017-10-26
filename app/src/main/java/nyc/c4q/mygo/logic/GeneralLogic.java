package nyc.c4q.mygo.logic;

import android.view.*;
import android.widget.*;

/**
 * Created by MarckemX on 10/24/17.
 */

public class GeneralLogic {

    public static void clearField(View view, TextView textView){
        textView.setText("");
    }
    private static String append_(View view, TextView textView){
        return textView.getText().toString() + grabString(view);
    }

    public static String grabString(View view){
        return ((Button) view).getText().toString();
    }

    public static void appendWithP(View view, TextView textView){
        textView.setText(append_(view, textView).concat("( )"));
    }

    public static void appendNumber(View view, TextView textView){
        textView.setText(append_(view, textView));

    }

    public static int grabInt(View view){
        return Integer.parseInt(grabString(view));
    }


}









