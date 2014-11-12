package com.unam.ipcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Formatter;


public class MainActivity extends Activity {
	
Button Boton;
int Caso16;
int Caso8;
TextView Clas;
Spinner ComboNM;
Boolean ConvertBin = Boolean.valueOf(true);
Boolean ConvertHex = Boolean.valueOf(false);
Boolean ConvertOct = Boolean.valueOf(false);
EditText DireccionIP;
int EnteroHost16;
int EnteroHost24;
int EnteroHost8;
int EnteroNM16;
int EnteroNM24;
int EnteroNM8;
EditText NM;
EditText Resul;
TextView TVIPConvert;
TextView TVNMConvert;
ArrayAdapter<CharSequence> adapter16;
ArrayAdapter<CharSequence> adapter24;
ArrayAdapter<CharSequence> adapter8;
	  
	public void Adapter16(){
		this.ComboNM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
	      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
	      {
	        switch (paramAnonymousInt)
	        {
	        default:
	          return;
	        case 0:
	          MainActivity.this.NM.setText("255.255.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 1;
	        	  MainActivity.this.EnteroHost16 = 65534;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 1:
	        	MainActivity.this.NM.setText("255.255.128.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 2;
	        	  MainActivity.this.EnteroHost16 = 32766;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 2:
	        	MainActivity.this.NM.setText("255.255.192.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 4;
	        	  MainActivity.this.EnteroHost16 = 16382;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 3:
	        	MainActivity.this.NM.setText("255.255.224.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 8;
	        	  MainActivity.this.EnteroHost16 = 8190;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 4:
	        	MainActivity.this.NM.setText("255.255.240.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 16;
	        	  MainActivity.this.EnteroHost16 = 4094;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 5:
	        	MainActivity.this.NM.setText("255.255.248.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 32;
	        	  MainActivity.this.EnteroHost16 = 2046;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 6:
	        	MainActivity.this.NM.setText("255.255.252.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 64;
	        	  MainActivity.this.EnteroHost16 = 1022;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 7:
	        	MainActivity.this.NM.setText("255.255.254.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 128;
	        	  MainActivity.this.EnteroHost16 = 510;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 8:
	        	MainActivity.this.NM.setText("255.255.255.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 256;
	        	  MainActivity.this.EnteroHost16 = 254;
	        	  MainActivity.this.Caso16 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 9:
	        	MainActivity.this.NM.setText("255.255.255.128");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 512;
	            MainActivity.this.EnteroHost16 = 126;
	            MainActivity.this.Caso16 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 10:
	        	MainActivity.this.NM.setText("255.255.255.192");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 1024;
	        	  MainActivity.this.EnteroHost16 = 62;
	        	  MainActivity.this.Caso16 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 11:
	        	MainActivity.this.NM.setText("255.255.255.224");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 2048;
	        	  MainActivity.this.EnteroHost16 = 30;
	        	  MainActivity.this.Caso16 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 12:
	        	MainActivity.this.NM.setText("255.255.255.240");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 4096;
	        	  MainActivity.this.EnteroHost16 = 14;
	        	  MainActivity.this.Caso16 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 13:
	        	MainActivity.this.NM.setText("255.255.255.248");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM16 = 8192;
	        	  MainActivity.this.EnteroHost16 = 6;
	        	  MainActivity.this.Caso16 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 14:
	        }
	        MainActivity.this.NM.setText("255.255.255.252");
	        if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	MainActivity.this.NMBinaria();
	        while (true)
	        {
	        	MainActivity.this.EnteroNM16 = 16384;
	        	MainActivity.this.EnteroHost16 = 2;
	        	MainActivity.this.Caso16 = 2;
	          return;
	          if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMOctal();
	          else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMHexadecimal();
	        }
	      }

	      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
	      {
	    	  MainActivity.this.NM.setText("");
	      }
	    });
	  }
	  
	  public void Adapter24()
	  {
	    this.ComboNM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
	    {
	      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
	      {
	        switch (paramAnonymousInt)
	        {
	        default:
	          return;
	        case 0:
	        	MainActivity.this.NM.setText("255.255.255.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM24 = 1;
	        	  MainActivity.this.EnteroHost24 = 254;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 1:
	        	MainActivity.this.NM.setText("255.255.255.128");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM24 = 2;
	        	  MainActivity.this.EnteroHost24 = 126;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 2:
	        	MainActivity.this.NM.setText("255.255.255.192");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM24 = 4;
	        	  MainActivity.this.EnteroHost24 = 62;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 3:
	        	MainActivity.this.NM.setText("255.255.255.224");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM24 = 8;
	        	  MainActivity.this.EnteroHost24 = 30;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 4:
	        	MainActivity.this.NM.setText("255.255.255.240");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM24 = 16;
	        	  MainActivity.this.EnteroHost24 = 14;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 5:
	        	MainActivity.this.NM.setText("255.255.255.248");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM24 = 32;
	        	  MainActivity.this.EnteroHost24 = 6;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 6:
	        }
	        MainActivity.this.NM.setText("255.255.255.252");
	        if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	MainActivity.this.NMBinaria();
	        while (true)
	        {
	        	MainActivity.this.EnteroNM24 = 64;
	        	MainActivity.this.EnteroHost24 = 2;
	          return;
	          if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMOctal();
	          else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMHexadecimal();
	        }
	      }

	      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
	      {
	    	  MainActivity.this.NM.setText("");
	      }
	    });
	  }
	  public void Adapter8()
	  {
	    this.ComboNM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
	    {
	      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
	      {
	        switch (paramAnonymousInt)
	        {
	        default:
	          return;
	        case 0:
	        	MainActivity.this.NM.setText("255.0.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 1;
	        	  MainActivity.this.EnteroHost8 = 16777214;
	        	  MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 1:
	        	MainActivity.this.NM.setText("255.128.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 2;
	        	  MainActivity.this.EnteroHost8 = 8388606;
	        	  MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 2:
	        	MainActivity.this.NM.setText("255.192.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 4;
	        	  MainActivity.this.EnteroHost8 = 4194302;
	        	  MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 3:
	        	MainActivity.this.NM.setText("255.224.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 8;
	        	  MainActivity.this.EnteroHost8 = 2097150;
	        	  MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 4:
	        	MainActivity.this.NM.setText("255.240.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 16;
	        	  MainActivity.this.EnteroHost8 = 1048574;
	        	  MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 5:
	        	MainActivity.this.NM.setText("255.248.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	MainActivity.this.EnteroNM8 = 32;
	            MainActivity.this.EnteroHost8 = 524286;
	            MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 6:
	        	MainActivity.this.NM.setText("255.252.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 64;
	            MainActivity.this.EnteroHost8 = 262142;
	            MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 7:
	        	MainActivity.this.NM.setText("255.254.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 128;
	            MainActivity.this.EnteroHost8 = 131070;
	            MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 8:
	        	MainActivity.this.NM.setText("255.255.0.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 256;
	            MainActivity.this.EnteroHost8 = 65534;
	            MainActivity.this.Caso8 = 1;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 9:
	        	MainActivity.this.NM.setText("255.255.128.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 512;
	            MainActivity.this.EnteroHost8 = 32766;
	            MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 10:
	        	MainActivity.this.NM.setText("255.255.192.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 1024;
	        	  MainActivity.this.EnteroHost8 = 16382;
	        	  MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 11:
	        	MainActivity.this.NM.setText("255.255.224.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 2048;
	        	  MainActivity.this.EnteroHost8 = 8190;
	        	  MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 12:
	        	MainActivity.this.NM.setText("255.255.240.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 4096;
	        	  MainActivity.this.EnteroHost8 = 4094;
	        	  MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 13:
	        	MainActivity.this.NM.setText("255.255.248.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 8192;
	            MainActivity.this.EnteroHost8 = 2046;
	            MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 14:
	        	MainActivity.this.NM.setText("255.255.252.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 16384;
	        	  MainActivity.this.EnteroHost8 = 1022;
	            MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 15:
	        	MainActivity.this.NM.setText("255.255.254.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 32768;
	        	  MainActivity.this.EnteroHost8 = 510;
	        	  MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 16:
	        	MainActivity.this.NM.setText("255.255.255.0");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 65536;
	        	  MainActivity.this.EnteroHost8 = 254;
	        	  MainActivity.this.Caso8 = 2;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 17:
	        	MainActivity.this.NM.setText("255.255.255.128");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 131072;
	        	  MainActivity.this.EnteroHost8 = 126;
	        	  MainActivity.this.Caso8 = 3;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 18:
	        	MainActivity.this.NM.setText("255.255.255.192");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 262144;
	        	  MainActivity.this.EnteroHost8 = 62;
	        	  MainActivity.this.Caso8 = 3;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 19:
	        	MainActivity.this.NM.setText("255.255.255.224");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 524288;
	        	  MainActivity.this.EnteroHost8 = 30;
	        	  MainActivity.this.Caso8 = 3;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 20:
	        	MainActivity.this.NM.setText("255.255.255.240");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 1048576;
	        	  MainActivity.this.EnteroHost8 = 14;
	            MainActivity.this.Caso8 = 3;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 21:
	        	MainActivity.this.NM.setText("255.255.255.248");
	          if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMBinaria();
	          while (true)
	          {
	        	  MainActivity.this.EnteroNM8 = 2097152;
	        	  MainActivity.this.EnteroHost8 = 6;
	        	  MainActivity.this.Caso8 = 3;
	            return;
	            if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMOctal();
	            else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	            	MainActivity.this.NMHexadecimal();
	          }
	        case 22:
	        }
	        MainActivity.this.NM.setText("255.255.255.252");
	        if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	MainActivity.this.NMBinaria();
	        while (true)
	        {
	        	MainActivity.this.EnteroNM8 = 4194304;
	          MainActivity.this.EnteroHost8 = 2;
	          MainActivity.this.Caso8 = 3;
	          return;
	          if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMOctal();
	          else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
	        	  MainActivity.this.NMHexadecimal();
	        }
	      }

	      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
	      {
	    	  MainActivity.this.NM.setText("");
	      }
	    });
	  }

	  public void CalcularIP()
	  {
	    String str1 = "";
	    String str2 = this.DireccionIP.getText().toString();
	    if (str2.matches("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})"))
	    {
	      String[] arrayOfString = str2.split("\\.");
	      int i = Integer.parseInt(arrayOfString[0]);
	      int j = Integer.parseInt(arrayOfString[1]);
	      int k = Integer.parseInt(arrayOfString[2]);
	      int m = Integer.parseInt(arrayOfString[3]);
	      if ((i >= 0) && (i <= 127))
	        switch (this.Caso8)
	        {
	        default:
	        case 1:
	        case 2:
	        case 3:
	        }
	      do
	      {
	        return;
	        int i15 = 256 / this.EnteroNM8;
	        int i16 = 1;
	        for (int i17 = 0; ; i17++)
	        {
	          if (i17 >= this.EnteroNM8)
	          {
	            this.Resul.setText(str1);
	            return;
	          }
	          if ((j >= i15 * i17) && (j <= -1 + i15 * i16))
	            str1 = "Id de Subred: \n\t\t\t" + i16 + "\nSubred:\n\t\t\t" + i + "." + i15 * i17 + "." + 0 + "." + 0 + "\n" + "Rango de Host:\n\t\t\t" + i + "." + i15 * i17 + "." + 0 + "." + 1 + " - " + i + "." + (-1 + i15 * i16) + "." + 255 + "." + 254 + "\n" + "Broadcast\n\t\t\t" + i + "." + (-1 + i15 * i16) + "." + 255 + "." + 255 + "\nHost por Subred:\n\t\t\t" + this.EnteroHost8 + "\nNumero de Subredes:\n\t\t\t" + this.EnteroNM8;
	          i16++;
	        }
	        int i12 = 65536 / this.EnteroNM8;
	        int i13 = 1;
	        for (int i14 = 0; ; i14++)
	        {
	          if (i14 >= this.EnteroNM8)
	          {
	            this.Resul.setText(str1);
	            return;
	          }
	          if ((k >= i12 * i14) && (k <= -1 + i12 * i13))
	            str1 = "Id de Subred: \n\t\t\t" + i13 + "\nSubred:\n\t\t\t" + i + "." + j + "." + i12 * i14 + "." + 0 + "\n" + "Rango de Host:\n\t\t\t" + i + "." + j + "." + i12 * i14 + "." + 1 + " - " + i + "." + j + "." + (-1 + i12 * i13) + "." + 254 + "\n" + "Broadcast\n\t\t\t" + i + "." + j + "." + (-1 + i12 * i13) + "." + 255 + "\nHost por Subred:\n\t\t\t" + this.EnteroHost8 + "\nNumero de Subredes:\n\t\t\t" + this.EnteroNM8;
	          i13++;
	        }
	        int i9 = 16777216 / this.EnteroNM8;
	        int i10 = 1;
	        for (int i11 = 0; ; i11++)
	        {
	          if (i11 >= this.EnteroNM8)
	          {
	            this.Resul.setText(str1);
	            return;
	          }
	          if ((m >= i9 * i11) && (m <= -1 + i9 * i10))
	            str1 = "Id de Subred: \n\t\t\t" + i10 + "\nSubred:\n\t\t\t" + i + "." + j + "." + k + "." + i9 * i11 + "\n" + "Rango de Host:\n\t\t\t" + i + "." + j + "." + k + "." + (1 + i9 * i11) + " - " + i + "." + j + "." + k + "." + (-2 + i9 * i10) + "\n" + "Broadcast\n\t\t\t" + i + "." + j + "." + k + "." + (-1 + i9 * i10) + "\nHost por Subred:\n\t\t\t" + this.EnteroHost8 + "\nNumero de Subredes:\n\t\t\t" + this.EnteroNM8;
	          i10++;
	        }
	        if ((i >= 128) && (i <= 191))
	        {
	          switch (this.Caso16)
	          {
	          default:
	            return;
	          case 1:
	            int i6 = 256 / this.EnteroNM16;
	            int i7 = 1;
	            for (int i8 = 0; ; i8++)
	            {
	              if (i8 >= this.EnteroNM16)
	              {
	                this.Resul.setText(str1);
	                return;
	              }
	              if ((k >= i6 * i8) && (k <= -1 + i6 * i7))
	                str1 = "Id de Subred: \n\t\t\t" + i7 + "\nSubred:\n\t\t\t" + i + "." + j + "." + i6 * i8 + "." + 0 + "\n" + "Rango de Host:\n\t\t\t" + i + "." + j + "." + i6 * i8 + "." + 1 + " - " + i + "." + j + "." + (-1 + i6 * i7) + "." + 254 + "\n" + "Broadcast\n\t\t\t" + i + "." + j + "." + (-1 + i6 * i7) + "." + 255 + "\nHost por Subred:\n\t\t\t" + this.EnteroHost16 + "\nNumero de Subredes:\n\t\t\t" + this.EnteroNM16;
	              i7++;
	            }
	          case 2:
	          }
	          int i3 = 65536 / this.EnteroNM16;
	          int i4 = 1;
	          for (int i5 = 0; ; i5++)
	          {
	            if (i5 >= this.EnteroNM16)
	            {
	              this.Resul.setText(str1);
	              return;
	            }
	            if ((m >= i3 * i5) && (m <= -1 + i3 * i4))
	              str1 = "Id de Subred: \n\t\t\t" + i4 + "\nSubred:\n\t\t\t" + i + "." + j + "." + k + "." + i3 * i5 + "\n" + "Rango de Host:\n\t\t\t" + i + "." + j + "." + k + "." + (1 + i3 * i5) + " - " + i + "." + j + "." + k + "." + (-2 + i3 * i4) + "\n" + "Broadcast\n\t\t\t" + i + "." + j + "." + k + "." + (-1 + i3 * i4) + "\nHost por Subred:\n\t\t\t" + this.EnteroHost16 + "\nNumero de Subredes:\n\t\t\t" + this.EnteroNM16;
	            i4++;
	          }
	        }
	      }
	      while ((i < 192) || (i > 223));
	      int n = 256 / this.EnteroNM24;
	      int i1 = 1;
	      for (int i2 = 0; ; i2++)
	      {
	        if (i2 >= this.EnteroNM24)
	        {
	          this.Resul.setText(str1);
	          return;
	        }
	        if ((m >= n * i2) && (m <= -1 + n * i1))
	          str1 = "Id de Subred: \n\t\t\t" + i1 + "\nSubred:\n\t\t\t" + i + "." + j + "." + k + "." + n * i2 + "\n" + "Rango de Host:\n\t\t\t" + i + "." + j + "." + k + "." + (1 + n * i2) + " - " + i + "." + j + "." + k + "." + (-2 + n * i1) + "\n" + "Broadcast\n\t\t\t" + i + "." + j + "." + k + "." + (-1 + n * i1) + "\nHost por Subred:\n\t\t\t" + this.EnteroHost24 + "\nNumero de Subredes:\n\t\t\t" + this.EnteroNM24;
	        i1++;
	      }
	    }
	    Toast.makeText(this, "Valor de IP mal definido.", Toast.LENGTH_SHORT).show();
	    this.Clas.setText(2130968582);
	  }
	  
	  public void IPBinaria()
	  {
	    String str1 = this.DireccionIP.getText().toString();
	    int[] arrayOfInt = new int[4];
	    String[] arrayOfString = str1.split("\\.");
	    Formatter localFormatter1 = new Formatter();
	    Formatter localFormatter2 = new Formatter();
	    Formatter localFormatter3 = new Formatter();
	    Formatter localFormatter4 = new Formatter();
	    for (int i = 0; ; i++)
	    {
	      if (i >= arrayOfString.length)
	      {
	        StringBuilder localStringBuilder1 = new StringBuilder();
	        Object[] arrayOfObject1 = new Object[1];
	        arrayOfObject1[0] = Integer.valueOf(arrayOfInt[0]);
	        String str2 = localFormatter1.format("%08d", arrayOfObject1);
	        StringBuilder localStringBuilder2 = new StringBuilder();
	        Object[] arrayOfObject2 = new Object[1];
	        arrayOfObject2[0] = Integer.valueOf(arrayOfInt[1]);
	        String str3 = localFormatter2.format("%08d", arrayOfObject2);
	        StringBuilder localStringBuilder3 = new StringBuilder();
	        Object[] arrayOfObject3 = new Object[1];
	        arrayOfObject3[0] = Integer.valueOf(arrayOfInt[2]);
	        String str4 = localFormatter3.format("%08d", arrayOfObject3);
	        StringBuilder localStringBuilder4 = new StringBuilder();
	        Object[] arrayOfObject4 = new Object[1];
	        arrayOfObject4[0] = Integer.valueOf(arrayOfInt[3]);
	        String str5 = localFormatter4.format("%08d", arrayOfObject4);
	        this.TVIPConvert.setText(str2 + "." + str3 + "." + str4 + "." + str5);
	        return;
	      }
	      arrayOfInt[i] = Integer.parseInt(Integer.toString(Integer.parseInt(arrayOfString[i], 10), 2));
	    }
	  }

	  public void IPHexadecimal()
	  {
	    String str = this.DireccionIP.getText().toString();
	    String[] arrayOfString1 = new String[4];
	    String[] arrayOfString2 = str.split("\\.");
	    for (int i = 0; ; i++)
	    {
	      if (i >= arrayOfString2.length)
	      {
	        this.TVIPConvert.setText(arrayOfString1[0] + " . " + arrayOfString1[1] + " . " + arrayOfString1[2] + " . " + arrayOfString1[3] + "   Hex");
	        return;
	      }
	      arrayOfString1[i] = Integer.toHexString(Integer.parseInt(arrayOfString2[i]));
	    }
	  }

	  public void IPOctal()
	  {
	    String str = this.DireccionIP.getText().toString();
	    String[] arrayOfString1 = new String[4];
	    String[] arrayOfString2 = str.split("\\.");
	    for (int i = 0; ; i++)
	    {
	      if (i >= arrayOfString2.length)
	      {
	        this.TVIPConvert.setText(arrayOfString1[0] + " . " + arrayOfString1[1] + " . " + arrayOfString1[2] + " . " + arrayOfString1[3] + "   Oct");
	        return;
	      }
	      arrayOfString1[i] = Integer.toOctalString(Integer.parseInt(arrayOfString2[i]));
	    }
	  }

	  public void NMBinaria()
	  {
	    String str1 = this.NM.getText().toString();
	    int[] arrayOfInt = new int[4];
	    String[] arrayOfString = str1.split("\\.");
	    Formatter localFormatter1 = new Formatter();
	    Formatter localFormatter2 = new Formatter();
	    Formatter localFormatter3 = new Formatter();
	    Formatter localFormatter4 = new Formatter();
	    for (int i = 0; ; i++)
	    {
	      if (i >= arrayOfString.length)
	      {
	        StringBuilder localStringBuilder1 = new StringBuilder();
	        Object[] arrayOfObject1 = new Object[1];
	        arrayOfObject1[0] = Integer.valueOf(arrayOfInt[0]);
	        String str2 = localFormatter1.format("%08d", arrayOfObject1);
	        StringBuilder localStringBuilder2 = new StringBuilder();
	        Object[] arrayOfObject2 = new Object[1];
	        arrayOfObject2[0] = Integer.valueOf(arrayOfInt[1]);
	        String str3 = localFormatter2.format("%08d", arrayOfObject2);
	        StringBuilder localStringBuilder3 = new StringBuilder();
	        Object[] arrayOfObject3 = new Object[1];
	        arrayOfObject3[0] = Integer.valueOf(arrayOfInt[2]);
	        String str4 = localFormatter3.format("%08d", arrayOfObject3);
	        StringBuilder localStringBuilder4 = new StringBuilder();
	        Object[] arrayOfObject4 = new Object[1];
	        arrayOfObject4[0] = Integer.valueOf(arrayOfInt[3]);
	        String str5 = localFormatter4.format("%08d", arrayOfObject4);
	        this.TVNMConvert.setText(str2 + "." + str3 + "." + str4 + "." + str5);
	        return;
	      }
	      arrayOfInt[i] = Integer.parseInt(Integer.toString(Integer.parseInt(arrayOfString[i], 10), 2));
	    }
	  }

	  public void NMHexadecimal()
	  {
	    String str = this.NM.getText().toString();
	    String[] arrayOfString1 = new String[4];
	    String[] arrayOfString2 = str.split("\\.");
	    for (int i = 0; ; i++)
	    {
	      if (i >= arrayOfString2.length)
	      {
	        this.TVNMConvert.setText(arrayOfString1[0] + " . " + arrayOfString1[1] + " . " + arrayOfString1[2] + " . " + arrayOfString1[3] + "   Hex");
	        return;
	      }
	      arrayOfString1[i] = Integer.toHexString(Integer.parseInt(arrayOfString2[i]));
	    }
	  }

	  public void NMOctal()
	  {
	    String str = this.NM.getText().toString();
	    String[] arrayOfString1 = new String[4];
	    String[] arrayOfString2 = str.split("\\.");
	    for (int i = 0; ; i++)
	    {
	      if (i >= arrayOfString2.length)
	      {
	        this.TVNMConvert.setText(arrayOfString1[0] + " . " + arrayOfString1[1] + " . " + arrayOfString1[2] + " . " + arrayOfString1[3] + "   Oct");
	        return;
	      }
	      arrayOfString1[i] = Integer.toOctalString(Integer.parseInt(arrayOfString2[i]));
	    }
	  }

	  public void Toastmal()
	  {
	    Toast.makeText(this, "Valor de IP mal definido", Toast.LENGTH_SHORT).show();
	  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        //((AdView)findViewById()).loadAd(new AdRequest());
        this.ComboNM = ((Spinner)findViewById());
        this.DireccionIP = ((EditText)findViewById(R.id.edtxIP));
        this.Clas = ((TextView)findViewById());
        this.Resul = ((EditText)findViewById());
        this.NM = ((EditText)findViewById());
        this.Boton = ((Button)findViewById(R.id.btnCalcIP));
        this.TVIPConvert = ((TextView)findViewById());
        this.TVNMConvert = ((TextView)findViewById());
        this.adapter24 = ArrayAdapter.createFromResource(this, 2131034112, 17367048);
        this.adapter24.setDropDownViewResource();
        this.adapter16 = ArrayAdapter.createFromResource(this, 2131034113, 17367048);
        this.adapter16.setDropDownViewResource();
        this.adapter8 = ArrayAdapter.createFromResource(this, 2131034114, 17367048);
        this.adapter8.setDropDownViewResource();
        this.DireccionIP.setText("192.168.0.1");
        this.ComboNM.setAdapter(this.adapter24);
        this.Clas.setText();
        Adapter24();
        IPBinaria();
        this.DireccionIP.addTextChangedListener(new TextWatcher()
        {
          public void afterTextChanged(Editable paramAnonymousEditable)
          {
            String str = MainActivity.this.DireccionIP.getText().toString();
            if ((!str.equals("")) && (!str.matches("\\s+")) && (str.matches("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})")))
            {
              String[] arrayOfString = str.split("\\.");
              int i = Integer.parseInt(arrayOfString[0]);
              int j = Integer.parseInt(arrayOfString[1]);
              int k = Integer.parseInt(arrayOfString[2]);
              int m = Integer.parseInt(arrayOfString[3]);
              if ((i > 255) || (j > 255) || (k > 255) || (m > 255))
              {
            	  MainActivity.this.Toastmal();
            	  MainActivity.this.TVIPConvert.setText(2130968585);
            	  MainActivity.this.Clas.setText(2130968582);
            	  MainActivity.this.ComboNM.setClickable(false);
            	  MainActivity.this.Boton.setClickable(false);
              }
              do
              {
                return;
                if ((i >= 0) && (i <= 126))
                {
                	MainActivity.this.Adapter8();
                  if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                	  MainActivity.this.IPBinaria();
                  while (true)
                  {
                	  MainActivity.this.Clas.setText(2130968579);
                    MainActivity.this.ComboNM.setAdapter(MainActivity.this.adapter8);
                    MainActivity.this.ComboNM.setClickable(true);
                    MainActivity.this.Boton.setClickable(true);
                    return;
                    if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPOctal();
                    else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPHexadecimal();
                  }
                }
                if (i == 127)
                {
                	MainActivity.this.Adapter8();
                  if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                	  MainActivity.this.IPBinaria();
                  while (true)
                  {
                	MainActivity.this.ComboNM.setAdapter(MainActivity.this.adapter8);
                    MainActivity.this.Clas.setText("Clase: A \"LoopBack\"\nVisite: http://es.wikipedia.org/wiki/Loopback para conocer más detalles.");
                    Linkify.addLinks(MainActivity.this.Clas, 1);
                    MainActivity.this.ComboNM.setClickable(true);
                    MainActivity.this.Boton.setClickable(true);
                    return;
                    if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPOctal();
                    else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPHexadecimal();
                  }
                }
                if ((i >= 128) && (i <= 191))
                {
                	MainActivity.this.Adapter16();
                  if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                	  MainActivity.this.IPBinaria();
                  while (true)
                  {
                	  MainActivity.this.Clas.setText(2130968580);
                    MainActivity.this.ComboNM.setAdapter(MainActivity.this.adapter16);
                    MainActivity.this.ComboNM.setClickable(true);
                    MainActivity.this.Boton.setClickable(true);
                    return;
                    if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPOctal();
                    else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPHexadecimal();
                  }
                }
                if ((i >= 192) && (i <= 223))
                {
                	MainActivity.this.Adapter24();
                  if ((MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                	  MainActivity.this.IPBinaria();
                  while (true)
                  {
                	  MainActivity.this.Clas.setText(2130968581);
                    MainActivity.this.ComboNM.setAdapter(MainActivity.this.adapter24);
                    MainActivity.this.ComboNM.setClickable(true);
                    MainActivity.this.Boton.setClickable(true);
                    return;
                    if ((!MainActivity.this.ConvertBin.booleanValue()) && (MainActivity.this.ConvertOct.booleanValue()) && (!MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPOctal();
                    else if ((!MainActivity.this.ConvertBin.booleanValue()) && (!MainActivity.this.ConvertOct.booleanValue()) && (MainActivity.this.ConvertHex.booleanValue()))
                    	MainActivity.this.IPHexadecimal();
                  }
                }
                if ((i >= 224) && (i <= 239))
                {
                	MainActivity.this.Clas.setText("Clase: D \nVisite: http://es.wikipedia.org/wiki/Direcci%C3%B3n_IP para conocer más detalles.");
                  Linkify.addLinks(MainActivity.this.Clas, 15);
                  MainActivity.this.ComboNM.setClickable(false);
                  MainActivity.this.Boton.setClickable(false);
                  return;
                }
              }
              while ((i < 240) || (i > 255));
              MainActivity.this.Clas.setText("Clase: E \nVisite: http://es.wikipedia.org/wiki/Direcci%C3%B3n_IP para conocer más detalles.");
              Linkify.addLinks(MainActivity.this.Clas, 15);
              MainActivity.this.ComboNM.setClickable(false);
              MainActivity.this.Boton.setClickable(false);
              return;
            }
            MainActivity.this.TVIPConvert.setText(2130968585);
            MainActivity.this.Clas.setText(2130968583);
            MainActivity.this.ComboNM.setClickable(false);
            MainActivity.this.Boton.setClickable(false);
          }

          public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
          }

          public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
          }
        });
        this.Boton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
        	  MainActivity.this.CalcularIP();
        	 // MainActivity.this.QuitarTeclado(MainActivity.this.DireccionIP);
        	  //MainActivity.this.QuitarTeclado(MainActivity.this.ComboNM);
          }
        });
      }

      public boolean onCreateOptionsMenu(Menu paramMenu)
      {
        super.onCreateOptionsMenu(paramMenu);
        getMenuInflater().inflate(2131099648, paramMenu);
        return true;
      }

      public boolean onOptionsItemSelected(MenuItem paramMenuItem)
      {
        switch (paramMenuItem.getItemId())
        {
        default:
          return false;
        case 2131165202:
          this.ConvertBin = Boolean.valueOf(true);
          this.ConvertOct = Boolean.valueOf(false);
          this.ConvertHex = Boolean.valueOf(false);
          Toast.makeText(this, "Se convertirá a binario", Toast.LENGTH_SHORT).show();
          IPBinaria();
          NMBinaria();
          return false;
        case 2131165203:
          this.ConvertBin = Boolean.valueOf(false);
          this.ConvertOct = Boolean.valueOf(true);
          this.ConvertHex = Boolean.valueOf(false);
          Toast.makeText(this, "Se convertirá a octal", Toast.LENGTH_SHORT).show();
          IPOctal();
          NMOctal();
          return false;
        case 2131165204:
          this.ConvertBin = Boolean.valueOf(false);
          this.ConvertOct = Boolean.valueOf(false);
          this.ConvertHex = Boolean.valueOf(true);
          Toast.makeText(this, "Se convertirá a hexadecimal", Toast.LENGTH_SHORT).show();
          IPHexadecimal();
          NMHexadecimal();
          return false;
        case 2131165205:
          //startActivity(new Intent(this, About.class));
          Toast.makeText(getApplicationContext(), "algo sucede", Toast.LENGTH_LONG).show();
          
          return false;
        case 2131165206:
        }
        finish();
        return false;
      }

    }

