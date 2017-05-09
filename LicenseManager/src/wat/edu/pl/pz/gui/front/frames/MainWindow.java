package wat.edu.pl.pz.gui.front.frames;

import wat.edu.pl.pz.gui.front.listeners.MainWindowButtonHandler;
import wat.edu.pl.pz.gui.front.listeners.MainWindowFocusHandler;
import wat.edu.pl.pz.gui.front.listeners.MainWindowValueHandler;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1252042171653341106L;
	static MainWindow container;
	private final static String PATH = "/img/LOGO600.png";
	public JTextField loginValue;
	public JPasswordField passwordValue;
	public JButton loginButton;
	public JButton resetPasswordButton;

	public static MainWindow getInstance() {
		if (container == null)
			container = new MainWindow();
		return container;
	}

	private MainWindow() {
		setTitle("Okno logowania");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setBackground(Color.GRAY);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel image = new JLabel("");
		image.setForeground(Color.WHITE);
		image.setFont(new Font("Tahoma", Font.ITALIC, 11));
		image.setBackground(Color.DARK_GRAY);
		image.setBounds(100, 0, 600, 570);
		image.setIcon(new ImageIcon(MainWindow.class.getResource(PATH)));

		loginValue = new JTextField();
		loginValue.setHorizontalAlignment(SwingConstants.CENTER);
		loginValue.setForeground(Color.WHITE);
		loginValue.setText("login...");
		loginValue.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		loginValue.setBackground(Color.DARK_GRAY);
		loginValue.setBounds(444, 348, 149, 20);
		panel.add(loginValue);
		loginValue.setColumns(10);

		passwordValue = new JPasswordField();
		passwordValue.setToolTipText("haslo...");
		passwordValue.setHorizontalAlignment(SwingConstants.CENTER);
		passwordValue.setColumns(10);
		passwordValue.setForeground(Color.WHITE);
		passwordValue.setText("haslo...");
		passwordValue.setBackground(Color.DARK_GRAY);
		passwordValue.setBounds(444, 379, 149, 20);
		panel.add(passwordValue);

		loginButton = new JButton("Zaloguj");
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(Color.DARK_GRAY);
		loginButton.setBounds(444, 410, 149, 20);
		panel.add(loginButton);

		resetPasswordButton = new JButton("Reset has\u0142a");
		resetPasswordButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		resetPasswordButton.setForeground(Color.WHITE);
		resetPasswordButton.setBackground(Color.DARK_GRAY);
		resetPasswordButton.setBounds(444, 443, 110, 20);
		panel.add(resetPasswordButton);

		JLabel faktTheWorldText = new JLabel("License Managment");
		faktTheWorldText.setFont(new Font("Tahoma", Font.BOLD, 24));
		faktTheWorldText.setBounds(296, 11, 250, 27);
		panel.add(faktTheWorldText);
		panel.add(image);
		MainWindowButtonHandler mainWindowButtonHandler = new MainWindowButtonHandler(this);
		// listenery
		loginButton.addActionListener(mainWindowButtonHandler);
		resetPasswordButton.addActionListener(mainWindowButtonHandler);
		passwordValue.addActionListener(mainWindowButtonHandler);
		loginValue.addActionListener(mainWindowButtonHandler);
		loginValue.addMouseListener(new MainWindowValueHandler(this));
		passwordValue.addMouseListener(new MainWindowValueHandler(this));
		loginValue.addFocusListener(new MainWindowFocusHandler(this));
		passwordValue.addFocusListener(new MainWindowFocusHandler(this));
		// nowe okno
		setVisible(true);
	}
}
