package com.example.practicaterceraclase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ActividadImperativa extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		TextView textView = new TextView(this);
		textView.setText(getString(R.string.actividad_imperativa));
		
		RelativeLayout relativeLayout = new RelativeLayout(this);
		relativeLayout.addView(textView);
		
		setContentView(relativeLayout);
	}

}
