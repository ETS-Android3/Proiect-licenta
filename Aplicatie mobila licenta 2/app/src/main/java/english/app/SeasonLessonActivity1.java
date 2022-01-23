package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeasonLessonActivity1 extends AppCompatActivity {
    private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_lesson1);
        bt2 = (Button)findViewById(R.id.button80);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.summer);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }

    public void openSeasonLessonActivity2(View view) {
        Intent intent = new Intent(this, SeasonLessonActivity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


    }
}