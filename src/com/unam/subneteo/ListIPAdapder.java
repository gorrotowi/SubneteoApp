package com.unam.subneteo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListIPAdapder extends BaseAdapter {

	private Context context;
	private int layoutResourceId;
	private ArrayList<ItemListIP> data = new ArrayList<ItemListIP>();

	public ListIPAdapder(Context context, int layoutResourceId,
			ArrayList<ItemListIP> data) {
		super();
		this.context = context;
		this.layoutResourceId = layoutResourceId;
		this.data = data;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	public class HolderView {
		TextView nombre, firstHost, lastHost, broadcast, tipo;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View fila = convertView;
		HolderView holder = null;
		if (fila == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			fila = inflater.inflate(layoutResourceId, parent, false);
			holder = new HolderView();
			holder.nombre = (TextView) fila.findViewById(R.id.nombre);
			holder.firstHost = (TextView) fila.findViewById(R.id.firstHost);
			holder.lastHost = (TextView) fila.findViewById(R.id.lastHost);
			holder.broadcast = (TextView) fila.findViewById(R.id.broadcast);
			holder.tipo = (TextView) fila.findViewById(R.id.tipo);
			fila.setTag(holder);
		} else {
			holder = (HolderView) fila.getTag();
		}

		ItemListIP item = (ItemListIP) data.get(position);
		holder.nombre.setText(item.getNombre());
		holder.firstHost.setText(item.getFirsHost());
		holder.lastHost.setText(item.getLastHost());
		holder.broadcast.setText(item.getBroadcast());
		holder.tipo.setText(item.getTipo());
		return fila;
	}

}
