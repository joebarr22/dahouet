package com.david.projet_dahouet.model;



public class Proprietaire extends Personne {
	
	private long téléphone;
	private String adresse;
	
	
	
	

	public Proprietaire(int id, String nom, String mail, String prénom,
			long téléphone, String adresse) {
		super(id, nom, mail, prénom);
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

	public long getTéléphone() {
		return téléphone;
	}

	public void setTéléphone(long téléphone) {
		this.téléphone = téléphone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		return id + " : " +  prénom + " "+ nom;
	}

}