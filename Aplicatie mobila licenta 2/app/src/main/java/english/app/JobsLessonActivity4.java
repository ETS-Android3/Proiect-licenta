package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobsLessonActivity4 extends AppCompatActivity {
    private Button bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_lesson4);
        bt5 = (Button)findViewById(R.id.button84);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.artist);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

    }

    public void openJobsLessonActivity5(View view) {
        Intent intent = new Intent(this, JobsLessonActivity5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    }
