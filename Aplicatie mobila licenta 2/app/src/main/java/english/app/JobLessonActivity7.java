package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobLessonActivity7 extends AppCompatActivity {
    private Button bt8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_lesson7);
        bt8 = (Button)findViewById(R.id.button89);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.teacher);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

    }
    public void openActivityLesson8(View view){
        Intent intent = new Intent(this, ActivityLesson8.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}