package wat.edu.pl.pz.gui.front.frames;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class SetPassword extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 407082342102146327L;
	private JTextField loginValue;
	private JPasswordField passwordValue;
	private JPasswordField passwordValue2;

	public SetPassword() {

		setTitle("Ustawienie has³a");
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);

		JPanel setPasswordPanel = new JPanel();
		setPasswordPanel.setLayout(null);
		setPasswordPanel.setOpaque(false);
		setPasswordPanel.setBackground(Color.DARK_GRAY);
		setPasswordPanel.setBounds(25, 20, 334, 200);
		getContentPane().add(setPasswordPanel);

		JLabel loginLabel = new JLabel("Login:");
		loginLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setBounds(15, 39, 78, 14);
		setPasswordPanel.add(loginLabel);

		JLabel passwordLabel = new JLabel("Has\u0142o:");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setBounds(29, 92, 64, 14);
		setPasswordPanel.add(passwordLabel);

		JLabel passwordLabel2 = new JLabel("Powt\u00F3rz has\u0142o:");
		passwordLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel2.setForeground(Color.WHITE);
		passwordLabel2.setBounds(0, 145, 93, 14);
		setPasswordPanel.add(passwordLabel2);

		loginValue = new JTextField();
		loginValue.setColumns(10);
		loginValue.setBounds(113, 35, 189, 20);
		setPasswordPanel.add(loginValue);
		
		passwordValue = new JPasswordField();
		passwordValue.setBounds(113, 90, 189, 20);
		setPasswordPanel.add(passwordValue);
		
		passwordValue2 = new JPasswordField();
		passwordValue2.setBounds(113, 145, 189, 20);
		setPasswordPanel.add(passwordValue2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setBackground(Color.DARK_GRAY);

		setVisible(true);

	}
}
