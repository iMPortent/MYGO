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
    //View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField =(TextView) findViewById(R.id.show_number);
        numStrip = new ArrayList<>();
    }

    public void useText(View view) {
        numStrip.add(GeneralLogic.grabText(view, numberField));
    }

}
