package com.ccj.tabview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ccj.poptabview.PopTabView;

public class MainActivity extends AppCompatActivity {

    private PopTabView popTabView;
    private TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void simpleFilter(View view){
        startActivity(new Intent(this,SimpleFilterActivity.class));
    }



    public void myFilter(View view){
        startActivity(new Intent(this,MyFilterActivity.class));

    }

}
