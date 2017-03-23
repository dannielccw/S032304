package com.example.yvtc.s032304;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(MainActivity.this);
        layout.setOrientation(LinearLayout.VERTICAL);

        Button btn = new Button(MainActivity.this);
        btn.setText("Click me");
        layout.addView(btn);

        Button btn2 = new Button(MainActivity.this);
        btn2.setText("Click me 2");
        layout.addView(btn2);

        setContentView(layout);
    }
}
