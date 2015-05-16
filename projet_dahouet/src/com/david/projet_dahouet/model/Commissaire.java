package com.david.projet_dahouet.model;



public class Commissaire extends Personne {
	
	private String comité;
	
	
	
	
	

	public Commissaire(int id, String nom, String mail, String prénom,
			String comité) {
		super(id, nom, mail, prénom);
		this.comité = comité;
	}

	public void affichage(){
		super.affichage();
		System.out.println("Comité" + comité);
	}

	public String getComité() {
		return comité;
	}

	public void setComité(String comité) {
		this.comité = comité;
	}
}
