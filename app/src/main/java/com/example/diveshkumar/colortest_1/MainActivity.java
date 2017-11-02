package com.example.diveshkumar.colortest_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1,layout2,layout3,layoutMain;
    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code for color change
        layoutMain = (LinearLayout)findViewById(R.id.layoutMain);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);
        layout3 = (LinearLayout)findViewById(R.id.layout3);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               view.setBackgroundResource(R.color.red);
               layout1.setBackgroundResource(R.color.red);
               layoutMain.setBackgroundResource(R.color.red);
           }
       });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundResource(R.color.yellow);
                layout2.setBackgroundResource(R.color.yellow);
                layoutMain.setBackgroundResource(R.color.yellow);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundResource(R.color.green);
                layout3.setBackgroundResource(R.color.green);
                layoutMain.setBackgroundResource(R.color.green);
            }
        });
    }
}
