package com.carikostkita;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class kostkambojaujungraya extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kambojaujungraya);
		
		WebView browser = (WebView) findViewById (R.id.kambojaujungraya);
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("file:///android_asset/kostkambojaujungraya.html");
	}
}
