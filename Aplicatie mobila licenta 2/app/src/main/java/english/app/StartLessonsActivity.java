package english.app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class StartLessonsActivity extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_lessons);
        bt = (Button)findViewById(R.id.button53);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.spring);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });



    }
        public void openSeasonLessonActivity1 (View view) {
            Intent intent = new Intent(this, SeasonLessonActivity1.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }

    }