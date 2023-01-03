package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
private RadioGroup rg;
private RadioButton sound,vibration,silent;
private Button button;
private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup) findViewById(R.id.myRG);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.silent)
                {
                    Toast.makeText(getApplicationContext(),"Selcted:silent", Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.vibration)
                {
                    Toast.makeText(getApplicationContext(),"Choice:vibration", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Choice:sound", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sound=(RadioButton) findViewById(R.id.sound);
        vibration=(RadioButton) findViewById(R.id.vibration);
        silent=(RadioButton) findViewById(R.id.vibration);
        textView=(TextView) findViewById(R.id.tv);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected=rg.getCheckedRadioButtonId();
                if(selected==sound.getId())
                {
                    textView.setText("you have choosed sound option");
                }
                else if(selected==vibration.getId())
                {
                    textView.setText("you have choosed vibration option");
                }
                else
                {
                    textView.setText("you have choosed silent option");
                }
            }
        });
    }
}
