package com.example.ictmoe.client;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

public class principal extends AppCompatActivity {
    Display display;
    Point size;
    int width, height;
    float txtsize;
    TextView ico,sclId,sclName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display = getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        txtsize=height*0.024f;

        ico =(TextView)findViewById(R.id.txtIcon);



    }
}
