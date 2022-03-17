package com.example.gsb_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddEchantillon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_echantillon);
    }

    public void AjouterEchantillon(View view){
        EditText code = null;
        EditText libelle = null;
        EditText quantite = null;

        code = findViewById(R.id.ti_code);
        libelle = findViewById(R.id.ti_libelle);
        quantite = findViewById(R.id.ti_stock);

        BdAdapter bdd =  new BdAdapter(this);
        bdd.open();

        bdd.insererEchantillon(new Echantillon(code.getText().toString(), libelle.getText().toString(), quantite.getText().toString()));
    }

    public void leaveAddEchantillon(View view){
        Intent intent = new Intent(this, AddEchantillon.class);
        finish();
    }
}