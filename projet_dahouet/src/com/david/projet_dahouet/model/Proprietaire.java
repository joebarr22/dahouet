package com.david.projet_dahouet.model;



public class Proprietaire extends Personne {
	
	private String t�l�phone;
	private String adresse;
	
	
	public Proprietaire(String nom, String mail, String pr�nom,String t�l�phone, String adresse){
		
		
		super(nom, mail, pr�nom, t�l�phone, adresse);
		
		this.t�l�phone = t�l�phone;
		this.adresse = adresse;
	}
	
	public void affichage(){
		super.affichage();
		System.out.println("nom" + nom);
		System.out.println("mail" + mail);
		System.out.println("pr�nom" + pr�nom);
		System.out.println("t�l�phone" + t�l�phone);
		System.out.println("adresse" + adresse);
		
		
}

	public String getT�l�phone() {
		return t�l�phone;
	}

	public void setT�l�phone(String t�l�phone) {
		this.t�l�phone = t�l�phone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}