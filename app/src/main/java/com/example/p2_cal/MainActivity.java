package com.example.p2_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonClear,buttonDot,buttonEqual,buttonAdd,buttonSub,buttonMul,buttonDiv,buttonRem;
    EditText ed1;
    float result1,result2;
    boolean add,sub,mul,div,remainder,deci;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonRem = (Button) findViewById(R.id.buttonRem);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        ed1 = (EditText) findViewById(R.id.editText);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+"0");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText()+".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    result1 = Float.parseFloat(ed1.getText()+"");
                    add = true;
                    ed1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    result1 = Float.parseFloat(ed1.getText()+"");
                    sub = true;
                    ed1.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    result1 = Float.parseFloat(ed1.getText()+"");
                    mul = true;
                    ed1.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ed1==null){
                    ed1.setText("");
                }
                else {
                    result1 = Float.parseFloat(ed1.getText()+"");
                    div = true;
                    ed1.setText(null);
                }
            }
        });

        buttonRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().length() != 0) {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    remainder = true;
                    deci = false;
                    ed1.setText(null);
                }
            }
        });
        
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                result2 = Float.parseFloat(ed1.getText()+"");
                if(add==true){
                    ed1.setText(result1+result2+"");
                    add=false;
                }
                if(sub==true){
                    ed1.setText(result1-result2+"");
                    sub=false;
                }
                if(mul==true){
                    ed1.setText(result1*result2+"");
                    mul=false;
                }
                if(div==true){
                    ed1.setText(result1/result2+"");
                    div=false;
                }
                if(remainder==true){
                    ed1.setText(result1 % result2 + "");
                    remainder = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText("");
            }
        });

    }
}