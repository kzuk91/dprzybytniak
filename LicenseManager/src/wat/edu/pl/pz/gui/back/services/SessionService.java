package wat.edu.pl.pz.gui.back.services;

public class SessionService {
	public static String login;
	public static String role = "";

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		SessionService.login = login;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		SessionService.role = role;
	}

}
