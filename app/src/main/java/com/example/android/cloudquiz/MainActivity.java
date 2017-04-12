package com.example.android.cloudquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void submitQuiz (View view) {

        int score = 0;

        // question 1,2,4 radiobuttons

        // first question
        RadioButton questionOne = (RadioButton) findViewById(R.id.radio_q1_a2);
        boolean answerOne = questionOne.isChecked();
        if (answerOne){
            score++;
        }


        // second question
        RadioButton questionTwo = (RadioButton) findViewById(R.id.radio_q2_a4);
        boolean answerTwo = questionTwo.isChecked();
        if (answerTwo){
            score++;
        }

        // fourth question
        RadioButton questionFourth = (RadioButton) findViewById(R.id.radio_q4_a1);
        boolean answerFourth = questionFourth.isChecked();
        if (answerFourth){
            score++;
        }


        //question 3 EditText view
        EditText question3Input = (EditText) findViewById(R.id.question3);
        String question3 = question3Input.getText().toString();
        question3Input.setInputType(InputType.TYPE_NULL);

            if (question3.equalsIgnoreCase("stratus")){
                score ++;
            }

        //question 5 checkboxes

        CheckBox nimbo = (CheckBox) findViewById(R.id.checkboxq5a1);
        boolean nimbostratus = nimbo.isChecked();

        CheckBox strato = (CheckBox) findViewById(R.id.checkboxq5a4);
        boolean stratocumulus = strato.isChecked();

        CheckBox cirrus = (CheckBox) findViewById(R.id.checkboxq5a3);
        boolean cirruss = cirrus.isChecked();

        CheckBox cirro = (CheckBox) findViewById(R.id.checkboxq5a2);
        boolean cirrocumulus = cirro.isChecked();

        if (stratocumulus && nimbostratus && !cirruss && !cirrocumulus ){
            score++;
        }

        // score info toast
        Toast.makeText(MainActivity.this, "Your score is: " + score + "/5", Toast.LENGTH_LONG).show();
        }







}
