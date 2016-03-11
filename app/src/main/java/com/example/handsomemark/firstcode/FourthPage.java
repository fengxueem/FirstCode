package com.example.handsomemark.firstcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

/**
 * Created by handsomemark on 2016/3/7.
 */
public class FourthPage extends AppCompatActivity {

    private Button vb;//voice button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_page);
        vb = (Button) findViewById(R.id.voicebutton);
        vb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VOICE_COMMAND);
                startActivity(i);
            }
        });
    }
}
