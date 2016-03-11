package com.example.handsomemark.firstcode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by handsomemark on 2016/3/2.
 */
public class ThirdPage extends AppCompatActivity{


    private Button gtw;//gotoweb button
    private EditText wab;//webaddbar edittext
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        Intent callerIntent = getIntent();
        String defaultUri = callerIntent.getStringExtra("default_uri");
        wab = (EditText) findViewById(R.id.webaddbar);
        wab.setText(defaultUri);
        gtw = (Button) findViewById(R.id.gotoweb);
        gtw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);//implicit call web browser
                i.setData(Uri.parse("http://"+wab.getText()));
                startActivity(i);
            }
        });
        Log.d("ThirdPage13", "On Create");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ThirdPage13", "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ThirdPage13", "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ThirdPage13", "On Destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ThirdPage13", "On Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ThirdPage13", "On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ThirdPage13","On Restart");
    }
}
