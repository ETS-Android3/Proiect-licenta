package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerbsAndTensesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs_and_tenses);

        Button button = (Button) findViewById(R.id.button114);
        Button button1 = (Button) findViewById(R.id.button126);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(VerbsAndTensesActivity.this, VerbsLesson1.class);
                startActivity(intent);
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(VerbsAndTensesActivity.this, IrregularVerbs.class);
                startActivity(intent);
            }

        });


    }
}