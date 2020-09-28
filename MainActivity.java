package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText Angka1, Angka2, Operasi;
    Button button;
    TextView Txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Angka1 = findViewById(R.id.Angka1);
        Angka2 = findViewById(R.id.Angka2);
        Operasi = findViewById(R.id.Operasi);
        button = findViewById(R.id.button);
        Txthasil  = findViewById(R.id.Txthasil);
    }

    public void Hasil(View a) {
        double Hasil_;
        int inputan_1 = Integer.parseInt(Angka1.getText().toString());
        int inputan_2 = Integer.parseInt(Angka2.getText().toString());
        String Aritmatika = Operasi.getText().toString();
        if (Aritmatika.equals("*")) {
            Hasil_ = inputan_1 * inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else if (Aritmatika.equals("/")) {
            Hasil_ = inputan_1 * inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else if (Aritmatika.equals("+")) {
            Hasil_ = inputan_1 + inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else if (Aritmatika.equals("-")) {
            Hasil_ = inputan_1 - inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else {
            Txthasil.setText("Operasi Aritmatika Tidak Sesuai");
        }
    }
}