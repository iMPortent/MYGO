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

    public static String grabString(View view){
        return ((Button) view).getText().toString();
    }

    public static void swapNumber(View view, TextView textView){
        textView.setText(grabString(view));
    }

    public static void appendNumber(View view, TextView textView){
        textView.setText(textView.getText().toString() + grabString(view));

    }

    public static int grabInt(View view){
        return Integer.parseInt(grabString(view));
    }


}









