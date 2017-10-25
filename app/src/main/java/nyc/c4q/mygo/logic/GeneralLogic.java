package nyc.c4q.mygo.logic;

import android.view.*;
import android.widget.*;

/**
 * Created by MarckemX on 10/24/17.
 */

public class GeneralLogic {

    public static void grabText(View view, TextView textView){
        textView.setText(((Button) view).getText().toString());
    }
}
