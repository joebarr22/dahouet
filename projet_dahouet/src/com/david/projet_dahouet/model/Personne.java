package com.david.projet_dahouet.model;

public class Personne {

	public String nom;
	public String mail;
	public String prénom;
	
	
	public Personne(){
		
		
	}
	



public Personne(String nom, String mail, String prénom) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.prénom = prénom;
	}




public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getPrénom() {
	return prénom;
}

public void setPrénom(String prénom) {
	this.prénom = prénom;
}
public void affichage()
{
	System.out.println("nom"+" "+nom);
	System.out.println("mail"+" "+mail);
	System.out.println("prénom"+" "+prénom);
}
}
