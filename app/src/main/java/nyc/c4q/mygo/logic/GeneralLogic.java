package nyc.c4q.mygo.logic;

import android.view.*;
import android.widget.*;
import java.util.*;


/**
 * Created by MarckemX on 10/24/17.
 */
//class to communicate directly with the layout
public class GeneralLogic {

    //grab the text from button clicked and change it to a string
    public static String grabString(View view){
        return ((Button) view).getText().toString();
    }

    // clear textview, clear number off calc
    public static void clearField(TextView textView){
        textView.setText("");
    }


//    public static void inputNumber(String number,Stack<Integer> numbers){
//        numbers.add(Integer.parseInt(number));
//        number = "";
//    }




//    public static int grabInt(View view){
//        return Integer.parseInt(grabString(view));
//    }
    public static void completeNumber(Stack<Integer>stack,String number){
        stack.add(Integer.parseInt(number));
        number ="";
}





}









