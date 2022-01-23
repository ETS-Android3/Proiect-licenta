package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
private TextView mScoreView, mQuestion;
private ImageView mImageView;
private Button mTrueButton, mFalseButton;
private boolean mAnswer;
private int mScore = 0;
private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
//initialize
    mScoreView = (TextView)findViewById(R.id.points);
    mImageView = (ImageView)findViewById(R.id.imageView);
    mQuestion = (TextView)findViewById(R.id.question);
    mTrueButton = (Button)findViewById(R.id.trueButton);
    mFalseButton = (Button)findViewById(R.id.falseButton);

    //logic for true button
  mTrueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          if(mAnswer == true){
              mScore++; //update score
              updateScore(mScore); //converts int variable to a String and adds it to mScoreView
            //Perform check before update the question
              if(mQuestionNumber == QuizBook.questions.length) {
                  Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                  Bundle bundle = new Bundle();
                  bundle.putInt("finalScore", mScore);
                  i.putExtras(bundle);
                  QuizActivity.this.finish();
                  startActivity(i);
              }else {
                  updateQuestion();
              }
                     }
          //if the answer is wrong
          else {
              if(mQuestionNumber == QuizBook.questions.length) {
                  Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                  Bundle bundle = new Bundle();
                  bundle.putInt("finalScore", mScore);
                  i.putExtras(bundle);
                  QuizActivity.this.finish();
                  startActivity(i);
              }else {
                  updateQuestion();
              }
          }

      }

  });
        //logic for false button
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer == false){
                    mScore++; //update score
                    updateScore(mScore); //converts int variable to a String and adds it to mScoreView
                    //Perform check before update the question
                    if(mQuestionNumber == QuizBook.questions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }
                }
                //if the answer is wrong
                else {
                    if(mQuestionNumber == QuizBook.questions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultsActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }
                }

            }

        });




    }
    private void updateQuestion(){
        mImageView.setImageResource(QuizBook.images[mQuestionNumber]);
        mQuestion.setText(QuizBook.questions[mQuestionNumber]);
        mAnswer = QuizBook.answers[mQuestionNumber];
        mQuestionNumber++;
    }
public void updateScore(int point){
        mScoreView.setText(""+mScore);
}

}