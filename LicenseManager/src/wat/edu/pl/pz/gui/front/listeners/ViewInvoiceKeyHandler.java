package wat.edu.pl.pz.gui.front.listeners;

import wat.edu.pl.pz.gui.back.dao.LicenseDAO;
import wat.edu.pl.pz.gui.back.entity.License;
import wat.edu.pl.pz.gui.back.entity.Provider;
import wat.edu.pl.pz.gui.front.panels.ViewInvoice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewInvoiceKeyHandler implements ActionListener {

	ViewInvoice vi;
	LicenseDAO licenseDAO = new LicenseDAO();
	public ViewInvoiceKeyHandler(ViewInvoice vi){
		this.vi=vi;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vi.invoiceNumberValue){
			License inv = licenseDAO.findByNumber(vi.invoiceNumberValue.getText());
			Provider comp = inv.getProvider();
			vi.userCompanyAddressValue.setText("Wojskowa Akademia Techniczna\nWarszawa Kalieskiego 2\n01-315 Warszawa");
			float fullPrice=0;
			Object[] row = new Object[2];
			vi.cityValue.setText("Warszawa");
			vi.dateValue.setText(new SimpleDateFormat("MM-dd-yyyy").format(new Date()));
			vi.billValue.setText(String.format("%.2f",fullPrice));
			
		}

	}

}
