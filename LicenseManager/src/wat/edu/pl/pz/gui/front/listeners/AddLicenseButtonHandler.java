package wat.edu.pl.pz.gui.front.listeners;

import org.apache.commons.lang3.StringUtils;
import wat.edu.pl.pz.gui.back.Utils.Constants;
import wat.edu.pl.pz.gui.back.dao.AddressDAO;
import wat.edu.pl.pz.gui.back.dao.LicenseDAO;
import wat.edu.pl.pz.gui.back.dao.PostalCodeDAO;
import wat.edu.pl.pz.gui.back.dao.ProviderDAO;
import wat.edu.pl.pz.gui.back.entity.License;
import wat.edu.pl.pz.gui.back.entity.Provider;
import wat.edu.pl.pz.gui.front.frames.ErrorPopup;
import wat.edu.pl.pz.gui.front.panels.AddLicense;

import java.awt.*;
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
			String errorMessage = "";
			int lineCounter = 0;
			if (ai.providerNameValue.getText().isEmpty()) {
				ai.providerNameValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.PROVIDER_NAME_EMPTY_ERROR;
				//new ErrorPopup("Nazwa wytwórcy nie może być pusta");
			}
			if (ai.providerNumberValue.getText().isEmpty()) {
				ai.providerNumberValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.PROVIDER_NUMBER_EMPTY_ERROR;
				//new ErrorPopup("ID wytwórcy nie może być pusty");
			}
			if (ai.licenseNumberValue.getText().isEmpty()) {
				ai.licenseNumberValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.LICENSE_NUMBER_EMPTY_ERROR;
				//new ErrorPopup("Numer licencji nie może być pusty");
			}
			if (ai.licenseNameValue.getText().isEmpty()) {
				ai.licenseNameValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.LICENSE_NAME_EMPTY_ERROR;
				//new ErrorPopup("Nazwa licencji nie może być pusta");
			}
			if (ai.instalationTimeValue.getText().isEmpty()) {
				ai.instalationTimeValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.INSTALATION_TIME_EMPTY_ERROR;
				//new ErrorPopup("Czas instalacji nie może być pusty");
			}
			if (ai.validFromValue == null || ai.validToValue == null) {
				if (ai.validFromValue == null)
					ai.validFromValue.setBackground(Color.red);
				if (ai.validToValue == null)
					ai.validToValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.EXPIRATION_DATA_EMPTY_ERROR;
				//new ErrorPopup("Data ważności licencji nie może być pusta");
			}
			if (ai.versionValue.getText().isEmpty()) {
				ai.versionValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.LICENSE_VERSION_EMPTY_ERROR;
				//new ErrorPopup("Wersja licencji nie może być pusta");
			}
			if (ai.descriptionValue.getText().isEmpty()) {
				ai.descriptionValue.setBackground(Color.red);
				errorMessage = errorMessage + Constants.BREAK_LINE + ++lineCounter + Constants.COMA + Constants.LICENSE_DESCRIPTION_EMPTY_ERROR;
				//new ErrorPopup("Opis licencji nie może być pusty");
			}

			if (StringUtils.isNotEmpty(errorMessage)) {
				errorMessage = Constants.HTML_OPEN + Constants.ERROR_LIST + Constants.BREAK_LINE + errorMessage + Constants.HTML_CLOSE;
				new ErrorPopup(errorMessage, lineCounter);
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
