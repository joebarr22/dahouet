package com.david.projet_dahouet.model;



public class Commissaire extends Personne {
	
	private String comit�;
	
	
	
	
	

	public Commissaire(int id, String nom, String mail, String pr�nom,
			String comit�) {
		super(id, nom, mail, pr�nom);
		this.comit� = comit�;
	}

	public void affichage(){
		super.affichage();
		System.out.println("Comit�" + comit�);
	}

	public String getComit�() {
		return comit�;
	}

	public void setComit�(String comit�) {
		this.comit� = comit�;
	}
}
