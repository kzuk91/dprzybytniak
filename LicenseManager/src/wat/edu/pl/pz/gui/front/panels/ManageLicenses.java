package wat.edu.pl.pz.gui.front.panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ManageLicenses extends JPanel {

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
	public String[] columns = {"L.p.","Nazwa licencji","Numer licencji"};
	public JTextField billValue;
	public DefaultTableModel dtm;

	public ManageLicenses() {

		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JPanel upperCenterPanel = new JPanel();
		upperCenterPanel.setBackground(Color.DARK_GRAY);
		upperCenterPanel.setBounds(20, 25, 420, 150);
		add(upperCenterPanel);
		upperCenterPanel.setLayout(null);
		
		JLabel companyLabel = new JLabel("Lista użytkowników:");
		companyLabel.setBackground(Color.DARK_GRAY);
		companyLabel.setForeground(Color.WHITE);
		companyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		companyLabel.setBounds(5, 0, 140, 20);
		upperCenterPanel.add(companyLabel);
		
		addressCompanyValue = new JTextArea();
		addressCompanyValue.setBounds(5, 20, 400, 125);
		upperCenterPanel.add(addressCompanyValue);
		addressCompanyValue.setColumns(10);
		addressCompanyValue.setWrapStyleWord(true);
		addressCompanyValue.setLineWrap(true);
		
		JPanel upperRightPanel = new JPanel();
		upperRightPanel.setLayout(null);
		upperRightPanel.setBackground(Color.DARK_GRAY);
		upperRightPanel.setBounds(440, 25, 480, 150);
		add(upperRightPanel);

		JLabel userCompanyAddressLabel = new JLabel("Lista licencji:");
		userCompanyAddressLabel.setForeground(Color.WHITE);
		userCompanyAddressLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		userCompanyAddressLabel.setBackground(Color.DARK_GRAY);
		userCompanyAddressLabel.setBounds(5, 0, 120, 20);
		upperRightPanel.add(userCompanyAddressLabel);
		
		userCompanyAddressValue = new JTextArea();
		userCompanyAddressValue.setColumns(10);
		userCompanyAddressValue.setBounds(5, 20, 400, 125);
		userCompanyAddressValue.setWrapStyleWord(true);
		userCompanyAddressValue.setLineWrap(true);
		upperRightPanel.add(userCompanyAddressValue);
		

		JPanel centralPanel = new JPanel();
		centralPanel.setBounds(25, 190, 820, 200);
		add(centralPanel);
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		
		table = new JTable();
		centralPanel.add(table);
		String[] tableCols={"",""};
		dtm = new DefaultTableModel();
		dtm.setColumnIdentifiers(tableCols);
		table.setModel(dtm);
		

	}

}
