package com.example.gsb_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gsb_android.R;

public class MajStock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majstock);
    }

    public void UpdateStock(View view){
        EditText code = null;
        EditText nbStock = null;

        code = findViewById(R.id.ti_id);
        nbStock = findViewById(R.id.ti_stock);

        BdAdapter bdd =  new BdAdapter(this);
        bdd.open();

        try {
            Echantillon unEchantillon = bdd.getEchantillonWithLib(code.getText().toString());
            unEchantillon.setQuantiteStock(nbStock.getText().toString());

            bdd.updateEchantillon(code.getText().toString(), unEchantillon);
            code.setText("");
            nbStock.setText("");
        }catch (Exception e){
            System.out.println(e + "-----------------------------------------------------------------");
            Toast.makeText(this, "code incorecte: " + code.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }
    public void leaveMajStock(View view){
        Intent intent = new Intent(this, MajStock.class);
        finish();
    }
}
