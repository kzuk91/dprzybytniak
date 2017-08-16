package wat.edu.pl.pz.gui.front.panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewInvoice extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1161017165931877489L;
	public JTextField invoiceNumberValue;
	public JTextArea addressCompanyValue;
	public JTextArea userCompanyAddressValue;
	public JTextField cityValue;
	public JTextField dateValue;
	public JTable table;
	public String[] columns = {"L.p.","Nazwa produktu","Ilo��"};
	public JTextField billValue;
	public JTextField textField;
	public DefaultTableModel dtm;

	public ViewInvoice() {

		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JPanel upperLeftPanel = new JPanel();
		upperLeftPanel.setBackground(Color.DARK_GRAY);
		upperLeftPanel.setBorder(null);
		upperLeftPanel.setBounds(5, 15, 235, 28);
		add(upperLeftPanel);
		upperLeftPanel.setLayout(null);

		JLabel invoiceNumberLabel = new JLabel("Numer faktury:");
		invoiceNumberLabel.setBounds(5, 5, 100, 20);
		upperLeftPanel.add(invoiceNumberLabel);
		invoiceNumberLabel.setForeground(Color.WHITE);
		invoiceNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 12));

		invoiceNumberValue = new JTextField();
		invoiceNumberValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		invoiceNumberValue.setBounds(110, 5, 120, 20);
		upperLeftPanel.add(invoiceNumberValue);
		invoiceNumberValue.setColumns(10);

        JPanel upperCenterPanel = new JPanel();
		upperCenterPanel.setBackground(Color.DARK_GRAY);
		upperCenterPanel.setBounds(255, 25, 150, 150);
		add(upperCenterPanel);
		upperCenterPanel.setLayout(null);
		
		JLabel companyLabel = new JLabel("Dane klienta:");
		companyLabel.setBackground(Color.DARK_GRAY);
		companyLabel.setForeground(Color.WHITE);
		companyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		companyLabel.setBounds(5, 0, 90, 20);
		upperCenterPanel.add(companyLabel);
		
		addressCompanyValue = new JTextArea();
		addressCompanyValue.setBounds(5, 20, 140, 125);
		upperCenterPanel.add(addressCompanyValue);
		addressCompanyValue.setColumns(10);
		addressCompanyValue.setWrapStyleWord(true);
		addressCompanyValue.setLineWrap(true);
		
		JPanel upperRightPanel = new JPanel();
		upperRightPanel.setLayout(null);
		upperRightPanel.setBackground(Color.DARK_GRAY);
		upperRightPanel.setBounds(430, 25, 150, 150);
		add(upperRightPanel);
		
		JLabel userCompanyAddressLabel = new JLabel("Dane sprzedawcy:");
		userCompanyAddressLabel.setForeground(Color.WHITE);
		userCompanyAddressLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		userCompanyAddressLabel.setBackground(Color.DARK_GRAY);
		userCompanyAddressLabel.setBounds(5, 0, 120, 20);
		upperRightPanel.add(userCompanyAddressLabel);
		
		userCompanyAddressValue = new JTextArea();
		userCompanyAddressValue.setColumns(10);
		userCompanyAddressValue.setBounds(5, 20, 140, 125);
		userCompanyAddressValue.setWrapStyleWord(true);
		userCompanyAddressValue.setLineWrap(true);
		upperRightPanel.add(userCompanyAddressValue);
		
		JPanel upperRightPanel2 = new JPanel();
		upperRightPanel2.setLayout(null);
		upperRightPanel2.setBorder(null);
		upperRightPanel2.setBackground(Color.DARK_GRAY);
		upperRightPanel2.setBounds(600, 15, 235, 60);
		add(upperRightPanel2);
		
		JLabel cityLabel = new JLabel("Miejscowo\u015B\u0107:");
		cityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cityLabel.setForeground(Color.WHITE);
		cityLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cityLabel.setBounds(5, 5, 100, 20);
		upperRightPanel2.add(cityLabel);
		
		cityValue = new JTextField();
		cityValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cityValue.setColumns(10);
		cityValue.setBounds(110, 5, 120, 20);
		upperRightPanel2.add(cityValue);
		
		JLabel dateLabel = new JLabel("Data:");
		dateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		dateLabel.setForeground(Color.WHITE);
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dateLabel.setBounds(5, 36, 100, 20);
		upperRightPanel2.add(dateLabel);
		
		dateValue = new JTextField();
		dateValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dateValue.setColumns(10);
		dateValue.setBounds(110, 36, 120, 20);
		upperRightPanel2.add(dateValue);
		
		JPanel centralPanel = new JPanel();
		centralPanel.setBounds(25, 190, 820, 300);
		add(centralPanel);
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		
		table = new JTable();
		centralPanel.add(table);
		String[] tableCols={"Produkt","Cena"};
		dtm = new DefaultTableModel();
		dtm.setColumnIdentifiers(tableCols);
		table.setModel(dtm);
		
		JPanel downRightPanel = new JPanel();
		downRightPanel.setLayout(null);
		downRightPanel.setBorder(null);
		downRightPanel.setBackground(Color.DARK_GRAY);
		downRightPanel.setBounds(610, 520, 235, 28);
		add(downRightPanel);
		
		JLabel billLabel = new JLabel("Do zap\u0142aty:");
		billLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		billLabel.setForeground(Color.WHITE);
		billLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		billLabel.setBounds(5, 5, 75, 20);
		downRightPanel.add(billLabel);
		
		billValue = new JTextField();
		billValue.setHorizontalAlignment(SwingConstants.CENTER);
		billValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		billValue.setColumns(10);
		billValue.setBounds(85, 5, 120, 20);
		downRightPanel.add(billValue);
		
		JLabel curencyLabel = new JLabel("PLN");
		curencyLabel.setHorizontalAlignment(SwingConstants.LEFT);
		curencyLabel.setForeground(Color.WHITE);
		curencyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		curencyLabel.setBounds(210, 5, 25, 20);
		downRightPanel.add(curencyLabel);
		
		JPanel downLeftPanel = new JPanel();
		downLeftPanel.setLayout(null);
		downLeftPanel.setBorder(null);
		downLeftPanel.setBackground(Color.DARK_GRAY);
		downLeftPanel.setBounds(25, 520, 350, 28);
		add(downLeftPanel);
		
		JLabel employeeLabel = new JLabel("Faktur\u0119 wystwi\u0142:");
		employeeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		employeeLabel.setForeground(Color.WHITE);
		employeeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		employeeLabel.setBounds(5, 5, 110, 20);
		downLeftPanel.add(employeeLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(110, 5, 235, 20);
		downLeftPanel.add(textField);

	}

}
