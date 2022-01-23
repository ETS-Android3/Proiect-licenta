package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediumLevelActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_level);

        button = (Button) findViewById(R.id.button78);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openStartLessonsActivity();
            }
        });
    }
    public void openStartLessonsActivity() {
        Intent intent = new Intent(this, StartLessonsActivity.class);
        startActivity(intent);

   

    }
}