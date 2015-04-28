package com.david.projet_dahouet.metiers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Personne {
	
	
	
	protected String nom;
	protected String mail;
	protected String prénom;
	
	
	public Personne(){
		
	}
	
	
	public Personne(String nom,String mail, String prénom, String téléphone, String adresse){
	
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
