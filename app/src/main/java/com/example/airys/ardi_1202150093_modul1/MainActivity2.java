package com.example.airys.ardi_1202150093_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtMenu, txtPorsi, txthasil, txtnama;
    String get_Menu, get_Nama;
    Integer get_hasil, get_Porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        txtnama = (TextView)findViewById(R.id.txt_namaresto);
        txtMenu = (TextView)findViewById(R.id.edMenu2);
        txtPorsi = (TextView)findViewById(R.id.edPorsi2);
        txthasil = (TextView) findViewById(R.id.id_hasil);

        Bundle x = getIntent().getExtras();

        get_Menu = x.getString("parse_menu");
        get_Porsi = x.getInt("parse_porsi");
        get_Nama = x.getString("parse_nama");
        get_hasil = x.getInt("parse_hasil");

        txtMenu.setText(get_Menu);
        txtPorsi.setText(String.valueOf(get_Porsi));
        txthasil.setText(String.valueOf(("Rp "+get_hasil)));
        txtnama.setText(get_Nama);

    }
}
