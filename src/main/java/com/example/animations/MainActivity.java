package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartOn=true;

    public void fade(View view){
        Log.i("myTag", "Image tapped!");
        ImageView image = (ImageView) findViewById(R.id.imgView);
        ImageView image2 = (ImageView) findViewById(R.id.imgView2);
        //image.animate().translationYBy(1000).setDuration(1000);
        //image.animate().translationXBy(-1000).setDuration(1000);
        //image.animate().rotation(-180).alpha(0).setDuration(1000);
        image.animate().scaleX(1.5f).scaleY(1.5f).setDuration(1000);

    }

    public void fade2(View view){
        Log.i("myTag", "Image tapped!");
        ImageView image = (ImageView) findViewById(R.id.imgView);
        ImageView image2 = (ImageView) findViewById(R.id.imgView2);

        if (bartOn){
            bartOn = false;
            image.animate().alpha(0).setDuration(2000);//1000  es 1 segundo
            image2.animate().alpha(1).setDuration(2000);
        }else{
            bartOn = true;
            image.animate().alpha(1).setDuration(2000);//1000  es 1 segundo
            image2.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}