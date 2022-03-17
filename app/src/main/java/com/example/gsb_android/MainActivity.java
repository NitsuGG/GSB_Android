package com.example.gsb_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.ajout:
                Intent intent = new Intent(this, AddEchantillon.class);
                startActivity(intent);
                return true;

            case R.id.liste:
                Intent intent2 = new Intent(this, ListeEchantillon.class);
                startActivity(intent2);
                return true;

            case R.id.maj:
                Intent intent3 = new Intent(this, MajStock.class);
                startActivity(intent3);
                return true;

            case R.id.quitter:
                finish();
        }

        return false;

    }

    public void openAddEchantillon(View view){
        Intent intent = new Intent(this, AddEchantillon.class);
        startActivity(intent);
    }

    public void openListeEchantillon(View view){
        Intent intent = new Intent(this, ListeEchantillon.class);
        startActivity(intent);
    }

    public void openMAJ(View view){
        Intent intent = new Intent(this, MajStock.class);
        startActivity(intent);
    }
}