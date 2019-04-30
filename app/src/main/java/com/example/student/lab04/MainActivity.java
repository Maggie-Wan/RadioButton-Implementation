package com.example.student.lab04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button gotopick;
    //因為有另一個class要取得color和text的值，並且設定initext，所以這三個都要是static
    static TextView initext;
    static int color=0;
    static CharSequence text="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotopick =(Button)findViewById(R.id.gotopick);
        initext =(TextView)findViewById(R.id.initext);
    }

    public void gotopick(View view){
        Intent in=new Intent();
        //可以用this取代MainAcitvity.this
        in.setClass(this,colorPick.class);
        startActivity(in);
    }
}
