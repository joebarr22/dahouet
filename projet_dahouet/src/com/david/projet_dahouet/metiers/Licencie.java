package com.david.projet_dahouet.metiers;



public class Licencie extends Personne{
	
	private int numéroLicence;
	private double pointsFFV;
	private String dateNaissance;
	
	public Licencie(String nom, String mail, String prénom, int numéroLicence,
			double pointsFFV, String datenaissance, String dateNaissance){
	
	this.numéroLicence = numéroLicence;
	this.pointsFFV = pointsFFV;
	this.dateNaissance = dateNaissance;
	
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	

}
