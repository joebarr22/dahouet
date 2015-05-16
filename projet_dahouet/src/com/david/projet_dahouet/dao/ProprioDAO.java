package com.david.projet_dahouet.dao;

import java.util.ArrayList;
import java.sql.*;

import com.david.projet_dahouet.model.Club;

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
}
