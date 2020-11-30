package com.aryosatria.lampapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    Button button;
    Boolean turnOn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!turnOn){
                    imageview.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);
                    turnOn=true;
                }else {
                    imageview.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);
                    turnOn=false;

                }
            }
        });
    }
}