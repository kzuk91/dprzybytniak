package wat.edu.pl.pz.gui.front.listeners;

import wat.edu.pl.pz.gui.back.dao.*;
import wat.edu.pl.pz.gui.back.entity.Address;
import wat.edu.pl.pz.gui.back.entity.Employee;
import wat.edu.pl.pz.gui.back.entity.Users;
import wat.edu.pl.pz.gui.back.services.EncryptingService;
import wat.edu.pl.pz.gui.back.services.MailService;
import wat.edu.pl.pz.gui.front.frames.ErrorPopup;
import wat.edu.pl.pz.gui.front.panels.AddUser;

import javax.persistence.NoResultException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUserButtonHandler implements ActionListener {
	AddUser nu;
	UsersDAO userDAO = new UsersDAO();
	PostalCodeDAO postCodeDAO = new PostalCodeDAO();
	EmployeeDAO employeeDAO = new EmployeeDAO();
	AddressDAO addressDAO = new AddressDAO();
	RoleDAO roleDAO = new RoleDAO();
	PasswordDAO passwordDAO = new PasswordDAO();
	EncryptingService encService = new EncryptingService();
	MailService mailService = new MailService();

	public AddUserButtonHandler(AddUser nu) {
		this.nu = nu;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nu.addUserButton) {
			if (nu.loginValue.getText().isEmpty()) {
                new ErrorPopup("Login nie może być pusty");
            } else if (nu.nameValue.getText().isEmpty()) {
                new ErrorPopup("Imię nie możee być puste");
            } else if (nu.surnameValue.getText().isEmpty()) {
                new ErrorPopup("Nazwisko nie mmoże być puste");
            } else if (nu.emailValue.getText().isEmpty()) {
                new ErrorPopup("Email nie może być pusty");
            } else if (nu.idValue.getText().isEmpty()) {
                new ErrorPopup("Pesel nie może być pusty");
            } else if (nu.streetValue.getText().isEmpty()) {
                new ErrorPopup("Nazwa ulicy nie może być pusta");
            } else if (nu.houseNumberValue.getText().isEmpty()) {
                new ErrorPopup("Numer domu nie może być pusty");
            } else if (nu.cityValue.getText().isEmpty()) {
                new ErrorPopup("Nazwa miejscowości nie może być pusta");
            } else if (nu.postCodeValue.getText().isEmpty()) {
                new ErrorPopup("Numer kodu nie może być pusty");
            } else {
				// Users user = new Users();
				Users user;
				try {
					user = userDAO.findByLogin(nu.loginValue.getText());
					if (user.getLogin().equals(nu.loginValue.getText())) {
                        new ErrorPopup("Podany użytkownik już istnieje");
                    }

				} catch (NoResultException exept) {
					user = new Users();
					Employee employee = new Employee();
					Address address = new Address();
					user.setLogin(nu.loginValue.getText());
					employee.setName(nu.nameValue.getText());
					employee.setSurname(nu.surnameValue.getText());
					user.setEmail(nu.emailValue.getText());
					employee.setIdentificationNumber(Long.parseLong(nu.idValue
							.getText()));
					address.setStreet(nu.streetValue.getText());
					address.setHouseNumber(Integer.parseInt(nu.houseNumberValue
							.getText()));
					address.setCity(nu.cityValue.getText());
					address.setPostCode(postCodeDAO.findByCode(nu.postCodeValue
							.getText()));
					address = addressDAO.save(address);
					employee.setAddress(address);
					employee = employeeDAO.save(employee);
					user.setEmployee(employee);
                    // TODO: dorobi? jaki? ciekawy mechanizm nadawania roli
                    user.setRole(roleDAO.findByName("Użytkownik"));
                    String uncodedpass = encService.generateRandomPassword();
					mailService.send(user.getEmail(), uncodedpass);
					user.setPassword(passwordDAO.save(encService
							.encryptPassword(uncodedpass)));
					user = userDAO.save(user);
                    new ErrorPopup("Dodano użytkownika: " + user.getLogin());
                    nu.nameValue.setText("");
					nu.surnameValue.setText("");
					nu.emailValue.setText("");
					nu.idValue.setText("");
					nu.loginValue.setText("");
					nu.streetValue.setText("");
					nu.houseNumberValue.setText("");
					nu.localeNumberValue.setText("");
					nu.cityValue.setText("");
					nu.postCodeValue.setText("");
				}
			}
		}
		if (e.getSource() == nu.cancelButton) {
			nu.nameValue.setText("");
			nu.surnameValue.setText("");
			nu.emailValue.setText("");
			nu.idValue.setText("");
			nu.loginValue.setText("");
			nu.streetValue.setText("");
			nu.houseNumberValue.setText("");
			nu.localeNumberValue.setText("");
			nu.cityValue.setText("");
			nu.postCodeValue.setText("");
		}
	}

}
