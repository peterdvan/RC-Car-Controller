package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by Peter on 11/10/2017.
 */

public class DirectionalControl extends Activity{
    private final static String TAG = DirectionalControl.class.getSimpleName();
    private ImageButton TOP_ARROW;
    private EditText acceleration;
    private EditText brightness;
    private EditText distance_sensor;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directional_pad);
        TOP_ARROW = (ImageButton) findViewById(R.id.top_arrow);
        TOP_ARROW.setImageResource(R.drawable.up_arrow);
        TOP_ARROW.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {

                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    TOP_ARROW.setImageResource(R.drawable.up_arrow);
                }
                return false;
            }
        });
        acceleration = (EditText) findViewById(R.id.acceleration);
        brightness = (EditText) findViewById(R.id.brightness);
        distance_sensor = (EditText) findViewById(R.id.distance_sensor);

    }


}
