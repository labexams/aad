package com.example.it.snist;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button; 
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
  Button buttonSubmit, buttonReset;
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_main);
    editName = (EditText) findViewById(R.id.editName); 
    editPassword = (EditText) findViewById(R.id.editPassword); 
    result = (TextView) findViewById(R.id.tvResult); 
    buttonSubmit = (Button) findViewById(R.id.buttonSubmit); 
    buttonReset = (Button) findViewById(R.id.buttonReset);
    buttonSubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    String name = editName.getText().toString();
    String password = editPassword.getText().toString(); 
    result.setText("Name:\t" + name + "\nPassword:\t" + password );}});
    buttonReset.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { 
      editName.setText(""); 
      editPassword.setText(""); result.setText(""); editName.requestFocus();
    }
  });
  }
}
