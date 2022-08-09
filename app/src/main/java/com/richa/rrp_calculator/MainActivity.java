package com.richa.rrp_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    R_Calculator calculator=new R_Calculator();
    //added content
    public double d1,d2,result;
    public double memory=0;
    public double exp=1;
    int i=0;
    public String operator,ans;
    public String full="";
    public String mem="";
    public String final_memory="";
    public String mr="";
    public TextView textview1,textview2;
    public Button btnmr,btnmc,btnmp,btnmm,btnbackspace,btnexp,btnpercent,btndivide,btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0,btnsubstract,btnmultiply,btnadd,btndot,btnpi,btnequal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //added content
        getSupportActionBar().hide();
        textview1=findViewById(R.id.textview1);
        textview2=findViewById(R.id.textview2);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btndot=findViewById(R.id.btndot);
        btnadd=findViewById(R.id.btnadd);
        btnsubstract=findViewById(R.id.btnsubstract);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        btnpercent=findViewById(R.id.btnpercent);
        btnpi=findViewById(R.id.btnpi);
        btnexp=findViewById(R.id.btnexp);
        btnequal=findViewById(R.id.btnequal);
        btnmc=findViewById(R.id.btnmc);
        btnmr=findViewById(R.id.btnmr);
        btnmp=findViewById(R.id.btnmp);
        btnmm=findViewById(R.id.btnmm);
        btnbackspace=findViewById(R.id.btnbackspace);



        //button 0 to 9
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn0.getText().toString();
                textview2.setText(text);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn1.getText().toString();

                textview2.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn2.getText().toString();
                textview2.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn3.getText().toString();

                textview2.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn4.getText().toString();
                textview2.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn5.getText().toString();
                textview2.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn6.getText().toString();
                textview2.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn7.getText().toString();
                textview2.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn8.getText().toString();

                textview2.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btn9.getText().toString();

                textview2.setText(text);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textview2.getText().toString()+btndot.getText().toString();

                textview2.setText(text);
            }
        });



        //backspace button
        btnbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bs=null;
                if(textview2.getText().length()>0)
                {
                    StringBuilder sb=new StringBuilder(textview2.getText());

                    sb.deleteCharAt(textview2.getText().length()-1);

                    bs=sb.toString();

                    textview2.setText(bs);
                }
            }
        });

        //operations taking data
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                String temp2= (String) textview2.getText();
                d1=Double.parseDouble((String) textview2.getText());
                temp=String.format("%.2f",d1);
                textview1.setText(temp);
                textview2.setText("");
                operator="+";


            }
        });
        btnsubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                String temp2= (String) textview2.getText();
                d1=Double.parseDouble((String) textview2.getText());
                temp=String.format("%.2f",d1);
                textview1.setText(temp);
                textview2.setText("");
                operator="-";


            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                String temp2= (String) textview2.getText();
                d1=Double.parseDouble((String) textview2.getText());
                temp=String.format("%.2f",d1);
                textview1.setText(temp);
                textview2.setText("");
                operator="/";


            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                String temp2= (String) textview2.getText();
                d1=Double.parseDouble((String) textview2.getText());
                temp=String.format("%.2f",d1);
                textview1.setText(temp);
                textview2.setText("");
                operator="x";


            }
        });

        //percentage method
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp2= (String) textview2.getText();
                d2=Double.parseDouble((String) textview2.getText());
                result=calculator.percent_operation(operator,d1,d2);
                ans=String.format("%.2f",result);
                full=(d1+" "+operator+" "+d2+"% = "+ans).toString();
                textview2.setText(null);
                textview1.setText(full);
                full="";


            }
        });
        btnexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                d1=Double.parseDouble((String) textview2.getText());
                temp=String.format("%.2f",d1);
                textview1.setText(temp);
                textview2.setText("");
                operator="^";


            }
        });
        btnpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                d1=Double.parseDouble((String) textview2.getText());
                temp=String.format("%.2f",d1);
                textview1.setText(temp);
                textview2.setText("");
                operator="pi";


            }
        });


        //equal button operator
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp2= (String) textview2.getText();
                d2=Double.parseDouble((String) textview2.getText());
                result=calculator.operation(operator,d1,d2);
                ans=String.format("%.2f",result);
                full=(d1+" "+operator+" "+d2+" = "+ans).toString();
                textview2.setText(null);
                textview1.setText(full);
                full="";



            }
        });

        //memory functions
        btnmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memory=memory+result;
                final_memory=String.format("%.2f",memory);
                //textview1.setText(final_memory);


            }
        });
        btnmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memory=memory-result;
                final_memory=String.format("%.2f",memory);
                //textview1.setText(final_memory);


            }
        });
        btnmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memory=0;
                final_memory=String.format("%.2f",memory);
                //textview1.setText(final_memory);


            }
        });
        btnmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setText(null);
                textview1.setText(final_memory);


            }
        });


    }
}