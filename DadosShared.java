package com.recuperacao.recuperao;

import android.content.Context;
import android.content.SharedPreferences;

public class DadosShared {

	// LogCat tag
	private static String TAG = DadosShared.class.getSimpleName();

	// Shared Preferences
	SharedPreferences pref;

	SharedPreferences.Editor editor;
	Context _context;

	// Shared pref mode
	int PRIVATE_MODE = 0;

	// Shared preferences nome do checkbox ou radio
	private static final String PREF_NAME = "LISTADEJOGOS";
	private static final String KEY_CARTA = "cartas";
	private static final String KEY_FAMOSOS = "famasos";
	private static final String KEY_ESPORT = "esports";
	private static final String KEY_ONLINE = "onlines";
	private static final String KEY_SIMULADO = "simulados";
	private static final String KEY_LIVRE = "livre";
	private static final String KEY_MEDIO = "medio";
	private static final String KEY_ADULTO= "adulto";


	public DadosShared(Context context) {
		this._context = context;
		pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
		editor = pref.edit();
	}

	///CARTA
	public void setCarta(boolean carta) {

		editor.putBoolean(KEY_CARTA, carta);

		// commit salvando
		editor.commit();
	}
	public boolean getCarta(){ return pref.getBoolean(KEY_CARTA, false); }


	//FAMOSOS
	public void setFamosos(boolean famosos) {

		editor.putBoolean(KEY_FAMOSOS, famosos);

		// commit salvando
		editor.commit();
	}
	public boolean getFamasos(){ return pref.getBoolean(KEY_FAMOSOS, false); }

	//ESPORT
	public void setEsport(boolean esport){
		editor.putBoolean(KEY_ESPORT, esport);

		// commit salvando
		editor.commit();
	}
	public boolean getEsport(){ return pref.getBoolean(KEY_ESPORT, false); }

	//ONLINE
	public void setOnline(boolean online){
		editor.putBoolean(KEY_ONLINE, online);

		// commit salvando
		editor.commit();
	}
	public boolean getOnline(){ return pref.getBoolean(KEY_ONLINE, false); }

	//SIMULADOR
	public void setSimulador(boolean simulador){
		editor.putBoolean(KEY_SIMULADO, simulador);

		// commit salvando
		editor.commit();
	}
	public boolean getSimulador(){ return pref.getBoolean(KEY_SIMULADO, false); }

	//LIVRE
	public void setLivre(boolean livre){
		editor.putBoolean(KEY_LIVRE, livre);

		// commit salvando
		editor.commit();
	}
	public boolean getLivre(){ return pref.getBoolean(KEY_LIVRE, false); }

	//MEDIO
	public void setMedio(boolean medio){
		editor.putBoolean(KEY_MEDIO, medio);

		// commit salvando
		editor.commit();
	}
	public boolean getMedio(){ return pref.getBoolean(KEY_MEDIO, false); }

	//ADULTO
	public void setAdulto(boolean adulto){
		editor.putBoolean(KEY_ADULTO, adulto);

		// commit salvando
		editor.commit();
	}
	public boolean getAdulto(){ return pref.getBoolean(KEY_ADULTO, false); }

}
