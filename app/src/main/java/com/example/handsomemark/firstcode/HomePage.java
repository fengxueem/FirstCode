package com.example.handsomemark.firstcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    private Button tb;//toast button
    private Button gs;//gotosecond button
    private Button gt;//gotothird button
    private Button gf;//gotofour button
    private Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//works great!
//      requestWindowFeature(Window.FEATURE_NO_TITLE); //is a convenience for calling getWindow().requestFeature(Window.FEATURE_NO_TITLE); not working under AppCompatActivity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);

        gs = (Button) findViewById(R.id.gotosecond);
        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, SecondPage.class);//explicit intent
                startActivity(i);
            }
        });

        gt = (Button) findViewById(R.id.gotothird);
        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, ThirdPage.class);//explicit intent
                startActivity(i);
            }
        });

        gf = (Button) findViewById(R.id.gotofour);
        gf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, FourthPage.class);
                startActivity(i);
            }
        });

        tb = (Button) findViewById(R.id.toastbutton);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t = Toast.makeText(HomePage.this, "Toast", Toast.LENGTH_LONG);
                t.show();
//                PopupMenu popup = new PopupMenu(HomePage13.this,tb); //PopupMenu code
//                popup.getMenuInflater().inflate(R.menu.main,popup.getMenu());
//                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        return true;
//                    }
//                });
//                popup.show();
            }
        });

        Log.d("HomePage13","On Create");
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (t!=null)//cancel the show of a toast if has one.
            t.cancel();
        Log.d("HomePage13", "On Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("HomePage13","On Destory");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("HomePage13","On Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("HomePage13", "On Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("HomePage13", "On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("HomePage13","On Restart");
    }
}
