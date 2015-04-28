package com.david.projet_dahouet.metiers;



public class Licencie extends Personne{
	
	private int num�roLicence;
	private double pointsFFV;
	private String dateNaissance;
	
	public Licencie(String nom, String mail, String pr�nom, int num�roLicence,
			double pointsFFV, String datenaissance, String dateNaissance){
	
	this.num�roLicence = num�roLicence;
	this.pointsFFV = pointsFFV;
	this.dateNaissance = dateNaissance;
	
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	

}
