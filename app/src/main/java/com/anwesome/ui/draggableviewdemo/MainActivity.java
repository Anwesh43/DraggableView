package com.anwesome.ui.draggableviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.imv)
    public void onImvClick(View view) {
        Toast.makeText(this,"Clicked on imageview",Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn)
    public void onBtnClick(View view) {
        Toast.makeText(this,"Clicked On button",Toast.LENGTH_SHORT).show();
    }
}
