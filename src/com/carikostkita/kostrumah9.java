package com.carikostkita;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class kostrumah9 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rumah9);
		
		WebView browser = (WebView) findViewById (R.id.rumah9);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/kostrumah9.html");
	}
}
