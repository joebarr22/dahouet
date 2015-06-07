package com.david.projet_dahouet.controller;

import java.util.ArrayList;

import com.david.projet_dahouet.IHM.UIProprio;
import com.david.projet_dahouet.IHM.UIVoilier;
import com.david.projet_dahouet.dao.ProprioDAO;
import com.david.projet_dahouet.dao.VoilierDAO;
import com.david.projet_dahouet.model.Classe;
import com.david.projet_dahouet.model.Club;
import com.david.projet_dahouet.model.Proprietaire;
import com.david.projet_dahouet.model.Serie;

public class Controller {
	
	public void InitUIVoilier(){
		UIVoilier framevoilier = new UIVoilier();
		framevoilier.setVisible(true);
		
	}
	
	public void InitUIProprio(){
		UIProprio frameProprio = new UIProprio();
		frameProprio.setVisible(true);
	}
	
	public ArrayList<Club> fillProprio(){
		ArrayList<Club> listClub = new ArrayList<Club>();
		listClub = ProprioDAO.getClub();
		return listClub;
	}
	
	public void createProprio(Proprietaire prop,Club club3){
		ProprioDAO.newProprio(prop,club3);
		
	}
	
	public ArrayList<Proprietaire> proprioInit(){
		ArrayList<Proprietaire> listProprio = new ArrayList<Proprietaire>();
		listProprio=ProprioDAO.getProprio();
		return listProprio;
}
	

	public ArrayList<Serie> serieInit(){
		ArrayList<Serie> listSerie = new ArrayList<Serie>();
		listSerie=VoilierDAO.getSerie();
		return listSerie;
	}
	
	public ArrayList<Classe> classeInit(Serie serie){
		ArrayList<Classe> listClasse = new ArrayList<Classe>();
		listClasse=VoilierDAO.getClasse(serie);
		return listClasse;
	}
}
