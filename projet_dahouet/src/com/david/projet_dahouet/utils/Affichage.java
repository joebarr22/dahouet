package com.david.projet_dahouet.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.david.projet_dahouet.metiers.Commissaire;
import com.david.projet_dahouet.metiers.Licencie;
import com.david.projet_dahouet.metiers.Proprietaire;

public class Affichage {

	public static void afficheLicencie() {

		SimpleDateFormat datnais = new SimpleDateFormat("yyyy/mm/dd");
		  String birthday="1987/01/13";
		  
		  
		  Licencie test=null;
		  try {
		   test = new Licencie("Patageul", "Jem@Patageul.net", "Jem", 1580, 230.8, datnais.parse(birthday), 2015);
		  } catch (ParseException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }

		String affichage = test.toString();
		System.out.println(affichage+"\n");

	}
	
	public static void afficheProprio(){
	 
		Proprietaire test2 = new Proprietaire("Dantoncu", "PrençaDantoncu@laposte.net", "Prença", "0321510669", "22, rue Junes Inaba");
		String affichage2 = test2.toString();
		System.out.println(affichage2+"\n");
	}
	
	
	public static void afficheCommissaire(){
		Commissaire test3 = new Commissaire("Lempaleur", "VladLempaleur@dracula.net", "Vlad", "Nibelheim");
		String affichage3 = test3.toString();
		System.out.println(affichage3+"\n");
			
	}

}
