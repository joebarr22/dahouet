package com.david.projet_dahouet.IHM;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.david.projet_dahouet.controller.Controller;
import com.david.projet_dahouet.model.Classe;
import com.david.projet_dahouet.model.Proprietaire;
import com.david.projet_dahouet.model.Serie;
import com.david.projet_dahouet.model.Voilier;

public class UIVoilier extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<Proprietaire> comboBox_1;
	private JComboBox<Serie> comboBox_2;
	private JComboBox<Classe> comboBox_3;
	private JButton btnNewButton;
	private JButton btnOk;
	
	public UIVoilier() {
		setTitle("Enregistrement d'un voilier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 374);
		Controller control = new Controller();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomDuVoilier = new JLabel("Nom du voilier");
		lblNomDuVoilier.setBounds(10, 38, 81, 14);
		contentPane.add(lblNomDuVoilier);
		
		JLabel lblNewLabel = new JLabel("Nom du propri\u00E9taire");
		lblNewLabel.setBounds(10, 77, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Classe");
		lblNewLabel_1.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Serie");
		lblNewLabel_2.setBounds(10, 151, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(167, 35, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox_1 = new JComboBox<Proprietaire>();
		comboBox_1.setBounds(167, 74, 207, 20);
		contentPane.add(comboBox_1);
		comboBox_1.removeAllItems();
		ArrayList<Proprietaire> listProprio = control.proprioInit();

		for (Proprietaire proprio : listProprio) {
			comboBox_1.addItem(proprio);
		}

			btnNewButton = new JButton("Nouveau");
			btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					control.fillProprio();
					dispose();
					
				}
			});

		
		comboBox_2 = new JComboBox<Serie>();
		comboBox_2.setBounds(167, 108, 207, 20);
		contentPane.add(comboBox_2);
		comboBox_2.removeAllItems();
		ArrayList<Serie> listSerie = control.serieInit();

		for (Serie serie : listSerie) {
			
			comboBox_2.addItem(serie);
		}
		comboBox_2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				comboBox_3.removeAllItems();
				Serie serie = (Serie) comboBox_2.getSelectedItem();
				ArrayList<Classe> listClasse = control.classeInit(serie);
				for (Classe classe : listClasse) {
					

					comboBox_3.addItem(classe);
				}
			}
		});
		
	
		comboBox_3 = new JComboBox<Classe>();
		comboBox_3.setBounds(167, 148, 207, 20);
		contentPane.add(comboBox_3);
		comboBox_3.removeAllItems();
		Serie serie = (Serie) comboBox_2.getSelectedItem();
		ArrayList<Classe> listClasse = control.classeInit(serie);
		for (Classe classe : listClasse) {
			

			comboBox_3.addItem(classe);

		}
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 185, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCoefficient = new JLabel("Coefficient");
		lblCoefficient.setBounds(10, 188, 95, 14);
		contentPane.add(lblCoefficient);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(82, 228, 61, 23);
		contentPane.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Classe classe = (Classe) comboBox_3.getSelectedItem();
				Proprietaire proprio = (Proprietaire) comboBox_1.getSelectedItem();
				Voilier voilier = new Voilier(0,textField.getText(),Double.parseDouble(textField_1.getText()));
				control.newVoilier(classe,proprio,voilier);
			}
		});
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(226, 228, 61, 23);
		contentPane.add(btnQuit);
		
		btnNewButton = new JButton("New");
		btnNewButton.setBounds(384, 73, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control.InitUIProprio();
				dispose();
				
				
			}
		});
	}
}
