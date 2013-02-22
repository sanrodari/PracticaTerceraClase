package com.example.practicaterceraclase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadIniciarImplicita extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_iniciar_implicita);
	}
	
	public void iniciarImplicita(View v) {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.putExtra("valorExtra", getString(R.string.title_activity_iniciar_implicita));
		startActivity(intent);
	}

}
