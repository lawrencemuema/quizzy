package com.example.panda_l.quizzy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Topic2Activity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;


    Button subview;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    private int score= 0;
    public int a,b,c,d,e,f = 0;



    private static int SPLASH = 2000; //timeout to redirect you back to first page
    private TextView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic2);





        radioGroup = findViewById(R.id.radiogrp11);  //question 1
        radioGroup2 = findViewById(R.id.radiogrp22);  //question 2
        radioGroup3 = findViewById(R.id.radiogrp33);  //question 3
        radioGroup4 = findViewById(R.id.radiogrp44);  //question 4
        check1 = findViewById(R.id.checkbox11);//question5
        check2 = findViewById(R.id.checkbox22);
        check3 = findViewById(R.id.checkbox33);
        check4 = findViewById(R.id.checkbox44);


        subview = findViewById(R.id.websub);

        subview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                int radioId2 = radioGroup2.getCheckedRadioButtonId();
                int radioId3 = radioGroup3.getCheckedRadioButtonId();
                int radioId4 = radioGroup4.getCheckedRadioButtonId();



                radioButton = findViewById(radioId);
                radioButton2 = findViewById(radioId2);
                radioButton3 = findViewById(radioId3);
                radioButton4 = findViewById(radioId4);



//                if(radioGroup.isActivated()){
                if (radioButton.getText().equals("if(test){}")) {
                    a = 1;
                } else if (radioButton.getText() == "") {
                    a = 0;
                }

//                }else{
//                    a = 0;
//                }

//                if(radioGroup2.isActivated()){
                if(radioButton2.getText().equals("#010101")) {
                    b = 1;
                }else if(radioButton2.getText().equals("")) {
                    b = 0;
                }
                //}
//                else{
//                    b = 0;
//                }

//                    if(radioGroup3.isActivated()){
                if(radioButton3.getText().equals("<quote> </quote>")) {
                    c = 1;
                }else if(radioButton3.getText().equals("")) {
                    c = 0;
                }
                //}
//                    else{
//                        c = 0;
//                    }


//                        if(radioGroup4.isActivated()){
                if(radioButton4.getText().equals("True")) {
                    d = 1;
                }else if(radioButton4.getText().equals("")) {
                    d = 0;
                }
//                        }
//                        else{
//                            d = 0;
//                        }




                //checkbox solution
                if(check1.isChecked() && check2.isChecked() && check4.isChecked() ){
                    e = 1;
                }else{
                    e =0;
                }



                //Edittext

                EditText nameField = (EditText) findViewById(R.id.androidedit);
                Editable nameEditable = nameField.getText();
                String name = nameEditable.toString();
                name = name.toLowerCase();
                if(name.equals("hypertext markup language") || name.equals("hyper text markup language")){
                    f = 1;
                }else{
                    f= 0 ;
                }

                score = a+b+c+d+e+f;
//                  TextView result = (TextView) findViewById(R.id.androidresults);
//                    result.setText("score is " + score );


                String str  = FirstActivity.svar1;
                Toast mytoast = Toast.makeText(Topic2Activity.this, str + " Scored: " + score,
                        Toast.LENGTH_SHORT);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                mytoast.show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent homeIntent = new Intent(Topic2Activity.this, FirstActivity.class);
                        startActivity(homeIntent);
                        finish();
                    }
                },SPLASH);

            }




        });









    }



}
