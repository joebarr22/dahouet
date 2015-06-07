package com.david.projet_dahouet.model;

public class Voilier {

	protected int idVoilier;
	protected String nom;
	protected double coef;

	public Voilier( int idVoilier, String nom, double coef) {
		super();
		this.idVoilier = idVoilier;
		this.nom = nom;
		this.coef = coef;
	}

	public int getIdVoilier() {
		return idVoilier;
	}

	public void setIdVoilier(int idVoilier) {
		this.idVoilier = idVoilier;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}

}
