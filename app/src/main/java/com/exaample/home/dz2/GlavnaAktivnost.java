package com.exaample.home.dz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class GlavnaAktivnost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavna_aktivnost);
        Toast.makeText(GlavnaAktivnost.this, "Aktivnost je napravljena", Toast.LENGTH_LONG).show();
    }
}
