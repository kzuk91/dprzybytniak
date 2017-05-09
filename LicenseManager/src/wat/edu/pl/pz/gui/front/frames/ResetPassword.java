package wat.edu.pl.pz.gui.front.frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import wat.edu.pl.pz.gui.front.listeners.ResetPasswordButtonHandler;
import wat.edu.pl.pz.gui.front.panels.AddLicense;

import javax.swing.JButton;

import java.awt.Font;

public class ResetPassword extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3653890693353258825L;
	public JTextField loginValue;
	public JTextField emailValue;
	public JButton sendButton;
	
	
	public ResetPassword(String login) {

		setTitle("Reset has�a");
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);

	
		JPanel setPasswordPanel = new JPanel();
		setPasswordPanel.setLayout(null);
		setPasswordPanel.setOpaque(false);
		setPasswordPanel.setBackground(Color.DARK_GRAY);
		setPasswordPanel.setBounds(0, 0, 384, 262);
		getContentPane().add(setPasswordPanel);

		
		JLabel loginLabel = new JLabel("Login:");
		loginLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setBounds(49, 101, 78, 14);
		setPasswordPanel.add(loginLabel);

		JLabel emailLabel = new JLabel("e-mail:");
		emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setBounds(63, 172, 64, 14);
		setPasswordPanel.add(emailLabel);

		loginValue = new JTextField(login);
		loginValue.setColumns(10);
		loginValue.setBounds(147, 97, 189, 20);
		loginValue.setEditable(false);
		setPasswordPanel.add(loginValue);

		emailValue = new JTextField();
		emailValue.setColumns(10);
		emailValue.setBounds(147, 170, 189, 20);
		setPasswordPanel.add(emailValue);
		
				JLabel image = new JLabel("");
				image.setBounds(0, 0, 100, 100);
				image.setIcon(new ImageIcon(AddLicense.class
						.getResource("/img/LOGO100.png")));
				setPasswordPanel.add(image);
				
				sendButton = new JButton("Wy\u015Blij");
				sendButton.setForeground(Color.WHITE);
				sendButton.setFont(new Font("Tahoma", Font.BOLD, 11));
				sendButton.setBackground(new Color(30, 144, 255));
				sendButton.setBounds(152, 228, 70, 23);
				setPasswordPanel.add(sendButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setBackground(Color.DARK_GRAY);

		setVisible(true);
		
		//listenery
		sendButton.addActionListener(new ResetPasswordButtonHandler(this));

	}

}
