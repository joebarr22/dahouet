package com.david.projet_dahouet.model;



public class Proprietaire extends Personne {
	
	private String téléphone;
	private String adresse;
	
	
	public Proprietaire(String nom, String mail, String prénom,String téléphone, String adresse){
		
		
		super(nom, mail, prénom, téléphone, adresse);
		
		this.téléphone = téléphone;
		this.adresse = adresse;
	}
	
	public void affichage(){
		super.affichage();
		System.out.println("nom" + nom);
		System.out.println("mail" + mail);
		System.out.println("prénom" + prénom);
		System.out.println("téléphone" + téléphone);
		System.out.println("adresse" + adresse);
		
		
}

	public String getTéléphone() {
		return téléphone;
	}

	public void setTéléphone(String téléphone) {
		this.téléphone = téléphone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}