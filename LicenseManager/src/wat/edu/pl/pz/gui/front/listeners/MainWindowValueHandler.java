package wat.edu.pl.pz.gui.front.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import wat.edu.pl.pz.gui.front.frames.MainWindow;

public class MainWindowValueHandler implements MouseListener {

	MainWindow mw;

	public MainWindowValueHandler(MainWindow mw) {
		this.mw = mw;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == mw.loginValue)
			mw.loginValue.setText("");
		if (e.getSource() == mw.passwordValue)
			mw.passwordValue.setText("");
	}

	

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}
