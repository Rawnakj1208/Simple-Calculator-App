package edu.bd.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMulti,btnDiv,btnDot,btnEql,btnDelete,btnClear;
    TextView View1;
    float Res1,Res2;
    boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnDelete=(Button)findViewById(R.id.btnDelete);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnEql=(Button)findViewById(R.id.btnEql);
        View1=(TextView)findViewById(R.id.View1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText(View1.getText()+".");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(View1==null){
                    View1.setText("");
                }
                else{
                    Res1=Float.parseFloat(View1.getText()+"");
                    Add=true;
                    View1.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(View1==null){
                    View1.setText("");
                }
                else{
                    Res1=Float.parseFloat(View1.getText()+"");
                    Sub=true;
                    View1.setText(null);
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(View1==null){
                    View1.setText("");
                }
                else{
                    Res1=Float.parseFloat(View1.getText()+"");
                    Mul=true;
                    View1.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(View1==null){
                    View1.setText("");
                }
                else{
                    Res1=Float.parseFloat(View1.getText()+"");
                    Div=true;
                    View1.setText(null);
                }
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View1.setText("");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String D=View1.getText().toString();
                D=D.substring(0,D.length()-1);
                View1.setText(D);
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Res2=Float.parseFloat(View1.getText()+"");
               if(Add==true){
                   View1.setText(Res1+Res2+"");
                   Add=false;
               }

                if(Sub==true){
                    View1.setText(Res1-Res2+"");
                    Sub=false;
                }
                if(Mul==true){
                    View1.setText(Res1*Res2+"");
                    Mul=false;
                }

                if(Div==true){
                    View1.setText(Res1/Res2+"");
                    Div=false;
                }
            }
        });



    }
}