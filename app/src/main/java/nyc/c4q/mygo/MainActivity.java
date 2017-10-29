package nyc.c4q.mygo;


import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import nyc.c4q.mygo.logic.*;
import android.widget.*;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    public MainActivity(Calculator myCalculator) {
//        this.myCalculator = myCalculator;
//    }

    //Calculator myCalculator;
    TextView textView;
    int numone,numtwo;
    String operator;
//    boolean monomial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.show_number);
        //setValues();

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //setLandscapeViews();
        }
    }



//    public void setValues(){
//        myCalculator = new Calculator();
//        ;
//        myCalculator.setNumberField(textView);
//    }

//    public void addDigit(View view){
//        GeneralLogic.append_(view,textView);
//    }

//    public void inputFirst(){
//        myCalculator.setNumOne();
//        myCalculator.clear();
//    }

//    public void setOperator(View view){
//        inputFirst();
//        myCalculator.setOperator(GeneralLogic.grabString(view));
//    }
//
//        Button radianButton = findViewById(R.id.radianButton);
//        Button buttonTwo = findViewById(R.id.buttonTwo);
//        Button xButton = findViewById(R.id.factorialButton);
//        Button openParenthesisButton = findViewById(R.id.openParenthesisButton);
//        Button closeParenthesisButton = findViewById(R.id.closeParenthesisButton);
//        Button percentageButton = findViewById(R.id.percentageButton);
//        Button acButton = findViewById(R.id.acButton);
//        Button invButton = findViewById(R.id.invButton);
//        Button sinButton = findViewById(R.id.sinButton);
//        Button lnButton = findViewById(R.id.lnButton);
//        Button nineButton = findViewById(R.id.nineButton);
//        Button eightButton = findViewById(R.id.eightButton);
//        Button sevenButton = findViewById(R.id.sevenButton);
//        Button forwardSlashButton = findViewById(R.id.forwardSlashButton);
//        Button piButton = findViewById(R.id.piButton);
//        Button conButton = findViewById(R.id.conButton);
//        Button logButton = findViewById(R.id.logButton);
//        Button fourButton = findViewById(R.id.fourButton);
//        Button fiveButton = findViewById(R.id.fiveButton);
//        Button sixButton = findViewById(R.id.sixButton);
//        Button multiplyButton = findViewById(R.id.multiplyButton)
//        Button eButton = findViewById(R.id.eButton);
//        Button tanButton = findViewById(R.id.tanButton);
//        Button buttonThree = findViewById(R.id.buttonThree);
//        Button oneButton = findViewById(R.id.oneButton);
//        Button twoButton = findViewById(R.id.twoButton);
//        Button threeButton = findViewById(R.id.threeButton);
//        Button spaceButton = findViewById(R.id.spaceButton);
//        Button ansButton = findViewById(R.id.ansButton);
//        Button expButton = findViewById(R.id.expButton);
//        Button powerButton = findViewById(R.id.powerButton);
//        Button periodButton = findViewById(R.id.periodButton);
//        Button equalsButton = findViewById(R.id.equalsButton);
//        Button addButton = findViewById(R.id.addButton);

//
//
//        try {
//            radianButton.setOnClickListener((View.OnClickListener) this.radianButton);
//            buttonTwo.setOnClickListener((View.OnClickListener) this.buttonTwo);
//            xButton.setOnClickListener((View.OnClickListener) this.xButton);
//            openParenthesisButton.setOnClickListener((View.OnClickListener) this.openParenthesisButton);
//            closeParenthesisButton.setOnClickListener((View.OnClickListener) this.closeParenthesisButton);
//            percentageButton.setOnClickListener((View.OnClickListener) this.percentageButton);
//            acButton.setOnClickListener((View.OnClickListener)this.acButton);
//            invButton.setOnClickListener((View.OnClickListener) this.invButton);
//            sinButton.setOnClickListener((View.OnClickListener) this.sinButton);
//            lnButton.setOnClickListener((View.OnClickListener) this.lnButton);
//            nineButton.setOnClickListener((View.OnClickListener) this.nineButton);
//            eightButton.setOnClickListener((View.OnClickListener) this.eightButton);
//            sevenButton.setOnClickListener((View.OnClickListener) this.sevenButton);
//            forwardSlashButton.setOnClickListener((View.OnClickListener) this.forwardSlashButton);
//            piButton.setOnClickListener((View.OnClickListener) this.piButton);
//            conButton.setOnClickListener((View.OnClickListener) this.conButton);
//            logButton.setOnClickListener((View.OnClickListener) this.logButton);
//            fourButton.setOnClickListener((View.OnClickListener) this.fourButton);
//            fiveButton.setOnClickListener((View.OnClickListener) this.fiveButton);
//            sixButton.setOnClickListener((View.OnClickListener) this.sixButton);
//            eButton.setOnClickListener((View.OnClickListener) this.eButton);
//            tanButton.setOnClickListener((View.OnClickListener) this.tanButton);
//            buttonThree.setOnClickListener((View.OnClickListener) this.buttonThree);
//            oneButton.setOnClickListener((View.OnClickListener) this.oneButton);
//            twoButton.setOnClickListener((View.OnClickListener) this.twoButton);
//            threeButton.setOnClickListener((View.OnClickListener) this.threeButton);
//            spaceButton.setOnClickListener((View.OnClickListener) this.spaceButton);
//            ansButton.setOnClickListener((View.OnClickListener) this.ansButton);
//            expButton.setOnClickListener((View.OnClickListener) this.expButton);
//            powerButton.setOnClickListener((View.OnClickListener) this.powerButton);
//            periodButton.setOnClickListener((View.OnClickListener) this.periodButton);
//            equalsButton.setOnClickListener((View.OnClickListener) this.equalsButton);
//            addButton.setOnClickListener((View.OnClickListener) this.addButton);
//
//        } catch (Exception e) {
//
//            System.out.println("NaN");
//        }
//    }

//    public static int pluralOperator(int one, int two, String operator){
//        switch(operator){
//            case "+":
//                return one + two;
//            case "-":
//                return one - two;
//            case "x":
//                return one * two;
//            case "/":
//                return one / two;
//            default:
//                return 0;
//        }
//    }

    public void singleOp(View view){
        MathLogic.singOperator(grabString(view),convertToNum());
    }
    public void addOperator(View view){
        numone = convertToNum();
        clearField();
        operator = grabString(view);
    }
    public void evaluate(View view){
        numtwo = convertToNum();
        clearField();
        textView.setText(String.valueOf(MathLogic.pluralOperator(numone,numtwo,operator)));
    }
    public void clearField(View view){
        if(!textView.getText().toString().equals("")){textView.setText("");}
        else{numone = 0;numtwo = 0;}
    }
    public void clearField(){textView.setText("");}
    public int convertToNum(){
        return Integer.parseInt(textView.getText().toString());
    }
    public void append_(View view){
        textView.setText(textView.getText().toString() + grabString(view));
    }

    public String grabString(View view){
        return ((Button) view).getText().toString();
    }
    public int grabInt(View view){
        return Integer.parseInt(grabString(view));
    }

    }