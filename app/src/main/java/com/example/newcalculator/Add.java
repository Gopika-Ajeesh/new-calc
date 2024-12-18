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

public class Add extends AppCompatActivity {
    Button b3,b4;
    TextView tv;
    EditText et1,et2;
    int num1,num2,sum;
    String getNum1,getNum2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        b3=(Button) findViewById(R.id.back);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(n);
            }
        });
        tv=(TextView) findViewById(R.id.reTodisp);
        b4=(Button) findViewById(R.id.addd);
        et1=(EditText) findViewById(R.id.e1);
        et2=(EditText) findViewById(R.id.e2);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
                tv.setText(result);
            }
        });


    }
}