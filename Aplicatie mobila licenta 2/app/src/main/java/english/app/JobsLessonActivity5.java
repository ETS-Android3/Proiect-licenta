package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobsLessonActivity5 extends AppCompatActivity {
    private Button bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_lesson5);

        bt6 = (Button)findViewById(R.id.button85);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.detective);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


        }
    public void openJobsLessonActivity6(View view){
        Intent intent = new Intent(this, JobsLessonActivity6.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}