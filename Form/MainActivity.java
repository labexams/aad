package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editName, editPassword,editAddress,editAge;
    TextView result;
    RadioGroup radioGenderGroup;
    private RadioButton radioGenderButton;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

        editName =  findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPassword);
        editAddress = findViewById(R.id.editAddres);
        editAge = findViewById(R.id.editAge);
        radioSexGender = findViewById(R.id.radioGender);


        result = findViewById(R.id.tvResult);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String password = editPassword.getText().toString(); String address= editAddress.getText().toString();
                int selectedId = radioGenderGroup.getCheckedRadioButtonId();
                gen = (RadioButton) findViewById(selectedId);
                result.setText("Name:\t" + name + "\nPassword:\t" + password+ "\nAddredd:\t" + address+ "\nAGE:\t" + age+ "\nGender:\t" + gen);
            }
        });



    }
}
