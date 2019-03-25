package com.example.pljc_pc.uas_mfernanda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class formuas extends AppCompatActivity {

    Button bsimpan, bkosongkan;
    EditText enamalengkap;
    TextView thasil;
    RadioGroup rgwaktu
            ;
    Spinner sevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formuas);

        // inisialisasi
        bsimpan = (Button) findViewById(R.id.simpan);
        bkosongkan = (Button) findViewById(R.id.kosongkan);
        enamalengkap = (EditText) findViewById(R.id.isinama);
        thasil = (TextView) findViewById(R.id.hasil);
        rgwaktu = (RadioGroup) findViewById(R.id.waktu);
        sevent = (Spinner) findViewById (R.id.event);


        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnama = String.valueOf(enamalengkap.getText().toString());


                int gender = rgwaktu.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputjk = String.valueOf(jk.getText().toString());

                thasil.setText("\n" +

                        "Nama lengkap : " + inputnama + "\n" +
                        "event: " + sevent.getSelectedItem().toString() + "\n" +) ;



            }
        });

    }
}