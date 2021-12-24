package com.oyster.myanimeindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hellomusheer();
    }

    public static void hellomusheer(){
        Log.d("string madhe kela", "hellomusheer: ");
    }
}