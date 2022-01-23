package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeasonLessonActivity3 extends AppCompatActivity {
    private Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_lesson3);
        bt4 = (Button)findViewById(R.id.button82);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.winter);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


    }

    public void openJobsLessonActivity4(View view) {
        Intent intent = new Intent(this, JobsLessonActivity4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    }