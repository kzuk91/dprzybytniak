package wat.edu.pl.pz.gui.front.frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import wat.edu.pl.pz.gui.front.panels.AddLicense;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;

public class ProductDetails extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4379208019297483117L;
	private JTextField nameProductValue;
	private JTextField codProductValue;
	private JTextField priceValue;
	private JTextField priceSaleValue;
	private JTextField amountValue;

	public ProductDetails() {
		setTitle("Edycja produktu");

		getContentPane().setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setBackground(Color.DARK_GRAY);

		JPanel productEditPanel = new JPanel();
		productEditPanel.setBackground(Color.DARK_GRAY);
		productEditPanel.setLayout(null);
		productEditPanel.setOpaque(false);
		productEditPanel.setBounds(190, 82, 653, 450);
		getContentPane().add(productEditPanel, BorderLayout.CENTER);

		
		JLabel image = new JLabel("");
		image.setBounds(0, 0, 100, 100);
		image.setIcon(new ImageIcon(AddLicense.class
				.getResource("/img/LOGO100.png")));
		productEditPanel.add(image);
		
		
		
		
		JLabel nameProductLabel = new JLabel("Nazwa produktu:");
		nameProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameProductLabel.setForeground(Color.WHITE);
		nameProductLabel.setBounds(76, 93, 104, 14);
		productEditPanel.add(nameProductLabel);

		JLabel codProductLabel = new JLabel("Kod produktu:");
		codProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		codProductLabel.setForeground(Color.WHITE);
		codProductLabel.setBounds(86, 132, 94, 14);
		productEditPanel.add(codProductLabel);

		JLabel priceLabel = new JLabel("Cena zakupu:");
		priceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		priceLabel.setForeground(Color.WHITE);
		priceLabel.setBounds(86, 171, 94, 14);
		productEditPanel.add(priceLabel);

		JLabel taxLabel = new JLabel("Stawka VAT:");
		taxLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		taxLabel.setForeground(Color.WHITE);
		taxLabel.setBounds(86, 210, 94, 14);
		productEditPanel.add(taxLabel);

		JLabel priceSaleLabel = new JLabel("Cena sprzeda\u017Cy:");
		priceSaleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		priceSaleLabel.setForeground(Color.WHITE);
		priceSaleLabel.setBounds(86, 249, 94, 14);
		productEditPanel.add(priceSaleLabel);

		JLabel amountLabel = new JLabel("Ilo\u015B\u0107:");
		amountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		amountLabel.setForeground(Color.WHITE);
		amountLabel.setBounds(86, 288, 94, 14);
		productEditPanel.add(amountLabel);

		nameProductValue = new JTextField();
		nameProductValue.setColumns(10);
		nameProductValue.setBounds(198, 88, 240, 20);
		productEditPanel.add(nameProductValue);

		codProductValue = new JTextField();
		codProductValue.setColumns(10);
		codProductValue.setBounds(198, 128, 240, 20);
		productEditPanel.add(codProductValue);

		priceValue = new JTextField();
		priceValue.setColumns(10);
		priceValue.setBounds(198, 168, 240, 20);
		productEditPanel.add(priceValue);
		
				JComboBox<String> taxComboBox = new JComboBox<String>();
				taxComboBox.setBackground(new Color(255, 255, 255));
				taxComboBox.setBounds(198, 208, 240, 20);
				productEditPanel.add(taxComboBox);

		priceSaleValue = new JTextField();
		priceSaleValue.setColumns(10);
		priceSaleValue.setBounds(198, 248, 240, 20);
		productEditPanel.add(priceSaleValue);

		amountValue = new JTextField();
		amountValue.setColumns(10);
		amountValue.setBounds(198, 288, 240, 20);
		productEditPanel.add(amountValue);
		
		JButton saveButton = new JButton("Zapisz");
		saveButton.setForeground(Color.WHITE);
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		saveButton.setBackground(new Color(30, 144, 255));
		saveButton.setBounds(207, 328, 70, 23);
		productEditPanel.add(saveButton);

		setVisible(true);

	}
}
