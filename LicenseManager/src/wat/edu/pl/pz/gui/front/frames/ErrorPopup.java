package wat.edu.pl.pz.gui.front.frames;

import wat.edu.pl.pz.gui.front.panels.AddLicense;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ErrorPopup extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8745055557496699053L;

	//TODO: do usunięcia po przerobieniu komunikatów walidayjncyh
	public ErrorPopup(String s) {

		setTitle("Okno błędu");
		
		setBackground(Color.GRAY);
		setSize(s.length()*10+120, 140);
		setLocationRelativeTo(null);

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}
		});

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

	public ErrorPopup(String s, int lineCount) {

		setTitle("Okno błędu");

		setBackground(Color.GRAY);
		setSize(s.length() + 250, lineCount * 20 + 150);
		setLocationRelativeTo(null);

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}
		});

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
		errorPopupLabel.setBounds(100, 10, s.length() + 50, lineCount * 20 + 50);
		panel.add(errorPopupLabel);

		setVisible(true);
	}

}
