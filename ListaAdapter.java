package com.recuperacao.recuperao;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaAdapter extends ArrayAdapter<String> {
 
 private final Activity context;
 private final String[] itemtitulo;
 private final String[] itemdescricao;
 private final Integer[] imgid;
 
 public ListaAdapter(Activity context, String[] itemtitulo, String[] itemdescricao, Integer[] imgid) {
 super(context, R.layout.lista, itemtitulo);
 // TODO Auto-generated constructor stub
 
 this.context=context;
 this.itemtitulo =itemtitulo;
 this.itemdescricao= itemdescricao;
 this.imgid=imgid;
 }
 
 public View getView(int position, View view, ViewGroup parent) {
 LayoutInflater inflater=context.getLayoutInflater();
 View rowView=inflater.inflate(R.layout.lista, null,true);
 
 TextView txtTitle = (TextView) rowView.findViewById(R.id.tv_titulo);
 ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
 TextView extratxt = (TextView) rowView.findViewById(R.id.tv_descricao);
 
 txtTitle.setText(itemtitulo[position]);
 imageView.setImageResource(imgid[position]);
 extratxt.setText("Descrição: "+ itemdescricao[position]);
 return rowView;
 
 };
}