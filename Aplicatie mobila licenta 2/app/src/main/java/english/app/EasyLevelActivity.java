package english.app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasyLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_level);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EasyLevelActivity.this, AlphabetActivity.class);
                startActivity(intent);
            }

        });
        Button button1 = (Button) findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EasyLevelActivity.this, NumbersActivity.class);
                startActivity(intent);
            }

        });
        Button button2 = (Button) findViewById(R.id.button28);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EasyLevelActivity.this, ColorsActivity.class);
                startActivity(intent);
            }

        });
        Button button3 = (Button) findViewById(R.id.button39);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EasyLevelActivity.this, AnimalsActivity.class);
                startActivity(intent);
            }

        });

        Button button4 = (Button) findViewById(R.id.button40);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EasyLevelActivity.this, FruitsAndVegActivity.class);
                startActivity(intent);
            }

        });
    }
}