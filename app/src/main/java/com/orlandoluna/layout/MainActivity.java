package com.orlandoluna.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity
        extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.LinearLayoutVertical).setOnClickListener(this);
        findViewById(R.id.LinearLayoutHorinzontal).setOnClickListener(this);
        findViewById(R.id.RelativeLayout).setOnClickListener(this);
        findViewById(R.id.TableLayout).setOnClickListener(this);
        findViewById(R.id.FrameLayout).setOnClickListener(this);
        findViewById(R.id.ListView).setOnClickListener(this);
        findViewById(R.id.GridView).setOnClickListener(this);

            }
    @Override
    public void onClick (View view){
        Intent intent = null;
        switch (view.getId()){

            case R.id.LinearLayoutVertical:
                intent = new Intent(MainActivity.this,
                        LinearLayoutVerticalActivity.class);
                break;

            case R.id.LinearLayoutHorinzontal:
                intent = new Intent(MainActivity.this,
                        LinearLayoutHorizontalActivity.class);
                break;

            case R.id.RelativeLayout:
                intent = new Intent(MainActivity.this,
                        RelativeLayoutActivity.class);
                break;

            case R.id.TableLayout:
                intent = new Intent(MainActivity.this,
                        TableLayoutActivity.class);
                break;

            case R.id.FrameLayout:
                intent = new Intent(MainActivity.this,
                        FrameLayoutActivity.class);
                break;

            case R.id.ListView:
                intent = new Intent(MainActivity.this,
                        ListViewActivity.class);
                break;

            case R.id.GridView:
                intent = new Intent(MainActivity.this,
                        GridViewActivity.class);
                break;
        }
        if (intent != null){
            startActivity(intent);
        }
    }
}
