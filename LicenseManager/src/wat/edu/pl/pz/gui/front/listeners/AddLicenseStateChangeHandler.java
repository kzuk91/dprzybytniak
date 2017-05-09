package wat.edu.pl.pz.gui.front.listeners;

import wat.edu.pl.pz.gui.front.panels.AddLicense;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AddLicenseStateChangeHandler implements ItemListener {

	AddLicense ai;

	public AddLicenseStateChangeHandler(AddLicense ai) {
		this.ai = ai;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == ai.licenseFalseCheck) {
			ai.licenseTrueCheck
					.setSelected(ai.licenseFalseCheck.isSelected() ? false
							: true);
		}
		if (e.getSource() == ai.licenseTrueCheck) {
			ai.licenseFalseCheck
					.setSelected(ai.licenseTrueCheck.isSelected() ? false
							: true);
		}
	}
}
