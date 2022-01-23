package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GrammarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);
        Button button = (Button) findViewById(R.id.button21);
        Button button1 = (Button) findViewById(R.id.button99);
        Button button2 = (Button) findViewById(R.id.button109);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GrammarActivity.this, VerbsAndTensesActivity.class);
                startActivity(intent);
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GrammarActivity.this, NounsActivity.class);
                startActivity(intent);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GrammarActivity.this, AdjectiveActivity.class);
                startActivity(intent);
            }

        });

    }


}