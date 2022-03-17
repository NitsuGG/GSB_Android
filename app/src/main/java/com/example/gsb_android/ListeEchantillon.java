
package com.example.gsb_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListeEchantillon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_echantillon);

        ListView listView = findViewById(R.id.lv_listView);
        ArrayList <Echantillon> e = new ArrayList<>();


        BdAdapter bdd =  new BdAdapter(this);
        bdd.open();

        Cursor cursor = bdd.getData();


        while (cursor.moveToNext()){
            e.add(
                    new Echantillon(cursor.getString(1),
                                    cursor.getString(2),
                                    cursor.getString(3))
            );
        }


        ListViewAdapter adapter = new ListViewAdapter(this, e);
        listView.setAdapter(adapter);

        TextView nbechantillon = findViewById(R.id.tv_nbval);
        nbechantillon.setText("Il y a " + e.size() + " échantillons");

        bdd.close();
    }


    public void leaveListeEchantillon(View view){
        Intent intent = new Intent(this, ListeEchantillon.class);
        finish();
    }


}