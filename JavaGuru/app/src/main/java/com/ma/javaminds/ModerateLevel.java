package com.ma.javaminds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ma.javaminds.levels.Moderate;

import com.ma.javaminds.R;

public class ModerateLevel extends AppCompatActivity implements View.OnClickListener {

    TextView noOfQuestions, tvQuestions;
    Button btnOptionA,btnOptionB,btnOptionC,btnOptionD,btnSubmit;

    int score = 0;
    int totalQuestions = Moderate.questions.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int choicesColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Make the activity full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_moderate_level);

        // Apply transition animation
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);

        AppCompatButton btnHomepage = findViewById(R.id.btnHomepage);
        btnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModerateLevel.this, com.ma.javaminds.DifficultyScreen.class);
                startActivity(intent);
            }
        });

        choicesColor = getResources().getColor(R.color.redishColor);

        // Initializing UI elements for a quiz app:
        noOfQuestions = findViewById(R.id.txt_numberOfQuestions);
        tvQuestions = findViewById(R.id.tv_questions);
        btnOptionA = findViewById(R.id.txt_optionA);
        btnOptionB = findViewById(R.id.txt_optionB);
        btnOptionC = findViewById(R.id.txt_optionC);
        btnOptionD = findViewById(R.id.txt_optionD);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnOptionA.setOnClickListener(this);
        btnOptionB.setOnClickListener(this);
        btnOptionC.setOnClickListener(this);
        btnOptionD.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        noOfQuestions.setText(String.valueOf(totalQuestions));

        loadNewQuestion();
    }

    @Override
    public void onClick(View v) {
        btnOptionA.setBackgroundColor(choicesColor);
        btnOptionB.setBackgroundColor(choicesColor);
        btnOptionC.setBackgroundColor(choicesColor);
        btnOptionD.setBackgroundColor(choicesColor);

        Button clikedButton = (Button) v;
        if(clikedButton.getId() == R.id.btnSubmit){
            if(selectedAnswer.equals("")){
                // User hasn't chosen an answer, show a toast
                Toast.makeText(this, "Please choose an answer", Toast.LENGTH_SHORT).show();
                return; // Don't proceed to the next question
            }
            if(selectedAnswer.equals(Moderate.answers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            selectedAnswer = ""; // Reset selected answer
            loadNewQuestion();

        }else {
            selectedAnswer = clikedButton.getText().toString();
            clikedButton.setBackgroundColor(Color.BLACK);
        }
    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestions){
            finishQuiz();
            return;
        }
        tvQuestions.setText(Moderate.questions[currentQuestionIndex]);
        btnOptionA.setText(Moderate.choices[currentQuestionIndex][0]);
        btnOptionB.setText(Moderate.choices[currentQuestionIndex][1]);
        btnOptionC.setText(Moderate.choices[currentQuestionIndex][2]);
        btnOptionD.setText(Moderate.choices[currentQuestionIndex][3]);
    }
    void finishQuiz() {
        if (!isFinishing()) {
            String passStatus = (score > totalQuestions * 0.60) ? "Passed" : "Failed";

            new AlertDialog.Builder(this)
                    .setTitle(passStatus)
                    .setMessage("Score is " + score + " out of " + totalQuestions)
                    .setPositiveButton("Restart", (dialog, which) -> restartQuiz())
                    .setNegativeButton("Homepage", (dialog, which) -> homepage())
                    .setCancelable(false)
                    .show();
        } else {
            // Handle the case when the activity is finishing.
            // You can log a message, perform alternative actions, or simply do nothing.
        }
    }
    void restartQuiz(){
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
    void homepage(){
        //Intents the activity to Homepage
        Intent intent = new Intent(this, com.ma.javaminds.DifficultyScreen.class);
        startActivity(intent);
        finish();
    }
}