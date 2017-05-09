package wat.edu.pl.pz.gui.front.panels;

import org.jdesktop.swingx.JXDatePicker;
import wat.edu.pl.pz.gui.front.listeners.AddLicenseButtonHandler;
import wat.edu.pl.pz.gui.front.listeners.AddLicenseStateChangeHandler;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class AddLicense extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1737092767761237472L;
    public JTextField licenseNameValue;
	public JTextField providerNameValue;
	public JTextField providerNumberValue;
	public JTextField licenseNumberValue;
	public JTextField instalationTimeValue;
	public JXDatePicker validFromValue;
	public JXDatePicker validToValue;
	public JTextField versionValue;
	public JTextArea descriptionValue;
	public JButton writeButton;
	public JButton cancelButton;
	public JRadioButton licenseFalseCheck;
	public JRadioButton licenseTrueCheck;

	public AddLicense() {

		setBackground(Color.DARK_GRAY);

		JLabel invoiceDateLabel = new JLabel("Dane licencji:");
		invoiceDateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		invoiceDateLabel.setBounds(90, 11, 105, 25);
		invoiceDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		invoiceDateLabel.setForeground(Color.WHITE);

		writeButton = new JButton("Zapisz");
		writeButton.setBounds(335, 561, 91, 23);
		writeButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		writeButton.setBackground(new Color(30, 144, 255));
		writeButton.setForeground(new Color(255, 255, 255));

		cancelButton = new JButton("Anuluj");
		cancelButton.setBounds(727, 561, 91, 23);
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		cancelButton.setBackground(new Color(30, 144, 255));

		licenseFalseCheck = new JRadioButton("Restart wymagany");
		licenseFalseCheck.setBounds(425, 250, 150, 23);
		licenseFalseCheck.setFont(new Font("Tahoma", Font.BOLD, 11));
		licenseFalseCheck.setForeground(Color.WHITE);
		licenseFalseCheck.setBackground(SystemColor.text);
		licenseFalseCheck.setOpaque(false);
		licenseFalseCheck.setContentAreaFilled(false);
		licenseFalseCheck.setBorderPainted(false);

		licenseTrueCheck = new JRadioButton("Restart opcjonalny");
		licenseTrueCheck.setBounds(609, 250, 158, 23);
		licenseTrueCheck.setSelected(true);
		licenseTrueCheck.setOpaque(false);
		licenseTrueCheck.setForeground(Color.WHITE);
		licenseTrueCheck.setFont(new Font("Tahoma", Font.BOLD, 11));
		licenseTrueCheck.setContentAreaFilled(false);
		licenseTrueCheck.setBorderPainted(false);
		licenseTrueCheck.setBackground(Color.WHITE);
		setLayout(null);
		add(invoiceDateLabel);
		add(writeButton);
		add(cancelButton);
		add(licenseFalseCheck);
		add(licenseTrueCheck);

		JPanel upperPanel = new JPanel();
		upperPanel.setLayout(null);
		upperPanel.setOpaque(false);
		upperPanel.setBorder(null);
		upperPanel.setBounds(200, 58, 654, 200);
		add(upperPanel);

		JLabel nameProviderLabel = new JLabel("Wytwórca:");
		nameProviderLabel.setBounds(10, 28, 94, 14);
		upperPanel.add(nameProviderLabel);
		nameProviderLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameProviderLabel.setForeground(Color.WHITE);

		JLabel providerIdentificationNumberLabel = new JLabel("ID wytwórcy:");
		providerIdentificationNumberLabel.setBounds(10, 70, 94, 14);
		upperPanel.add(providerIdentificationNumberLabel);
		providerIdentificationNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		providerIdentificationNumberLabel.setForeground(Color.WHITE);

		JLabel licenseNumberLabel = new JLabel("Numer licencji:");
		licenseNumberLabel.setBounds(10, 112, 94, 14);
		upperPanel.add(licenseNumberLabel);
		licenseNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		licenseNumberLabel.setForeground(Color.WHITE);

		JLabel licenseNameLabel = new JLabel("Nazwa licencji:");
		licenseNameLabel.setBounds(10, 154, 94, 14);
		upperPanel.add(licenseNameLabel);
		licenseNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		licenseNameLabel.setForeground(Color.WHITE);

        providerNameValue = new JTextField();
        providerNameValue.setBounds(132, 24, 483, 20);
		upperPanel.add(providerNameValue);
        providerNameValue.setColumns(10);

        providerNumberValue = new JTextField();
        providerNumberValue.setBounds(132, 68, 483, 20);
		upperPanel.add(providerNumberValue);
        providerNumberValue.setColumns(10);

        licenseNumberValue = new JTextField();
        licenseNumberValue.setBounds(132, 112, 483, 20);
		upperPanel.add(licenseNumberValue);
        licenseNumberValue.setColumns(10);

		licenseNameValue = new JTextField();
        licenseNameValue.setBounds(132, 156, 483, 20);
		upperPanel.add(licenseNameValue);
        licenseNameValue.setColumns(10);

		JPanel bottonPanel = new JPanel();
		bottonPanel.setBounds(200, 260, 653, 250);
		add(bottonPanel);
		bottonPanel.setLayout(null);

		JLabel instalationTimeLabel = new JLabel("Czas instalacji:");
		instalationTimeLabel.setBounds(15, 25, 94, 14);
		bottonPanel.add(instalationTimeLabel);
		instalationTimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		instalationTimeLabel.setForeground(Color.WHITE);

		JLabel validFromLabel = new JLabel("Ważna od:");
		validFromLabel.setBounds(15, 69, 94, 14);
		bottonPanel.add(validFromLabel);
		validFromLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		validFromLabel.setForeground(Color.WHITE);

		JLabel validToLabel = new JLabel("Ważna do:");
		validToLabel.setBounds(-26, 113, 135, 14);
		bottonPanel.add(validToLabel);
		validToLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		validToLabel.setForeground(Color.WHITE);

		JLabel versionLabel = new JLabel("Wersja:");
		versionLabel.setBounds(15, 157, 94, 14);
		bottonPanel.add(versionLabel);
		versionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		versionLabel.setForeground(Color.WHITE);

		JLabel descriptionLabel = new JLabel("Opis:");
		descriptionLabel.setBounds(15, 201, 94, 14);
		bottonPanel.add(descriptionLabel);
		descriptionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		descriptionLabel.setForeground(Color.WHITE);

		instalationTimeValue = new JTextField();
		instalationTimeValue.setBounds(132, 25, 483, 20);
		bottonPanel.add(instalationTimeValue);
		instalationTimeValue.setColumns(10);

		validFromValue = new JXDatePicker();
		validFromValue.setBounds(132, 70, 483, 20);
        validFromValue.setFormats("yyyy-mm-dd hh:mm:ss");
        validFromValue.setDate(new Date());
        validFromValue.getEditor().setEnabled(false);
        validFromValue.getEditor().setDisabledTextColor(Color.black);
		bottonPanel.add(validFromValue);

		validToValue = new JXDatePicker();
		validToValue.setBounds(132, 115, 483, 20);
        validToValue.setFormats("yyyy-mm-dd hh:mm:ss");
		validToValue.setDate(new Date());
        validToValue.getEditor().setEnabled(false);
        validToValue.getEditor().setDisabledTextColor(Color.black);
		bottonPanel.add(validToValue);

		versionValue = new JTextField();
		versionValue.setBounds(132, 160, 483, 20);
		bottonPanel.add(versionValue);
		versionValue.setColumns(10);

		descriptionValue = new JTextArea();
		descriptionValue.setBounds(132, 205, 483, 20);
		bottonPanel.add(descriptionValue);
		descriptionValue.setColumns(10);
		bottonPanel.setOpaque(false);
		bottonPanel.setBorder(null);


		// listenery
		writeButton.addActionListener(new AddLicenseButtonHandler(this));
		cancelButton.addActionListener(new AddLicenseButtonHandler(this));


		licenseFalseCheck.addItemListener(new AddLicenseStateChangeHandler(this));
		licenseTrueCheck.addItemListener(new AddLicenseStateChangeHandler(this));
	}
}
