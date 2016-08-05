package com.carikostkita;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class MainUtama extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuutama);
		
	}
	
	public void onksClick (View theButton)
	{
		Intent ks=new Intent (this,kost.class);
		startActivity(ks);
		
	}
}
