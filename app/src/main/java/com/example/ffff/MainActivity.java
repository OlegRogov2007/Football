package com.example.ffff;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MotionLayout motionLayout=findViewById(R.id.motion);

        ImageView ball=findViewById(R.id.ball);
        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                motionLayout.transitionToStart();
            }
        });
    }
}