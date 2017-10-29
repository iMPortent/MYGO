//package nyc.c4q.mygo.logic;
//
//import android.widget.*;
//import java.util.*;
//import android.view.*;
///**
// * Created by MarckemX on 10/27/17.
// */
//
//public class Calculator {
//    private static TextView numberField;
//    private static int numone;
//    private static int numtwo;
//    private static String operator;
//    private static boolean singleOp = false;
//    private static boolean hasFirst = false;
//
//    public static void setNumberField(TextView textView){
//        numberField = textView;
//    }
//
//    public static void setNumOne(){
//        numone = GeneralLogic.convertToNum(numberField);
//        hasFirst = true;
//    }
//
//    public static void setNumTwo(){
//        numtwo = GeneralLogic.convertToNum(numberField);
//    }
//
//    public static void setOperator(String thisOperator){
//        operator = thisOperator;
//    }
//
//    public static void clear(){
//        GeneralLogic.clearField(numberField);
//    }
//    public static void evaluate(){
//        if(!singleOp){numberField.setText(MathLogic.pluralOperator(numone,numtwo,operator));}
//        else{MathLogic.singOperator(operator,numone);}
//    }
//}
