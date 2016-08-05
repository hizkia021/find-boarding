package com.carikostkita;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class kostsabigi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sabigi);
		
		WebView browser = (WebView) findViewById (R.id.sabigi);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/kostsabigi.html");
	}
}
