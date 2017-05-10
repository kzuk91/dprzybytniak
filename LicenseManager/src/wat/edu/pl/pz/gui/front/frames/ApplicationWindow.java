package wat.edu.pl.pz.gui.front.frames;

import wat.edu.pl.pz.gui.back.services.SessionService;
import wat.edu.pl.pz.gui.front.panels.AddLicense;
import wat.edu.pl.pz.gui.front.panels.YourLicenses;
import wat.edu.pl.pz.gui.front.panels.AddUser;
import wat.edu.pl.pz.gui.front.panels.ManageLicenses;

import javax.swing.*;
import java.awt.*;

public class ApplicationWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7022730549422690044L;
	static ApplicationWindow appcontainer;
	private final JLabel trademark = new JLabel("Daniel Przybytniak");
	public SessionService ss = new SessionService();

	public static ApplicationWindow getInstance() {
		if (appcontainer == null)
			appcontainer = new ApplicationWindow();
		return appcontainer;
	}

	private ApplicationWindow() {
		setTitle("Zarządzanie licencjami");

		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setExtendedState(MAXIMIZED_BOTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel image = new JLabel("");
		image.setBounds(0, 0, 100, 100);
		image.setIcon(new ImageIcon(AddLicense.class.getResource("/img/LOGO100.png")));
		panel.add(image);

		JLabel title = new JLabel("License Managment");
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setBounds(333, 12, 250, 27);
		panel.add(title);
		trademark.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width - 80,
				Toolkit.getDefaultToolkit().getScreenSize().height - 35, 100, 14);
		panel.add(trademark);
		trademark.setForeground(Color.WHITE);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(100, 50, Toolkit.getDefaultToolkit().getScreenSize().width - 120,
				Toolkit.getDefaultToolkit().getScreenSize().height - 95);
		panel.add(tabbedPane);

		AddLicense addLicense = new AddLicense();
		if (!ss.getRole().isEmpty())
			if (ss.getRole().equals("Administrator"))
				tabbedPane.addTab("Nowa licencja", addLicense);

		YourLicenses yourLicenses = new YourLicenses();
		tabbedPane.addTab("Twoje licencje", yourLicenses);

		ManageLicenses manageLicenses = new ManageLicenses();
		if (!ss.getRole().isEmpty())
			if (ss.getRole().equals("Administrator"))
				tabbedPane.addTab("Zarządzaj licencjami", manageLicenses);

		AddUser addUser = new AddUser();
		if (!ss.getRole().isEmpty())
			if (ss.getRole().equals("Administrator"))
				tabbedPane.addTab("Dodaj nowego użytkownika", addUser);

		setVisible(true);
	}
}
