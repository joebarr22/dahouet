package com.david.projet_dahouet.model;

public class Personne {
	protected int id;
	protected String nom;
	protected String mail;
	protected String pr�nom;

	public Personne() {

	}

	public Personne(int id, String nom, String mail, String pr�nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.mail = mail;
		this.pr�nom = pr�nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void affichage() {
		System.out.println("nom" + " " + nom);
		System.out.println("mail" + " " + mail);
		System.out.println("pr�nom" + " " + pr�nom);
	}
}
