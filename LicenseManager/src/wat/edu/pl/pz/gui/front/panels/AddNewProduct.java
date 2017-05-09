package wat.edu.pl.pz.gui.front.panels;

import javax.swing.*;
import java.awt.*;

public class AddNewProduct extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7156247987927996296L;
	public JTextField nameValue;
	public JTextField codeValue;
	public JTextField priceValue;
	public JTextField salePriceValue;
	public JTextField amountValue;
	public JButton addProductButton;
	public JButton cancelButton;
	public JComboBox<String> taxComboBox;
	
	public AddNewProduct() {

		setBackground(Color.DARK_GRAY);
		setLayout(null);

		addProductButton = new JButton("Dodaj produkt");
		addProductButton.setForeground(Color.WHITE);
		addProductButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		addProductButton.setBackground(new Color(30, 144, 255));
		addProductButton.setBounds(317, 559, 120, 23);
		add(addProductButton);

		cancelButton = new JButton("Anuluj");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		cancelButton.setBackground(new Color(30, 144, 255));
		cancelButton.setBounds(685, 559, 120, 23);
		add(cancelButton);

		JLabel addProductLabel = new JLabel("Dodawanie nowego produktu:");
		addProductLabel.setHorizontalAlignment(SwingConstants.LEFT);
		addProductLabel.setForeground(Color.WHITE);
		addProductLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		addProductLabel.setBounds(10, 30, 200, 30);
		add(addProductLabel);

		JPanel upperPanel = new JPanel();
		upperPanel.setLayout(null);
		upperPanel.setOpaque(false);
		upperPanel.setBorder(null);
		upperPanel.setBounds(190, 82, 653, 450);
		add(upperPanel);

		JLabel nameLabel = new JLabel("Nazwa produktu:");
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setBounds(-10, 52, 104, 14);
		upperPanel.add(nameLabel);

		JLabel codeLabel = new JLabel("Kod produktu:");
		codeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		codeLabel.setForeground(Color.WHITE);
		codeLabel.setBounds(0, 118, 94, 14);
		upperPanel.add(codeLabel);

		JLabel priceLabel = new JLabel("Cena zakupu:");
		priceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		priceLabel.setForeground(Color.WHITE);
		priceLabel.setBounds(0, 184, 94, 14);
		upperPanel.add(priceLabel);

		JLabel taxValueLabel = new JLabel("Stawka VAT:");
		taxValueLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		taxValueLabel.setForeground(Color.WHITE);
		taxValueLabel.setBounds(0, 250, 94, 14);
		upperPanel.add(taxValueLabel);

		JLabel salePriceLabel = new JLabel("Cena sprzeda\u017Cy:");
		salePriceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		salePriceLabel.setForeground(Color.WHITE);
		salePriceLabel.setBounds(0, 316, 94, 14);
		upperPanel.add(salePriceLabel);

		JLabel amountLabel = new JLabel("Ilo\u015B\u0107:");
		amountLabel.setBounds(0, 382, 94, 14);
		upperPanel.add(amountLabel);
		amountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		amountLabel.setForeground(Color.WHITE);

		nameValue = new JTextField();
		nameValue.setColumns(10);
		nameValue.setBounds(132, 47, 483, 20);
		upperPanel.add(nameValue);

		codeValue = new JTextField();
		codeValue.setColumns(10);
		codeValue.setBounds(132, 114, 483, 20);
		upperPanel.add(codeValue);

		priceValue = new JTextField();
		priceValue.setColumns(10);
		priceValue.setBounds(132, 181, 483, 20);
		upperPanel.add(priceValue);

		salePriceValue = new JTextField();
		salePriceValue.setColumns(10);
		salePriceValue.setBounds(132, 315, 483, 20);
		upperPanel.add(salePriceValue);

		amountValue = new JTextField();
		amountValue.setBounds(132, 382, 483, 20);
		upperPanel.add(amountValue);
		amountValue.setColumns(10);

		taxComboBox = new JComboBox<String>();
		taxComboBox.setBounds(132, 248, 483, 20);
		taxComboBox.addItem("-- Wybierz --");
		upperPanel.add(taxComboBox);
	}
}
