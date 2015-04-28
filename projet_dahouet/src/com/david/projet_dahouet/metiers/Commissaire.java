package com.david.projet_dahouet.metiers;



public class Commissaire extends Personne {
	
	private String comité;
	
	
	public Commissaire(String nom, String mail, String prénom, String comité){
		
		
			super(nom, mail, prénom, comité, comité);
			
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
