package wat.edu.pl.pz.gui.front.listeners;

import wat.edu.pl.pz.gui.front.frames.MainWindow;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MainWindowFocusHandler implements FocusListener {

	MainWindow mw;

	public MainWindowFocusHandler(MainWindow mw) {
		this.mw = mw;
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == mw.loginValue){
			if (mw.loginValue.getText().equals("login..."))
				mw.loginValue.setText("");}
		if (e.getSource() == mw.passwordValue){
				mw.passwordValue.setText("");}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (e.getSource() == mw.loginValue) {
			if (mw.loginValue.getText().isEmpty())
				mw.loginValue.setText("login...");
		}
		if (e.getSource() == mw.passwordValue) {
			if (new String(mw.passwordValue.getPassword()).isEmpty())
                mw.passwordValue.setText("hasło...");
        }
	}

}
