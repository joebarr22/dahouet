package com.david.projet_dahouet.model;

public class Serie {
	
	protected String nomSerie;
	protected int idSerie;
	
	
	//Je g�n�re le constructeur de ma classe
	
	public Serie(String nomSerie, int idSerie) {
		super();
		this.nomSerie = nomSerie;
		this.idSerie = idSerie;
	}

	//Je g�n�re ses accesseurs et ses modificateurs
	public String getNomSerie() {
		return nomSerie;
	}


	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}


	public int getIdSerie() {
		return idSerie;
	}


	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}
	
	//J'utilise la m�thode toString pour "caster" mon objet en string
	@Override
	public String toString() {
		return idSerie + ":" +nomSerie;
	}

	
	

}
