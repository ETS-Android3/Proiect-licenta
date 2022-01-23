package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeasonLessonActivity2 extends AppCompatActivity {
private Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_lesson2);

        bt3 = (Button)findViewById(R.id.button81);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.autumn);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }

    public void openSeasonLessonActivity3(View view) {
        Intent intent = new Intent(this, SeasonLessonActivity3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }
}