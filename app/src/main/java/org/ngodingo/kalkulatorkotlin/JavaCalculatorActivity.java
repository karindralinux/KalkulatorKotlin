package org.ngodingo.kalkulatorkotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JavaCalculatorActivity extends AppCompatActivity {

    int bilPertama;
    int bilKedua;
    String hasil;

    EditText inputPertama;
    EditText inputKedua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_calculator);

        inputPertama = (EditText) findViewById(R.id.input1);
        inputKedua = (EditText) findViewById(R.id.input2);


        Button btnTambah = (Button) findViewById(R.id.btnTambah);
        Button btnKurang = (Button) findViewById(R.id.btnKurang);
        Button btnKali = (Button) findViewById(R.id.btnKali);
        Button btnBagi = (Button) findViewById(R.id.btnBagi);


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputPertama.getText().toString().equals("") || inputKedua.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show();
                } else {
                    String hasilNgitung = tambah();
                    tampilkan(hasilNgitung);
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputPertama.getText().toString().equals("") || inputKedua.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show();
                } else {
                    String hasilNgitung = kurang();
                    tampilkan(hasilNgitung);
                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputPertama.getText().toString().equals("") || inputKedua.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show();
                } else {
                    String hasilNgitung = kali();
                    tampilkan(hasilNgitung);
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputPertama.getText().toString().equals("") || inputKedua.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show();
                } else {
                    String hasilNgitung = bagi();
                    tampilkan(hasilNgitung);
                }
            }
        });

    }

    private void tampilkan(String hasilNgitung) {
        Toast.makeText(this, hasilNgitung, Toast.LENGTH_SHORT).show();
    }

    private String tambah() {
        bilPertama = Integer.parseInt(inputPertama.getText().toString());
        bilKedua = Integer.parseInt(inputKedua.getText().toString());

        hasil = String.valueOf(bilPertama + bilKedua);

        return hasil;
    }


    private String kurang() {
        bilPertama = Integer.parseInt(inputPertama.getText().toString());
        bilKedua = Integer.parseInt(inputKedua.getText().toString());

        hasil = String.valueOf(bilPertama - bilKedua);

        return hasil;

    }


    private String kali() {
        bilPertama = Integer.parseInt(inputPertama.getText().toString());
        bilKedua = Integer.parseInt(inputKedua.getText().toString());

        hasil = String.valueOf(bilPertama * bilKedua);

        return hasil;

    }

    private String bagi() {
        bilPertama = Integer.parseInt(inputPertama.getText().toString());
        bilKedua = Integer.parseInt(inputKedua.getText().toString());

        hasil = String.valueOf(bilPertama / bilKedua);

        return hasil;

    }
}
