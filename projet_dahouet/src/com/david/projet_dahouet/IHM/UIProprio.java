package com.david.projet_dahouet.IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import com.david.projet_dahouet.controller.Controller;
import com.david.projet_dahouet.model.Club;

public class UIProprio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox<Club> comboBox;

	
	public UIProprio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 411);
		Controller control = new Controller();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(10, 23, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setBounds(10, 67, 46, 14);
		contentPane.add(lblPrnom);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(10, 111, 46, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(10, 158, 62, 14);
		contentPane.add(lblTlphone);
		
		JLabel lblClub = new JLabel("Club");
		lblClub.setBounds(10, 203, 46, 14);
		contentPane.add(lblClub);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(10, 243, 46, 14);
		contentPane.add(lblMail);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(107, 322, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(306, 322, 89, 23);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(242, 20, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 64, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(242, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(242, 155, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		comboBox = new JComboBox<Club>();
		comboBox.setBounds(242, 198, 86, 20);
		contentPane.add(comboBox);
		comboBox.removeAllItems();
		ArrayList<Club> listClub = control.fillProprio();
		
		for (Club club2 : listClub)
			comboBox.addItem(club2); 
		
		textField_4 = new JTextField();
		textField_4.setBounds(242, 240, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
