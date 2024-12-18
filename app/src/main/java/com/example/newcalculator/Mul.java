package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mul extends AppCompatActivity {
    Button b7,b8;
    EditText et1,et2;
    TextView tv;
    int num1,num2,mulip;
    String getNum1,getNum2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        b7=(Button) findViewById(R.id.back2);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(k);
            }
        });
        b8=(Button) findViewById(R.id.mult);
        tv=(TextView) findViewById(R.id.reTodisp);
        et1=(EditText) findViewById(R.id.numee1);
        et2=(EditText) findViewById(R.id.numee2);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                mulip=num1*num2;
                result=String.valueOf(mulip);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
                tv.setText(result);
            }
        });
    }
}