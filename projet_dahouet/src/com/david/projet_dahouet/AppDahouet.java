package com.david.projet_dahouet;

import com.david.projet_dahouet.metiers.Personne;
import com.david.projet_dahouet.utils.Controls;
import com.david.projet_dahouet.utils.Lire;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppDahouet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			System.out.println("Veuillez saisir une adresse Email: ");
			String email = Lire.S();
			
			Boolean validemail = Controls.isValidEMail(email);
			
			if (validemail = true);
			System.out.println("Adresse email valide");
			
			else if (validemail = false);
			System.out.println("Adresse email invalide");
		
			
		}
	}

}
