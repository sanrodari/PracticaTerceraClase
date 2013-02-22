package com.example.practicaterceraclase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivididadIniciarExplicita extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activididad_iniciar_explicita);
	}
	
	public void iniciarExplicita(View v) {
		Intent intent = new Intent(this, ActividadDeclarativa.class);
		startActivity(intent);
	}

}
