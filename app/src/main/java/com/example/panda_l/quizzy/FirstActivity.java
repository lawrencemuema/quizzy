package com.example.panda_l.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {

    public static String svar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinnerHome);





        EditText edText1 = (EditText) findViewById(R.id.username);

        edText1.setInputType(InputType.TYPE_CLASS_TEXT);
        svar1 = edText1.getText().toString();








        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(FirstActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 1) {

                    startActivity(new Intent(FirstActivity.this, Topic1Activity.class));

                } else if (i == 2) {


                    startActivity(new Intent(FirstActivity.this, Topic2Activity.class));

                }else if (i == 3) {


                    startActivity(new Intent(FirstActivity.this, Topic3Activity.class));

                }else if (i == 4) {


                    startActivity(new Intent(FirstActivity.this, Topic4Activity.class));

                }




            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


}


