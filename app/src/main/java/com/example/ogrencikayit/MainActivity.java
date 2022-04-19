package com.example.ogrencikayit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Ogrenci> ogrenciler= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText edtAdi= findViewById(R.id.edtadi);
        final EditText edtSoyadi= findViewById(R.id.edtsoyadi);
        final EditText edtDogum= findViewById(R.id.edtdogum);
        final EditText edtSinif= findViewById(R.id.edtsinif);

        Button kayit= findViewById(R.id.kayit);
        Button listele= findViewById(R.id.listele);


        List<Ogrenci> ogrenciler= new ArrayList<>();

        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Ogrenci ogrenci= new Ogrenci(edtAdi.getText().toString(),edtSoyadi.getText().toString(),edtDogum.getText().toString(),edtSinif.getText().toString());



                ogrenciler.add(ogrenci);
                edtAdi.setText("");
                edtSoyadi.setText("");
                edtDogum.setText("");
                edtSinif.setText("");

            }
        });

        listele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (Ogrenci ogrenci:ogrenciler){
                    System.out.println(ogrenci.getAdi());
                    System.out.println(ogrenci.getSoyadi());
                    System.out.println(ogrenci.getDogumTarihii());
                    System.out.println(ogrenci.getSinifi());
                }

            }
        });


    }
}