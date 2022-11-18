package com.example.loginpage;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button buttonSubmit, buttonReset;
    EditText editName, editPassword;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editPassword =findViewById(R.id.editPassword);
        result = findViewById(R.id.tvResult);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonReset = findViewById(R.id.buttonReset);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String password = editPassword.getText().toString(); result.setText("Name:\t" + name + "\nPassword:\t" + password );
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            editName.setText("");
            editPassword.setText("");
            result.setText("");
            editName.requestFocus();
        }
        });
    }
}
