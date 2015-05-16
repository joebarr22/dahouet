package com.david.projet_dahouet.controller;

import java.util.ArrayList;

import com.david.projet_dahouet.IHM.UIProprio;
import com.david.projet_dahouet.IHM.UIVoilier;
import com.david.projet_dahouet.dao.ProprioDAO;
import com.david.projet_dahouet.model.Club;
import com.david.projet_dahouet.model.Proprietaire;

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
}
