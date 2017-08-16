package wat.edu.pl.pz.gui.front.listeners;

import wat.edu.pl.pz.gui.back.dao.PasswordDAO;
import wat.edu.pl.pz.gui.back.dao.UsersDAO;
import wat.edu.pl.pz.gui.back.entity.Password;
import wat.edu.pl.pz.gui.back.entity.Users;
import wat.edu.pl.pz.gui.back.services.EncryptingService;
import wat.edu.pl.pz.gui.back.services.MailService;
import wat.edu.pl.pz.gui.front.frames.ErrorPopup;
import wat.edu.pl.pz.gui.front.frames.ResetPassword;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetPasswordButtonHandler implements ActionListener {

	ResetPassword rp;
	UsersDAO userDAO = new UsersDAO();
	EncryptingService eS = new EncryptingService();
	MailService mS = new MailService();
	PasswordDAO passwordDAO = new PasswordDAO();

	public ResetPasswordButtonHandler(ResetPassword rp) {
		this.rp = rp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rp.sendButton) {
			if (rp.emailValue.getText().isEmpty()) {
                new ErrorPopup("Adres email nie może być pusty");
            }
			else {
				Users user = userDAO.findByLogin(rp.loginValue.getText());
				if(!user.getEmail().equals(rp.emailValue.getText())){
					new ErrorPopup("Podany email nie jest poprawny");
				} else {
					String newPass = eS.generateRandomPassword();
					mS.send(user.getEmail(), newPass);
					Password pass = user.getPassword();
					pass.setHashedPassword(eS.encryptPassword(newPass));
					passwordDAO.update(pass);
					rp.setVisible(false);
				}
			}
		}
	}

}
