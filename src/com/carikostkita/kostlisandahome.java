package com.carikostkita;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class kostlisandahome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lisandahome);
		
		WebView browser = (WebView) findViewById (R.id.lisandahome);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/kostlisandahome.html");
	}
}
