package com.example.supermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_map = findViewById(R.id.iv_maps);
        iv_map.setOnClickListener(this);
    }

    @Override
    public  void onClick(View v) {
        Intent pindahpeta1 = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(pindahpeta1);
    }

}
