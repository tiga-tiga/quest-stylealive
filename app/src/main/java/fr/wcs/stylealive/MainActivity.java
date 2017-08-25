package fr.wcs.stylealive;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static fr.wcs.stylealive.StyleAlive.sTheme;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTheme(sTheme);
        setContentView(R.layout.activity_main);

        Button themeButton = (Button) findViewById(R.id.theme_button);
        themeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sTheme == R.style.AppTheme) {
                    sTheme = R.style.AppThemeDark;
                } else {
                    sTheme = R.style.AppTheme;
                }
                Activity activity = MainActivity.this;
                activity.finish();
                activity.startActivity(new Intent(activity, activity.getClass()));
            }
        });
    }
}
