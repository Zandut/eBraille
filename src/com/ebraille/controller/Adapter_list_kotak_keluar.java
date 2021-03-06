package com.ebraille.controller;

import java.util.ArrayList;

import com.example.test.R;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Adapter_list_kotak_keluar extends ArrayAdapter<KotakKeluar>{
	
	private Context context;
	private ArrayList<KotakKeluar> daftar;
	
	public Adapter_list_kotak_keluar(Context context, ArrayList<KotakKeluar> daftar)
	{
		super(context, R.layout.layout_list_kotak_masuk, daftar);
		this.context = context;
		
		this.daftar = daftar;
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = (View) inflater.inflate(R.layout.layout_list_kotak_masuk, parent,false);
		
		TextView text1 = (TextView) row.findViewById(R.id.textView2);
		text1.setText(daftar.get(position).getPesan());
		TextView text2 = (TextView) row.findViewById(R.id.textView1);
		text2.setText(daftar.get(position).getNomer());
		
		return row;
	}

}
