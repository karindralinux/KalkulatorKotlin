package org.ngodingo.kalkulatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

//untuk nge-inject view supaya tidak perlu menggunakan findviewById
import kotlinx.android.synthetic.main.activity_kotlin_calculator.*

class KotlinCalculatorActivity : AppCompatActivity() {

    var bilPertama: Int = 0
    var bilKedua: Int = 0
    var hasil: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_calculator)

        //tidak memakai findViewById karena viewnya sudah di inject dengan import diatas coba dicek
        //nama variable sesuai dengan id pada view
        btnTambah.setOnClickListener {
            if (input1.text.toString().equals("") || input2.text.toString().equals("")) {
                Toast.makeText(applicationContext, "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show()
            } else {
                val hasilNgitung = tambah()
                tampilkan(hasilNgitung)

            }
        }

        btnKurang.setOnClickListener {
            if (input1.text.toString().equals("") || input2.text.toString().equals("")) {
                Toast.makeText(applicationContext, "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show()
            } else {
                val hasilNgitung = kurang()
                tampilkan(hasilNgitung)

            }
        }

        btnKali.setOnClickListener {
            if (input1.text.toString().equals("") || input2.text.toString().equals("")) {
                Toast.makeText(applicationContext, "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show()
            } else {
                val hasilNgitung = kali()
                tampilkan(hasilNgitung)

            }
        }

        btnBagi.setOnClickListener {
            if (input1.text.toString().equals("") || input2.text.toString().equals("")) {
                Toast.makeText(applicationContext, "Tolong diisi dulu bilangannya :D", Toast.LENGTH_SHORT).show()
            } else {
                val hasilNgitung = bagi()
                tampilkan(hasilNgitung)

            }
        }


    }

    fun kurang(): String {
        bilPertama = input1.text.toString().toInt()
        bilKedua = input2.text.toString().toInt()

        hasil = (bilPertama - bilKedua).toString()

        return hasil

    }

    fun tambah(): String {
        bilPertama = input1.text.toString().toInt()
        bilKedua = input2.text.toString().toInt()

        hasil = (bilPertama + bilKedua).toString()

        return hasil

    }


    fun kali(): String {
        bilPertama = input1.text.toString().toInt()
        bilKedua = input2.text.toString().toInt()

        hasil = (bilPertama * bilKedua).toString()

        return hasil

    }

    fun bagi(): String {
        bilPertama = input1.text.toString().toInt()
        bilKedua = input2.text.toString().toInt()

        hasil = (bilPertama / bilKedua).toString()

        return hasil

    }


    fun tampilkan(hasilNgitung: String) {
        Toast.makeText(this, hasilNgitung, Toast.LENGTH_SHORT).show()
    }

}

