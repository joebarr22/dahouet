package com.david.projet_dahouet.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;


public class Controls {
	
	
	
	
	static final String emailRegex = "^[a-zA-Z0-9._-]{2,}+@[a-zA-Z0-9._-]{2,}\\.[a-z]{2,4}$";
	static Pattern patternEmail = Pattern.compile(emailRegex);
	static final String dateRegex = "^(\\d{4})/(\\d{2})/(\\d{2})$";
	static Pattern patternDate = Pattern.compile(dateRegex);
	
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	
	
	public static boolean isValidEMail(String email){
		
		Matcher matcher = patternEmail.matcher(email);
		return matcher.find();
		
	}
	

	public static boolean isValidDate(String date){
		Matcher matcher = patternDate.matcher(date);
		return matcher.find();
	}

}
