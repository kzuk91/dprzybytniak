package wat.edu.pl.pz.gui.front.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.NoResultException;

import wat.edu.pl.pz.gui.back.dao.AddressDAO;
import wat.edu.pl.pz.gui.back.dao.EmployeeDAO;
import wat.edu.pl.pz.gui.back.dao.PasswordDAO;
import wat.edu.pl.pz.gui.back.dao.PostalCodeDAO;
import wat.edu.pl.pz.gui.back.dao.RoleDAO;
import wat.edu.pl.pz.gui.back.dao.UsersDAO;
import wat.edu.pl.pz.gui.back.entity.Address;
import wat.edu.pl.pz.gui.back.entity.Employee;
import wat.edu.pl.pz.gui.back.entity.Users;
import wat.edu.pl.pz.gui.back.services.EncryptingService;
import wat.edu.pl.pz.gui.back.services.MailService;
import wat.edu.pl.pz.gui.front.frames.ErrorPopup;
import wat.edu.pl.pz.gui.front.panels.AddUser;

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
				new ErrorPopup("Login nie mo¿e byæ pusty");
			} else if (nu.nameValue.getText().isEmpty()) {
				new ErrorPopup("Imiê nie mo¿e byæ puste");
			} else if (nu.surnameValue.getText().isEmpty()) {
				new ErrorPopup("Nazwisko nie mo¿e byæ puste");
			} else if (nu.emailValue.getText().isEmpty()) {
				new ErrorPopup("email nie mo¿e byæ pusty");
			} else if (nu.idValue.getText().isEmpty()) {
				new ErrorPopup("Pesel nie mo¿e byæ pusty");
			} else if (nu.streetValue.getText().isEmpty()) {
				new ErrorPopup("Nazwa ulicy nie mo¿e byæ pusta");
			} else if (nu.houseNumberValue.getText().isEmpty()) {
				new ErrorPopup("Numer domu nie mo¿e byæ pusty");
			} else if (nu.cityValue.getText().isEmpty()) {
				new ErrorPopup("Nazwa miejscowoœci nie mo¿e byæ pusty");
			} else if (nu.postCodeValue.getText().isEmpty()) {
				new ErrorPopup("Numer kodu nie mo¿e byæ pusty");
			} else {
				// Users user = new Users();
				Users user;
				try {
					user = userDAO.findByLogin(nu.loginValue.getText());
					if (user.getLogin().equals(nu.loginValue.getText())) {
						new ErrorPopup("Podany u¿ytkownik ju¿ istnieje");
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
					// TODO: dorobiæ jakiœ ciekawy mechanizm nadawania roli
					user.setRole(roleDAO.findByName("U¿ytkownik"));
					String uncodedpass = encService.generateRandomPassword();
					mailService.send(user.getEmail(), uncodedpass);
					user.setPassword(passwordDAO.save(encService
							.encryptPassword(uncodedpass)));
					user = userDAO.save(user);
					new ErrorPopup("Dodano u¿ytkownika: " + user.getLogin());
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
