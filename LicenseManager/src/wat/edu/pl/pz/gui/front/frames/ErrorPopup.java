package wat.edu.pl.pz.gui.front.frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import wat.edu.pl.pz.gui.front.panels.AddLicense;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ErrorPopup extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8745055557496699053L;

	public ErrorPopup(String s) {
		
		setTitle("Okno b��du");
		
		setBackground(Color.GRAY);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(s.length()*10+120, 140);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel image = new JLabel("");
		image.setBounds(0, 0, 100, 100);
		image.setIcon(new ImageIcon(AddLicense.class.getResource("/img/LOGO100.png")));
		panel.add(image);
		
		JLabel errorPopupLabel = new JLabel(s);
		errorPopupLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorPopupLabel.setForeground(Color.WHITE);
		errorPopupLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		errorPopupLabel.setBounds(100, 40 , s.length()*10, 30);
		panel.add(errorPopupLabel);
		
		setVisible(true);
	}

}
