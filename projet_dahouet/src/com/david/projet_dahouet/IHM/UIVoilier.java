package com.david.projet_dahouet.IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import com.david.projet_dahouet.controller.Controller;

public class UIVoilier extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNew;

	
	public UIVoilier() {
		setTitle("Enregistrement d'un voilier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(167, 74, 28, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(167, 108, 28, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(167, 148, 28, 20);
		contentPane.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 185, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCoefficient = new JLabel("Coefficient");
		lblCoefficient.setBounds(10, 188, 95, 14);
		contentPane.add(lblCoefficient);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(82, 228, 46, 23);
		contentPane.add(btnOk);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(226, 228, 61, 23);
		contentPane.add(btnQuit);
		
		btnNew = new JButton("New");
		btnNew.setBounds(297, 73, 89, 23);
		contentPane.add(btnNew);
		btnNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control.InitUIProprio();
				dispose();
				
				
			}
		});
	}
}
