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

public class Sub extends AppCompatActivity {
    Button b5,b6;
    EditText et1,et2;
    TextView tv1;
    int num1,num2,sub;
    String getNum1,getNum2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        b5=(Button) findViewById(R.id.back1);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(l);
            }
        });
        b6=(Button) findViewById(R.id.subb);
        tv1=(TextView) findViewById(R.id.reTodispe);
        et1=(EditText) findViewById(R.id.nume1);
        et2=(EditText) findViewById(R.id.nume2);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sub=num1-num2;
                result=String.valueOf(sub);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
                tv1.setText(result);
            }
        });
    }
}