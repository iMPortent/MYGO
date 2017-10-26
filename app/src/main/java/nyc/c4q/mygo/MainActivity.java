package nyc.c4q.mygo;

import nyc.c4q.mygo.logic.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    TextView numberField;
    ArrayList<String>numStrip;
    String number;
    //View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField =(TextView) findViewById(R.id.show_number);
        numStrip = new ArrayList<>();
        number ="";
    }

    public void useText(View view) {
        GeneralLogic.appendNumber(view, numberField);
        number += GeneralLogic.grabString(view);
    }

    public void operateOn(View view){
        GeneralLogic.clearField(view,numberField);
        numStrip.add(number);
        number ="";
    }

    public void operateNext(View view){
        GeneralLogic.appendWithP(view,numberField);

    }

}
