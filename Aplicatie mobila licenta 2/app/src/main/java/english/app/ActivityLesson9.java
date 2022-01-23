package english.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLesson9 extends AppCompatActivity {
    private Button bt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson9);
        bt10 = (Button)findViewById(R.id.button96);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sofa);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

    }
    public void openActivityLesson10(View view){
        Intent intent = new Intent(this, ActivityLesson10.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}