package com.jojuloma.alarmclock;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class ClockFace extends Activity {

    Intent settingsPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clock_face);
        getActionBar().hide();

        TextClock clockText = (TextClock) findViewById(R.id.textClock);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/irish_uncialfabeta_bold.ttf");
        clockText.setTypeface(typeFace);

        settingsPage = new Intent(ClockFace.this, Settings.class);

        clockText.setClickable(true);
        clockText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(settingsPage);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.clock_face, menu);
        return true;
    }

}
