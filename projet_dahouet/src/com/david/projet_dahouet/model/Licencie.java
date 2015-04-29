package com.david.projet_dahouet.model;

import java.util.Date;



public class Licencie extends Personne{
	
	private int numéroLicence;
	private double pointsFFV;
	private Date dateNaissance;
	private int anneeLicence;
	
	

	public Licencie(String nom, String mail, String prénom, int numéroLicence,
			double pointsFFV, Date dateNaissance, int anneeLicence) {
		super(nom, mail, prénom);
		this.numéroLicence = numéroLicence;
		this.pointsFFV = pointsFFV;
		this.dateNaissance = dateNaissance;
		this.anneeLicence = anneeLicence;
	}
	public void affichage(){
		super.affichage();
		System.out.println("Numéro de licence" + numéroLicence);
		System.out.println("Points FFV" + pointsFFV);
		System.out.println("Date de naissance" + dateNaissance);
		
	}
	public int getNuméroLicence() {
		return numéroLicence;
	}

	public void setNuméroLicence(int numéroLicence) {
		this.numéroLicence = numéroLicence;
	}

	public double getPointsFFV() {
		return pointsFFV;
	}

	public void setPointsFFV(double pointsFFV) {
		this.pointsFFV = pointsFFV;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getAnneeLicence() {
		return anneeLicence;
	}
	public void setAnneeLicence(int anneeLicence) {
		this.anneeLicence = anneeLicence;
	}

	

}
