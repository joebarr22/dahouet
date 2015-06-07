package com.david.projet_dahouet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.david.projet_dahouet.model.Classe;
import com.david.projet_dahouet.model.Proprietaire;
import com.david.projet_dahouet.model.Serie;
import com.david.projet_dahouet.model.Voilier;

public class VoilierDAO {
	private static Connection c;

	public static ArrayList<Serie> getSerie() {

		c = Connect.cConnect();

		ArrayList<Serie> listSerie = new ArrayList<>();
		// test avec select
		Statement stm;

		try {
			stm = c.createStatement();

			String sql = "select * from serie";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				String nom = new String(rs.getString("NOM_SERIE"));
				int id = rs.getInt("ID_SERIE");
				Serie serie = new Serie(nom, id);
				listSerie.add(serie);
			}
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSerie;

	}

	public static ArrayList<Classe> getClasse(Serie serie) {
		c = Connect.cConnect();
		ArrayList<Classe> listeClasse = new ArrayList<>();
		int IdSerie = serie.getIdSerie();
		// test avec select
		Statement stm;

		try {
			stm = c.createStatement();

			String sql = "select * from classe INNER join serie on serie.ID_SERIE = classe.ID_SERIE where serie.ID_SERIE =" + IdSerie ;
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				String nomclasse = new String(rs.getString("NOM_CLASSE"));
				int idClasse = rs.getInt("ID_CLASSE");
				Classe classe = new Classe(serie.getNomSerie(),
						serie.getIdSerie(), nomclasse, idClasse);

				listeClasse.add(classe);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listeClasse;
	}

	public static void newVoilier(Voilier voilier, Classe classe,
			Proprietaire proprio) {

		Connection c = Connect.cConnect();

		PreparedStatement stm;
		try {
			stm = c.prepareStatement("insert into voilier(ID_CLASSE,ID_PROPRIETAIRE,NO_VOILE,COEFFICIENT) VALUES(?,?,?,?)");
			stm.setInt(1, classe.getIdClasse());
			stm.setInt(2, proprio.getId());
			stm.setString(3, voilier.getNom());
			stm.setDouble(4, voilier.getCoef());
			stm.executeUpdate();
			stm.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}
}