package com.example.student.lab04;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class colorPick extends AppCompatActivity {
    Button cancel,ok;
    RadioButton red,orange,green,blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pick);
        cancel =(Button)findViewById(R.id.cancel);
        ok =(Button)findViewById(R.id.ok);
        red =(RadioButton)findViewById(R.id.red);
        green =(RadioButton)findViewById(R.id.green);
        orange =(RadioButton)findViewById(R.id.orange);
        blue =(RadioButton)findViewById(R.id.blue);
    }
    public void picked(View view){
        if(red.isChecked()){
            //取得radio button的文字顏色丟給color(因為是屬於MainAcitvity的，所以要用MainActivity.color)
            MainActivity.color=red.getCurrentTextColor();
            //取得radio button的文字丟給text
            MainActivity.text=red.getText();
            //設定initext這個textview的背景顏色
            MainActivity.initext.setBackgroundColor(MainActivity.color);
            //設定initext這個textview的文字
            MainActivity.initext.setText(MainActivity.text);
            //設定initext這個textview的文字顏色做法是0xAARRGGBB(AA代表透明度alpha，不透明為ff)
            MainActivity.initext.setTextColor(0xffffffff);
        }
        if(orange.isChecked()){
            MainActivity.color=orange.getCurrentTextColor();
            MainActivity.text=orange.getText();
            MainActivity.initext.setBackgroundColor(MainActivity.color);
            MainActivity.initext.setText(MainActivity.text);
            MainActivity.initext.setTextColor(0xffffffff);
        }
        if(green.isChecked()){
            MainActivity.color=green.getCurrentTextColor();
            MainActivity.text=green.getText();
            MainActivity.initext.setBackgroundColor(MainActivity.color);
            MainActivity.initext.setText(MainActivity.text);
            MainActivity.initext.setTextColor(0xffffffff);
        }
        if(blue.isChecked()){
            MainActivity.color=blue.getCurrentTextColor();
            MainActivity.text=blue.getText();
            MainActivity.initext.setBackgroundColor(MainActivity.color);
            MainActivity.initext.setText(MainActivity.text);
            MainActivity.initext.setTextColor(0xffffffff);
        }

    }
    public void cancel(View view){
        //setChecked:Changes the checked state of this button，所以恢復到紅色被選擇的狀態
        red.setChecked(true);
    }

    public void ok(View view){
        picked(view);
        //Call this when your activity is done and should be closed
        finish();
    }
}
