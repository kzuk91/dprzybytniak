package wat.edu.pl.pz.gui.front.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.NoResultException;

import wat.edu.pl.pz.gui.back.dao.UsersDAO;
import wat.edu.pl.pz.gui.back.entity.Users;
import wat.edu.pl.pz.gui.back.services.EncryptingService;
import wat.edu.pl.pz.gui.back.services.SessionService;
import wat.edu.pl.pz.gui.front.frames.ApplicationWindow;
import wat.edu.pl.pz.gui.front.frames.ErrorPopup;
import wat.edu.pl.pz.gui.front.frames.MainWindow;
import wat.edu.pl.pz.gui.front.frames.ResetPassword;

public class MainWindowButtonHandler implements ActionListener {

	MainWindow mw;
	UsersDAO usersDAO = new UsersDAO();
	EncryptingService encService = new EncryptingService();
	SessionService sessionService = new SessionService();

	public MainWindowButtonHandler(MainWindow mw) {
		this.mw = mw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mw.loginButton || e.getSource() == mw.loginValue || e.getSource() == mw.passwordValue) {
			if (!mw.loginValue.getText().isEmpty()) {
				try {
					Users user = usersDAO.findByLogin(mw.loginValue.getText());
					if (user.getPassword()
							.getHashedPassword()
							.equals(encService.encryptPassword(new String(
									mw.passwordValue.getPassword())))) {
						sessionService.setLogin(user.getLogin());
						sessionService.setRole(user.getRole().getName());
						mw.setVisible(false);
						ApplicationWindow.getInstance();
					} else {
						new ErrorPopup("Wpisz poprawne has�o");
					}

				} catch (NoResultException ex) {
					new ErrorPopup("Podany u�ytkownik nie istnieje");
				}
			} else {
				new ErrorPopup("Login i has�o s� wymagane");
			}
		}
		if (e.getSource() == mw.resetPasswordButton) {
			try {
				// sprawdzam, czy istnieje user na bazie
				Users user = usersDAO.findByLogin(mw.loginValue.getText());
				new ResetPassword(user.getLogin());
			} catch (NoResultException ex) {
				new ErrorPopup("U�ytkownik o podanym loginie nie istnieje");
			}

		}
	}
}