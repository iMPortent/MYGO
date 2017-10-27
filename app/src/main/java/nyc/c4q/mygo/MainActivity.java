package nyc.c4q.mygo;

import nyc.c4q.mygo.logic.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    ButtonLogic myButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //numberField =(TextView) findViewById(R.id.show_number);
//        numStrip = new ArrayList<>();
//        number ="";
        setValues();

    }

    public void setValues(){
        myButtons = new ButtonLogic();
        myButtons.setNumField((TextView) findViewById(R.id.show_number));
    }


}
