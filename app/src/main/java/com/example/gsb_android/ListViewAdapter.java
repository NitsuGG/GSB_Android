package com.example.gsb_android;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private List<Echantillon> listEchantillon;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListViewAdapter(Context unContext, List<Echantillon> listEchantillon) {
        this.context = unContext;
        this.listEchantillon = listEchantillon;
        layoutInflater = LayoutInflater.from(unContext);
    }

    @Override
    public int getCount() {
        return listEchantillon.size();
    }

    @Override
    public Echantillon getItem(int position) {
        return listEchantillon.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.layout_list_entree, parent, false);
        Echantillon e = listEchantillon.get(position);
        TextView code = convertView.findViewById(R.id.tv_code);
        TextView libelle = convertView.findViewById(R.id.tv_libelle);
        TextView quantite = convertView.findViewById(R.id.tv_quantite);

        code.setText(e.getCode());
        libelle.setText(e.getLibelle());
        quantite.setText(e.getquantiteStock());


        return convertView;
    }
}
