package com.example.libpublish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;

import com.example.customtoastgowtham.CustomToastGowtham;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToastGowtham.showToast(MainActivity.this, "Hi..", R.color.colorAccent, Gravity.TOP);
    }
}
