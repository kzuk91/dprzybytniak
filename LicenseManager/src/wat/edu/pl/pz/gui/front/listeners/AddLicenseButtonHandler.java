package wat.edu.pl.pz.gui.front.listeners;

import wat.edu.pl.pz.gui.back.dao.AddressDAO;
import wat.edu.pl.pz.gui.back.dao.LicenseDAO;
import wat.edu.pl.pz.gui.back.dao.PostalCodeDAO;
import wat.edu.pl.pz.gui.back.dao.ProviderDAO;
import wat.edu.pl.pz.gui.back.entity.License;
import wat.edu.pl.pz.gui.back.entity.Provider;
import wat.edu.pl.pz.gui.front.frames.ErrorPopup;
import wat.edu.pl.pz.gui.front.panels.AddLicense;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLicenseButtonHandler implements ActionListener {

	AddLicense ai;
	LicenseDAO licenseDAO = new LicenseDAO();
	ProviderDAO providerDAO = new ProviderDAO();
	AddressDAO addressDAO = new AddressDAO();
	PostalCodeDAO postCodeDAO = new PostalCodeDAO();

	public AddLicenseButtonHandler(AddLicense ai) {
		this.ai = ai;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ai.writeButton) {
			if (ai.providerNameValue.getText().isEmpty()) {
				new ErrorPopup("Nazwa wytwórcy nie może być pusta");
			} else if (ai.providerNumberValue.getText().isEmpty()) {
				new ErrorPopup("ID wytwórcy nie może być pusty");
			} else if (ai.licenseNumberValue.getText().isEmpty()){
				new ErrorPopup("Numer licencji nie może być pusty");
			} else if (ai.licenseNameValue.getText().isEmpty()) {
				new ErrorPopup("Nazwa licencji nie może być pusta");
			} else if (ai.instalationTimeValue.getText().isEmpty()) {
				new ErrorPopup("Czas instalacji nie może być pusty");
			} else if (ai.validFromValue==null || ai.validToValue==null) {
				new ErrorPopup("Data ważności licencji nie może być pusta");
			} else if (ai.versionValue.getText().isEmpty()) {
				new ErrorPopup("Wersja licencji nie może być pusta");
			} else if (ai.descriptionValue.getText().isEmpty()) {
				new ErrorPopup("Opis licencji nie może być pusty");
			} else {
				License license = new License();
				Provider provider = new Provider();
				provider.setCompnayIdentificationNumber(Long.parseLong(ai.providerNumberValue.getText()));
				provider.setName(ai.providerNameValue.getText());
				provider = providerDAO.save(provider);
				license.setProvider(provider);
				license = licenseDAO.save(license);
			}
		}
		if (e.getSource() == ai.cancelButton) {
			ai.licenseNameValue.setText("");
			ai.licenseNumberValue.setText("");
			ai.providerNameValue.setText("");
			ai.providerNumberValue.setText("");
			ai.licenseNumberValue.setText("");
			ai.instalationTimeValue.setText("");
			ai.versionValue.setText("");
			ai.descriptionValue.setText("");
		}
	}

}
