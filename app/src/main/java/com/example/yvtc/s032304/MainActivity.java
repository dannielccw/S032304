package com.example.yvtc.s032304;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(MainActivity.this);
        layout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1);

        Button btn = new Button(MainActivity.this);
        btn.setText("Click me");
        btn.setLayoutParams(params);
        layout.addView(btn);

        Button btn2 = new Button(MainActivity.this);
        btn2.setText("Click me 2");
        btn2.setLayoutParams(params);
        layout.addView(btn2);

        Button btn3 = new Button(MainActivity.this);
        btn3.setText("Click me 3");
        btn3.setLayoutParams(params);
        layout.addView(btn3);


        setContentView(layout);
    }
}
