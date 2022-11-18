package com.example.form;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View.OnClickListener;

public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et = (EditText) findViewById(R.id.editText1);
        final EditText et1 = (EditText) findViewById(R.id.editText2);
        Button send = (Button) findViewById(R.id.button1);
        send.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                String s = et.getText().toString();
                String s1 = et1.getText().toString();
                Intent it = new Intent(MainActivity.this, Second.class);
                it.putExtra("uname", s);
                it.putExtra("pwd", s1);
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

