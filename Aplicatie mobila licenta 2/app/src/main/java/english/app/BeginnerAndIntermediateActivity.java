package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeginnerAndIntermediateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_and_intermediate);
        Button button = (Button) findViewById(R.id.button91);
        Button button1 = (Button) findViewById(R.id.button92);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( BeginnerAndIntermediateActivity.this, MainActivity2.class);
                startActivity(intent);
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( BeginnerAndIntermediateActivity.this, IntermediateActivity.class);
                startActivity(intent);
            }

        });
    }
}