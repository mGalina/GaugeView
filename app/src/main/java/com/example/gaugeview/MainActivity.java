package com.example.gaugeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import in.unicodelabs.kdgaugeview.KdGaugeView;

public class MainActivity extends AppCompatActivity {

    private KdGaugeView speedoMeterView;
    private EditText editText;
    private Button button;
    
    private EditText mLimit;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speedoMeterView = findViewById(R.id.speedMeter);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        mLimit = findViewById(R.id.speed_limit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int speed = Integer.parseInt(editText.getText().toString());
                speedoMeterView.setSpeed(speed);
                
                int limit = Integer.parseInt(mLimit.getText().toString());
                speedoMeterView.setmSafeSpeedLimit(limit);
            }
        });
    }
}