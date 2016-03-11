package com.example.handsomemark.firstcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by handsomemark on 2016/3/2.
 */
public class SecondPage extends AppCompatActivity{

    private Button gt;//gotothirdatsecond button
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        gt = (Button) findViewById(R.id.gotothirdatsecond);
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.ACTION_START");//Implicit intent
                String data = "www.google.com";
                i.putExtra("default_uri",data);
                startActivity(i);
            }
        });
        Log.d("SecondPage13", "On Create");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondPage13", "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondPage13", "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondPage13", "On Destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondPage13", "On Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondPage13", "On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SecondPage13","On Restart");
    }
}
