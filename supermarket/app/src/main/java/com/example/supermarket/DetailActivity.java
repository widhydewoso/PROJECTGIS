package com.example.supermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView datanama,dataalamat, datatelpon;
    Button btntelpon;
    ImageView datagambar;

    public static String  id,nama,alamat,gambar,telpon;
    public static Double latitde,longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama = findViewById(R.id.tv_nama);
        dataalamat = findViewById(R.id.tv_alamat);
        datatelpon = findViewById(R.id.tv_telpon);
        datagambar = findViewById(R.id.img_supermarket);
        btntelpon = findViewById(R.id.btn_telpon);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatelpon.setText(telpon);
        Picasso.get().load(gambar).into(datagambar);

        btntelpon.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telpon));
        startActivity(call);
    }
}
