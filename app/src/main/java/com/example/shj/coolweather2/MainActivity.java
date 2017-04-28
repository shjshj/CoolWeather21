package com.example.shj.coolweather2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Connector.getDatabase();//创建数据库
    }
}
