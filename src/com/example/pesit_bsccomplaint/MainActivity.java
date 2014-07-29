package com.example.pesit_bsccomplaint;

import java.io.Externalizable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner spin;
		
		
		String[] values = { "Geyser" , "Electricity" , "Carpentry" , "Plumbing " };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>( this , android.R.layout.simple_spinner_item , values);
		spin = (Spinner) findViewById(R.id.spinner1);
		spin.setAdapter(adapter) ;
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
		
		
		
		
		
	}

}
