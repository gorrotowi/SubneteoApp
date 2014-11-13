package com.unam.subneteo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText edtxOct1, edtxOct2, edtxOct3, edtxOct4, edtxNumHost;
	TextView txtClaseValida;
	Button btn;
	int oct1, oct2, oct3, oct4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		edtxOct1 = (EditText) findViewById(R.id.edtxOct1);
		edtxOct2 = (EditText) findViewById(R.id.edtxOct2);
		edtxOct3 = (EditText) findViewById(R.id.edtxOct3);
		edtxOct4 = (EditText) findViewById(R.id.edtxOct4);
		edtxNumHost = (EditText) findViewById(R.id.edtxNumHost);
		txtClaseValida = (TextView) findViewById(R.id.txtTipoClase);
		btn = (Button) findViewById(R.id.btnCalcular);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!edtxOct1.getText().toString().equals("")
						&& !edtxOct2.getText().toString().equals("")
						&& !edtxOct3.getText().toString().equals("")
						&& !edtxOct4.getText().toString().equals("")) {
					oct1 = Integer.parseInt(edtxOct1.getText().toString());
					oct2 = Integer.parseInt(edtxOct2.getText().toString());
					oct3 = Integer.parseInt(edtxOct3.getText().toString());
					oct4 = Integer.parseInt(edtxOct4.getText().toString());
				} else {
					oct1 = 0;
					oct2 = 0;
					oct3 = 0;
					oct4 = 0;

				}

				if ((oct1 > 191 && oct1 < 224) && (oct2 >= 0 && oct2 < 256)
						&& (oct3 >= 0 && oct3 < 256)
						&& (oct4 >= 0 && oct4 < 256)) {
					// esto es una IP valida de clase C
					txtClaseValida.setText("Valida");
					txtClaseValida.setTextColor(Color.GREEN);
					calcularMascara();
				} else {
					txtClaseValida.setText("Invalida");
					txtClaseValida.setTextColor(Color.RED);
					Toast.makeText(MainActivity.this,
							"Ingresa una IP de clase C valida",
							Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

	public void calcularMascara() {
		String tipoSubred = "";
		int bits = Integer.parseInt(edtxNumHost.getText().toString()) - 24;
		if (bits <= 0) {
			Toast.makeText(MainActivity.this, "Mascara no valida",
					Toast.LENGTH_SHORT).show();
		} else {
			int subredes = (int) Math.pow(2, bits);
			int hostPorRed = 256 / subredes;
			String primerosTresOctetos = oct1 + "." + oct2 + "." + oct3 + ".";
			// String ultimoOcteto = oct4 + "";
			int ultimoOctectoInt = oct4;
			Log.w("Dime Subredes", "Subredes en total " + subredes);
			Log.i("Dime los host por subredes", "Host total " + hostPorRed);

			for (int i = 0; i < subredes; i++) {
				int nombre = i * hostPorRed;
				int primerHost = nombre + 1;
				int ultimoHost = (hostPorRed * (i + 1)) - 2;
				int broadCast = (hostPorRed * (i + 1)) - 1;
				if (ultimoOctectoInt == nombre) {
					tipoSubred = "Red";
				} else if (ultimoOctectoInt == broadCast) {
					tipoSubred = "BroadCast";
				} else if (ultimoOctectoInt > primerHost
						&& ultimoOctectoInt < ultimoHost) {
					tipoSubred = "Host";
				} else {
					tipoSubred = "No se D:";
				}
				Log.d("Nombre de red", primerosTresOctetos + nombre);
				Log.d("Nombre de primer Host", primerosTresOctetos + primerHost);
				Log.d("Nombre de ultimo Host", primerosTresOctetos + ultimoHost);
				Log.d("Nombre del BroadCast", primerosTresOctetos + broadCast);
				Log.i("Tipo de red", tipoSubred);
			}
		}

	}
}
