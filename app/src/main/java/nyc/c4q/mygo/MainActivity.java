package nyc.c4q.mygo;

import nyc.c4q.mygo.logic.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView numberField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberField =(TextView) findViewById(R.id.show_number);
    }

    public void grabText(View view){
        numberField.setText(((Button) view).getText().toString());
    }
}
