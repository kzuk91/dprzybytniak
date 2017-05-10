package wat.edu.pl.pz.gui.front.panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class YourLicenses extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7156247987927996296L;
	public JTable table;
	public String[] columns = {"L.p.","Nazwa licencji","Numer licencji"};
	public DefaultTableModel dtm;
	
	public YourLicenses() {

		setBackground(Color.DARK_GRAY);
		setLayout(null);

		JPanel centralPanel = new JPanel();
		centralPanel.setBounds(10, 10, 820, 800);
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
