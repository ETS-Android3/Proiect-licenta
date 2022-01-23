package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NounsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns);
        Button button = (Button) findViewById(R.id.button152);
        Button button1 = (Button) findViewById(R.id.button154);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NounsActivity.this, CommonNouns.class);
                startActivity(intent);
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NounsActivity.this, ProperNouns.class);
                startActivity(intent);
            }

        });

    }
}