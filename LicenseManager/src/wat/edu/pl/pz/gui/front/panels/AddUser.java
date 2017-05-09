package wat.edu.pl.pz.gui.front.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import wat.edu.pl.pz.gui.front.listeners.AddUserButtonHandler;

public class AddUser extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6425971341521834783L;

	public JTextField nameValue;
	public JTextField surnameValue;
	public JTextField emailValue;
	public JTextField idValue;
	public JTextField loginValue;
	public JTextField streetValue;
	public JTextField houseNumberValue;
	public JTextField localeNumberValue;
	public JTextField cityValue;
	public JTextField postCodeValue;
	public JButton addUserButton;
	public JButton cancelButton;
	
	
	public AddUser() {

		setBackground(Color.DARK_GRAY);
		setLayout(null);

		addUserButton = new JButton("Dodaj u\u017Cytkownika");
		addUserButton.setForeground(Color.WHITE);
		addUserButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		addUserButton.setBackground(new Color(30, 144, 255));
		addUserButton.setBounds(317, 559, 160, 23);
		add(addUserButton);

		cancelButton = new JButton("Anuluj");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		cancelButton.setBackground(new Color(30, 144, 255));
		cancelButton.setBounds(645, 559, 160, 23);
		add(cancelButton);

		JLabel addProductLabel = new JLabel(
				"Dodawanie nowego u\u017Cytkownika:");
		addProductLabel.setHorizontalAlignment(SwingConstants.LEFT);
		addProductLabel.setForeground(Color.WHITE);
		addProductLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		addProductLabel.setBounds(10, 30, 220, 30);
		add(addProductLabel);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBorder(null);
		panel.setBounds(190, 290, 653, 250);
		add(panel);

		JLabel streetLabel = new JLabel("Ulica:");
		streetLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		streetLabel.setForeground(Color.WHITE);
		streetLabel.setBounds(15, 25, 94, 14);
		panel.add(streetLabel);

		JLabel houseNumberLabel = new JLabel("Numer domu:");
		houseNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		houseNumberLabel.setForeground(Color.WHITE);
		houseNumberLabel.setBounds(15, 69, 94, 14);
		panel.add(houseNumberLabel);

		JLabel localeNumberLabel = new JLabel("Numer mieszkania:");
		localeNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		localeNumberLabel.setForeground(Color.WHITE);
		localeNumberLabel.setBounds(0, 113, 109, 14);
		panel.add(localeNumberLabel);

		JLabel cityLabel = new JLabel("Miasto:");
		cityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cityLabel.setForeground(Color.WHITE);
		cityLabel.setBounds(15, 157, 94, 14);
		panel.add(cityLabel);

		JLabel postCodeLabel = new JLabel("Kod pocztowy:");
		postCodeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		postCodeLabel.setForeground(Color.WHITE);
		postCodeLabel.setBounds(15, 201, 94, 14);
		panel.add(postCodeLabel);

		streetValue = new JTextField();
		streetValue.setColumns(10);
		streetValue.setBounds(132, 25, 483, 20);
		panel.add(streetValue);

		houseNumberValue = new JTextField();
		houseNumberValue.setColumns(10);
		houseNumberValue.setBounds(132, 70, 483, 20);
		panel.add(houseNumberValue);

		localeNumberValue = new JTextField();
		localeNumberValue.setColumns(10);
		localeNumberValue.setBounds(132, 115, 483, 20);
		panel.add(localeNumberValue);

		cityValue = new JTextField();
		cityValue.setColumns(10);
		cityValue.setBounds(132, 160, 483, 20);
		panel.add(cityValue);

		postCodeValue = new JTextField();
		postCodeValue.setColumns(10);
		postCodeValue.setBounds(132, 205, 483, 20);
		panel.add(postCodeValue);

		JPanel upperPanel = new JPanel();
		upperPanel.setLayout(null);
		upperPanel.setOpaque(false);
		upperPanel.setBorder(null);
		upperPanel.setBounds(190, 55, 653, 244);
		add(upperPanel);

		JLabel loginLabel = new JLabel("Login:");
		loginLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setBounds(20, 29, 94, 14);
		upperPanel.add(loginLabel);

		JLabel nameUserLabel = new JLabel("Imie:");
		nameUserLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameUserLabel.setForeground(Color.WHITE);
		nameUserLabel.setBounds(10, 72, 104, 14);
		upperPanel.add(nameUserLabel);

		JLabel surnameLabel = new JLabel("Nazwisko:");
		surnameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		surnameLabel.setForeground(Color.WHITE);
		surnameLabel.setBounds(20, 115, 94, 14);
		upperPanel.add(surnameLabel);

		JLabel emialLabel = new JLabel("e-mail:");
		emialLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		emialLabel.setForeground(Color.WHITE);
		emialLabel.setBounds(20, 158, 94, 14);
		upperPanel.add(emialLabel);

		JLabel idLabel = new JLabel("Pesel:");
		idLabel.setBounds(20, 201, 94, 14);
		upperPanel.add(idLabel);
		idLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		idLabel.setForeground(Color.WHITE);

		loginValue = new JTextField();
		loginValue.setColumns(10);
		loginValue.setBounds(132, 24, 483, 20);
		upperPanel.add(loginValue);

		nameValue = new JTextField();
		nameValue.setColumns(10);
		nameValue.setBounds(132, 68, 483, 20);
		upperPanel.add(nameValue);

		surnameValue = new JTextField();
		surnameValue.setColumns(10);
		surnameValue.setBounds(132, 112, 483, 20);
		upperPanel.add(surnameValue);

		emailValue = new JTextField();
		emailValue.setColumns(10);
		emailValue.setBounds(132, 156, 483, 20);
		upperPanel.add(emailValue);

		idValue = new JTextField();
		idValue.setBounds(132, 200, 483, 20);
		upperPanel.add(idValue);
		idValue.setColumns(10);

		addUserButton.addActionListener(new AddUserButtonHandler(this));
		cancelButton.addActionListener(new AddUserButtonHandler(this));
		
	}

}
