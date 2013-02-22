package com.example.practicaterceraclase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.widget.Toast;

public class ActividadRetornaInformacion extends Activity {

	private static final int CODIGO_PETICION = 4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_retorna_informacion);
	}
	
	public void seleccionarContacto(View v) {
		// Importante, se deben crear los contactos primero en la
		// aplicación de agenda.
		Intent intent = new Intent(Intent.ACTION_PICK, Contacts.CONTENT_URI);
		startActivityForResult(intent, CODIGO_PETICION);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(resultCode == Activity.RESULT_OK && requestCode == CODIGO_PETICION) {
			Toast.makeText(this, "" + data.getExtras(), Toast.LENGTH_LONG).show();
		}
	}

}
