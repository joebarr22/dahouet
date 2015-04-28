package com.david.projet_dahouet.metiers;



public class Commissaire extends Personne {
	
	private String comit�;
	
	
	public Commissaire(String nom, String mail, String pr�nom, String comit�){
		
		
			super(nom, mail, pr�nom, comit�, comit�);
			
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
