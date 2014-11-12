package com.gorroedwin.subneteoip;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends Activity {
    EditText ip1, ip2, ip3, ip4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip1 = (EditText) findViewById(R.id.ipOne);
        ip2 = (EditText) findViewById(R.id.ipTwo);
        ip3 = (EditText) findViewById(R.id.ipTree);
        ip4 = (EditText) findViewById(R.id.ipFour);
    }

}
