package com.example.babimaji.mygo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button radianButton = findViewById(R.id.radianButton);
        Button buttonTwo = findViewById(R.id.buttonTwo);
        Button xButton = findViewById(R.id.xButton);
        Button openParenthesisButton = findViewById(R.id.openParenthesisButton);
        Button closeParenthesisButton = findViewById(R.id.closeParenthesisButton);
        Button percentageButton = findViewById(R.id.percentageButton);
        Button acButton = findViewById(R.id.acButton);
        Button invButton = findViewById(R.id.invButton);
        Button sinButton = findViewById(R.id.sinButton);
        Button lnButton = findViewById(R.id.lnButton);
        Button nineButton = findViewById(R.id.nineButton);
        Button eightButton = findViewById(R.id.eightButton);
        Button sevenButton = findViewById(R.id.sevenButton);
        Button forwardSlashButton = findViewById(R.id.forwardSlashButton);
        Button piButton = findViewById(R.id.piButton);
        Button conButton = findViewById(R.id.conButton);
        Button logButton = findViewById(R.id.logButton);
        Button fourButton = findViewById(R.id.fourButton);
        Button fiveButton = findViewById(R.id.fiveButton);
        Button sixButton = findViewById(R.id.sixButton);
        Button eButton = findViewById(R.id.eButton);
        Button tanButton = findViewById(R.id.tanButton);
        Button buttonThree = findViewById(R.id.buttonThree);
        Button oneButton = findViewById(R.id.oneButton);
        Button twoButton = findViewById(R.id.twoButton);
        Button threeButton = findViewById(R.id.threeButton);
        Button spaceButton = findViewById(R.id.spaceButton);
        Button ansButton = findViewById(R.id.ansButton);
        Button expButton = findViewById(R.id.expButton);
        Button powerButton = findViewById(R.id.powerButton);
        Button periodButton = findViewById(R.id.periodButton);
        Button equalsButton = findViewById(R.id.equalsButton);
        Button addButton = findViewById(R.id.addButton);


        try {
            radianButton.setOnClickListener((View.OnClickListener) this.radianButton);
            buttonTwo.setOnClickListener((View.OnClickListener) this.buttonTwo);
            xButton.setOnClickListener((View.OnClickListener) this.xButton);
            openParenthesisButton.setOnClickListener((View.OnClickListener) this.openParenthesisButton);
            closeParenthesisButton.setOnClickListener((View.OnClickListener) this.closeParenthesisButton);
            percentageButton.setOnClickListener((View.OnClickListener) this.percentageButton);
            acButton.setOnClickListener((View.OnClickListener)this.acButton);
            invButton.setOnClickListener((View.OnClickListener) this.invButton);
            sinButton.setOnClickListener((View.OnClickListener) this.sinButton);
            lnButton.setOnClickListener((View.OnClickListener) this.lnButton);
            nineButton.setOnClickListener((View.OnClickListener) this.nineButton);
            eightButton.setOnClickListener((View.OnClickListener) this.eightButton);
            sevenButton.setOnClickListener((View.OnClickListener) this.sevenButton);
            forwardSlashButton.setOnClickListener((View.OnClickListener) this.forwardSlashButton);
            piButton.setOnClickListener((View.OnClickListener) this.piButton);
            conButton.setOnClickListener((View.OnClickListener) this.conButton);
            logButton.setOnClickListener((View.OnClickListener) this.logButton);
            fourButton.setOnClickListener((View.OnClickListener) this.fourButton);
            fiveButton.setOnClickListener((View.OnClickListener) this.fiveButton);
            sixButton.setOnClickListener((View.OnClickListener) this.sixButton);
            eButton.setOnClickListener((View.OnClickListener) this.eButton);
            tanButton.setOnClickListener((View.OnClickListener) this.tanButton);
            buttonThree.setOnClickListener((View.OnClickListener) this.buttonThree);
            oneButton.setOnClickListener((View.OnClickListener) this.oneButton);
            twoButton.setOnClickListener((View.OnClickListener) this.twoButton);
            threeButton.setOnClickListener((View.OnClickListener) this.threeButton);
            spaceButton.setOnClickListener((View.OnClickListener) this.spaceButton);
            ansButton.setOnClickListener((View.OnClickListener) this.ansButton);
            expButton.setOnClickListener((View.OnClickListener) this.expButton);
            powerButton.setOnClickListener((View.OnClickListener) this.powerButton);
            periodButton.setOnClickListener((View.OnClickListener) this.periodButton);
            equalsButton.setOnClickListener((View.OnClickListener) this.equalsButton);
            addButton.setOnClickListener((View.OnClickListener) this.addButton);

        } catch (Exception e) {

            System.out.println("NaN");
        }
    }
}


