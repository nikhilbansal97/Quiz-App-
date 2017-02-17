package com.example.android.p3quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //QUESTION 1
        final RadioGroup ques1_group = (RadioGroup) findViewById(R.id.ques1_group);
        final RadioButton ques1option1 = (RadioButton) findViewById(R.id.ques1_option1);
        final LinearLayout ques1_layout = (LinearLayout) findViewById(R.id.ques1_correct);

        //QUESTION2
        final EditText ques2 = (EditText) findViewById(R.id.ques2);
        final LinearLayout ques2_layout = (LinearLayout) findViewById(R.id.ques2_correct);

        //QUESTION3
        final RadioGroup ques3_group = (RadioGroup) findViewById(R.id.ques3_group);
        final RadioButton ques3option1 = (RadioButton) findViewById(R.id.ques3_option1);
        final LinearLayout ques3_layout = (LinearLayout) findViewById(R.id.ques3_correct);

        //QUESTION4
        final RadioGroup ques4_group = (RadioGroup) findViewById(R.id.ques4_group);
        final RadioButton ques4option1 = (RadioButton) findViewById(R.id.ques4_option1);
        final LinearLayout ques4_layout = (LinearLayout) findViewById(R.id.ques4_correct);

        //QUESTION5
        final CheckBox ques5option1 = (CheckBox) findViewById(R.id.ques5_option1);
        final CheckBox ques5option2 = (CheckBox) findViewById(R.id.ques5_option2);
        final CheckBox ques5option3 = (CheckBox) findViewById(R.id.ques5_option3);
        final CheckBox ques5option4 = (CheckBox) findViewById(R.id.ques5_option4);
        final CheckBox ques5option5 = (CheckBox) findViewById(R.id.ques5_option5);
        final CheckBox ques5option6 = (CheckBox) findViewById(R.id.ques5_option6);
        final LinearLayout ques5_layout = (LinearLayout) findViewById(R.id.ques5_correct);

        //QUESTION6
        final RadioGroup ques6_group = (RadioGroup) findViewById(R.id.ques6_group);
        final RadioButton ques6option2 = (RadioButton) findViewById(R.id.ques6_option2);
        final LinearLayout ques6_layout = (LinearLayout) findViewById(R.id.ques6_correct);

        //QUESTION7
        final RadioGroup ques7_group = (RadioGroup) findViewById(R.id.ques7_group);
        final RadioButton ques7option2 = (RadioButton) findViewById(R.id.ques7_option2);
        final LinearLayout ques7_layout = (LinearLayout) findViewById(R.id.ques7_correct);

        //QUESTION8
        final EditText ques8 = (EditText) findViewById(R.id.ques8);
        final LinearLayout ques8_layout = (LinearLayout) findViewById(R.id.ques8_correct);

        //QUESTION9
        final RadioGroup ques9_group = (RadioGroup) findViewById(R.id.ques9_group);
        final RadioButton ques9option2 = (RadioButton) findViewById(R.id.ques9_option2);
        final LinearLayout ques9_layout = (LinearLayout) findViewById(R.id.ques9_correct);

        //QUESTION10
        final RadioGroup ques10_group = (RadioGroup) findViewById(R.id.ques10_group);
        final RadioButton ques10option1 = (RadioButton) findViewById(R.id.ques10_option1);
        final LinearLayout ques10_layout = (LinearLayout) findViewById(R.id.ques10_correct);

        Button end = (Button) findViewById(R.id.end_button);
        Button reset = (Button) findViewById(R.id.reset_button);

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score = 0;
                int count=0;
                if(ques1option1.isChecked())
                {
                    score++;
                    count++;
                    ques1_layout.setVisibility(View.GONE);
                }
                else
                {
                    ques1_layout.setVisibility(View.VISIBLE);
                }

                String ques2_ans = ques2.getText().toString();
                if(ques2_ans.equalsIgnoreCase("Camel"))
                {
                    score++;
                    ques2_layout.setVisibility(View.GONE);
                }
                else
                    ques2_layout.setVisibility(View.VISIBLE);

                if(ques3option1.isChecked())
                {
                    score++;
                    ques3_layout.setVisibility(View.GONE);
                }
                else
                    ques3_layout.setVisibility(View.VISIBLE);

                if(ques4option1.isChecked())
                {
                    score++;
                    ques4_layout.setVisibility(View.GONE);
                }
                else
                    ques4_layout.setVisibility(View.VISIBLE);

                if(ques5option1.isChecked() && ques5option4.isChecked() && ques5option6.isChecked())
                {
                    if(ques5option2.isChecked() && ques5option3.isChecked() && ques5option5.isChecked())
                    {

                    }
                    else
                    {
                        score++;
                        ques5_layout.setVisibility(View.GONE);
                    }

                }
                else
                    ques5_layout.setVisibility(View.VISIBLE);

                if(ques6option2.isChecked())
                {
                    score++;
                    ques6_layout.setVisibility(View.GONE);
                }
                else
                    ques6_layout.setVisibility(View.VISIBLE);

                if(ques7option2.isChecked())
                {
                    score++;
                    ques7_layout.setVisibility(View.GONE);
                }

                String ques8_ans = ques8.getText().toString();
                if(ques8_ans.equalsIgnoreCase("Owl"))
                {
                    score++;
                    ques8_layout.setVisibility(View.GONE);
                }
                else
                    ques8_layout.setVisibility(View.VISIBLE);

                if(ques9option2.isChecked())
                {
                    score++;
                    ques9_layout.setVisibility(View.GONE);
                }
                else
                    ques9_layout.setVisibility(View.VISIBLE);

                if(ques10option1.isChecked())
                {
                    score++;
                    ques10_layout.setVisibility(View.GONE);
                }
                else
                    ques10_layout.setVisibility(View.VISIBLE);

                String score_string = Integer.toString(score);
                score_string = "You scored "+score_string + "/10";

                Toast.makeText(MainActivity.this,score_string, Toast.LENGTH_SHORT).show();

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ques1_group.clearCheck();
                ques3_group.clearCheck();
                ques4_group.clearCheck();
                ques6_group.clearCheck();
                ques7_group.clearCheck();
                ques9_group.clearCheck();
                ques10_group.clearCheck();
                ques1_layout.setVisibility(View.GONE);
                ques2_layout.setVisibility(View.GONE);
                ques3_layout.setVisibility(View.GONE);
                ques4_layout.setVisibility(View.GONE);
                ques5_layout.setVisibility(View.GONE);
                ques6_layout.setVisibility(View.GONE);
                ques7_layout.setVisibility(View.GONE);
                ques8_layout.setVisibility(View.GONE);
                ques9_layout.setVisibility(View.GONE);
                ques10_layout.setVisibility(View.GONE);
                ques2.setText("");
                ques8.setText("");
                ques5option1.setChecked(false);
                ques5option2.setChecked(false);
                ques5option3.setChecked(false);
                ques5option4.setChecked(false);
                ques5option5.setChecked(false);
                ques5option6.setChecked(false);

            }
        });
    }
}
