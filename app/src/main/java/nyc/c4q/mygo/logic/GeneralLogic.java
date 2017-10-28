package nyc.c4q.mygo.logic;

import android.view.*;
import android.widget.*;
import java.util.*;


/**
 * Created by MarckemX on 10/24/17.
 */

public class GeneralLogic {

    public static void clearField(TextView textView){
        textView.setText("");
    }
    public static String append_(View view, TextView textView){
        return textView.getText().toString() + grabString(view);
    }
    public static String grabString(View view){
        return ((Button) view).getText().toString();
    }
//    public static int grabInt(View view){
//        return Integer.parseInt(grabString(view));
//    }


}









