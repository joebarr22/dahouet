package com.david.projet_dahouet.model;

public class Personne {

	public String nom;
	public String mail;
	public String pr�nom;
	
	
	public Personne(){
		
		
	}
	



public Personne(String nom, String mail, String pr�nom) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.pr�nom = pr�nom;
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

public String getPr�nom() {
	return pr�nom;
}

public void setPr�nom(String pr�nom) {
	this.pr�nom = pr�nom;
}
public void affichage()
{
	System.out.println("nom"+" "+nom);
	System.out.println("mail"+" "+mail);
	System.out.println("pr�nom"+" "+pr�nom);
}
}
