package com.david.projet_dahouet.model;

import java.util.Date;



public class Licencie extends Personne{
	
	private int num�roLicence;
	private double pointsFFV;
	private Date dateNaissance;
	private int anneeLicence;
	
	

	public Licencie(String nom, String mail, String pr�nom, int num�roLicence,
			double pointsFFV, Date dateNaissance, int anneeLicence) {
		super(nom, mail, pr�nom);
		this.num�roLicence = num�roLicence;
		this.pointsFFV = pointsFFV;
		this.dateNaissance = dateNaissance;
		this.anneeLicence = anneeLicence;
	}
	public void affichage(){
		super.affichage();
		System.out.println("Num�ro de licence" + num�roLicence);
		System.out.println("Points FFV" + pointsFFV);
		System.out.println("Date de naissance" + dateNaissance);
		
	}
	public int getNum�roLicence() {
		return num�roLicence;
	}

	public void setNum�roLicence(int num�roLicence) {
		this.num�roLicence = num�roLicence;
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
