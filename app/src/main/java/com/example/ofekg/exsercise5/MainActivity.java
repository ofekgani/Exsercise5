package com.example.ofekg.exsercise5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btn0;
    public Button btn1;
    public Button btn2;
    int num0 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
    }

    public void go0(View view) {
        num0 = 0;
        btn1.setText(""+num0);
    }

    public void go1(View view) {

    }

    public void go2(View view) {
        Random rnd= new Random();
        num0 = rnd.nextInt(100);
        btn1.setText(""+num0);
    }
}
