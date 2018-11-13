package com.example.kson.ksontinker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void printLog() {
        String error = "bug fix";
//        String error = null;
        Toast.makeText(this,error,Toast.LENGTH_LONG).show();
        Log.e("error",error);
    }

    public void hotfix(View view) {
        printLog();
    }
}
