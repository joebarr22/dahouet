package com.david.projet_dahouet.dao;

import java.util.ArrayList;
import java.sql.*;

import com.david.projet_dahouet.model.Club;
import com.david.projet_dahouet.model.Proprietaire;

public class ProprioDAO {
	private static Connection c;

	public static ArrayList<Club> getClub(){
		c = Connect.cConnect();
		ArrayList<Club> listClub = new ArrayList<Club>();
		Statement stm;
		
		try {
			stm = c.createStatement();
			String sql = "select * from club";
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()){
				int id = rs.getInt("ID_CLUB");
				String nom = new String(rs.getString("NOM_CLUB"));
				Club club1 = new Club(id, nom);
				listClub.add(club1);
				
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listClub;
	}
	
	public static void newProprio(Proprietaire prop1,Club club4){
		c = Connect.cConnect();
		int numProprio = 0;
		PreparedStatement stm;
		try {
			stm = c.prepareStatement("insert into personne (NOM_PERSONNE,PRENOM,MAIL)values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
			stm.setString(1, prop1.getNom());
			stm.setString(2, prop1.getPrénom());
			stm.setString(3, prop1.getMail());
			stm.executeUpdate();
			ResultSet rs = stm.getGeneratedKeys();
			rs.next();
			numProprio = rs.getInt(1);
			stm = c.prepareStatement("insert into proprietaire (ID_PROPRIETAIRE,ID_CLUB,ADRESSE,NO_TELEPHONE)values(?,?,?,?)");
			stm.setInt(1,numProprio);
			stm.setInt(2, club4.getIdClub());
			stm.setString(3, prop1.getAdresse());
			stm.setLong(4,prop1.getTéléphone());
			stm.executeUpdate();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
