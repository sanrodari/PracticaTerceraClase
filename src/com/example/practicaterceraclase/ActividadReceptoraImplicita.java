package com.example.practicaterceraclase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActividadReceptoraImplicita extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_receptora_implicita);
		
		TextView textView = (TextView) findViewById(R.id.textoReceptora);
		textView.setText(getIntent().getExtras().getString("valorExtra"));
	}

}
