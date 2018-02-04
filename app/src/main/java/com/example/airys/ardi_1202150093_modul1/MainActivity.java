package com.example.airys.ardi_1202150093_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "MENU";

    EditText edmenu, edporsi, uangsekarang;
    Button eatbus, abnormal;
    String var_menu,nama1,nama2;
    Integer var_porsi, hrgeatbus, hrgabnormal, uangosas, var_uangsekarang;
    Bundle a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edmenu = (EditText)findViewById(R.id.edMenu);
        edporsi = (EditText)findViewById(R.id.edPorsi);
        eatbus = (Button)findViewById(R.id.btn_eatbus);
        abnormal = (Button)findViewById(R.id.btn_abnormal);
        uangsekarang = (EditText)findViewById(R.id.id_uangsekarang);
        // uangosas = 65500;

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                var_menu = edmenu.getText().toString();
                var_porsi=Integer.valueOf(edporsi.getText().toString().trim());
                var_uangsekarang = Integer.valueOf(uangsekarang.getText().toString());
                nama1 = eatbus.getText().toString();
                hrgeatbus = var_porsi*50000;

                a = new Bundle();

                a.putString("parse_nama", nama1);
                a.putString("parse_menu", var_menu);
                a.putInt("parse_porsi", var_porsi);
                a.putInt("parse_hasil",hrgeatbus);
                intent.putExtras(a);
                startActivity(intent);

                if (hrgeatbus > var_uangsekarang) {
                    Toast toast = Toast.makeText(MainActivity.this, "Jangan makan disini. uang kamu gak cukup.", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "sung. uang kamu cukup kok. makan disini aja", Toast.LENGTH_LONG);
                    toast.show();
                }
            }


        });

        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                var_menu = edmenu.getText().toString();
                var_porsi=Integer.valueOf(edporsi.getText().toString().trim());
                nama2 = abnormal.getText().toString();
                hrgabnormal = var_porsi*30000;

                b = new Bundle();

                b.putString("parse_nama", nama2);
                b.putString("parse_menu", var_menu);
                b.putInt("parse_porsi", var_porsi);
                b.putInt("parse_hasil",hrgabnormal);
                intent.putExtras(b);
                startActivity(intent);

                if (hrgabnormal > var_uangsekarang) {
                    Toast toast = Toast.makeText(MainActivity.this, "Jangan makan disini. uang kamu gak cukup.", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "sung. uang kamu cukup kok. makan disini aja", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });




    }



}
