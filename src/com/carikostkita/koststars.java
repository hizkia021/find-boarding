package com.carikostkita;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class koststars extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stars);
		
		WebView browser = (WebView) findViewById (R.id.stars);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/koststars.html");
	}
}
