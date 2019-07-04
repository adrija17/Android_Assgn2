package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ToggleButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ToggleButton imageButton;
    private Switch switch1;
    private RadioButton rb1;
    private RadioButton rb2;
    private CheckBox chk;
    private Button button;

    private int flagVisible=-1;
    private int flagClickable=-1;
    private int flagCheck=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageButton = findViewById(R.id.toggleButton);
        switch1 = findViewById(R.id.switch1);
        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        chk = findViewById(R.id.checkBox1);
        button = findViewById(R.id.button1);

    }

    protected void onImageButtonPressed(View view)
    {

    }

    protected void onSwitchPressed(View view)
    {
        int b = imageView.getVisibility();
        if(b==view.INVISIBLE)
                flagVisible=1;
        else if(b==view.VISIBLE)
             flagVisible=0;
    }
    protected void onEnabled(View view)
    {
        flagClickable=1;
    }
    protected void onDisabled(View view){
        flagClickable=0;
    }
    protected void onCheckBoxTicked(View view){
        int b = imageButton.getVisibility();
        if(b==4)
            flagCheck=1;
        else if(b==0)
            flagCheck=0;
    }

    protected void onRefreshed(View view){
        if(flagVisible==1)
            imageView.setVisibility(view.VISIBLE);
        else if (flagVisible==0)
            imageView.setVisibility(view.INVISIBLE);

        if (flagClickable==0)
            imageButton.setClickable(false);
        else if(flagClickable==1)
            imageButton.setClickable(true);

        if(flagCheck==1)
            imageButton.setVisibility(view.VISIBLE);
        else if (flagCheck==0)
            imageButton.setVisibility(view.INVISIBLE);
    }
}
