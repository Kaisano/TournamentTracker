import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class singles extends JPanel {
	private JTextField eventField;
	private JTextField p1sponsorField;
	private JTextField p1nameField;
	private JTextField p2nameField;
	private JTextField p2sponsorField;
	private ImageIcon up = new ImageIcon("");
	/**
	 * Create the panel.
	 */
	public singles() {
		setBounds(0,30,440,740);
		setLayout(null);
		setFocusable(false);
		
		JLabel singlesLbl = new JLabel("SINGLES");
		singlesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		singlesLbl.setFont(new Font("Tahoma", Font.BOLD, 35));
		singlesLbl.setBounds(10, 11, 420, 66);
		add(singlesLbl);
		
		eventField = new JTextField();
		eventField.setBounds(97, 88, 303, 20);
		add(eventField);
		eventField.setColumns(10);
		
		JLabel scorePlayer1 = new JLabel("0");
		scorePlayer1.setFont(new Font("Tahoma", Font.PLAIN, 95));
		scorePlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		scorePlayer1.setBounds(10, 478, 150, 102);
		add(scorePlayer1);
		
		JButton btnP1minus = new JButton("");
		btnP1minus.setBounds(10, 584, 60, 40);
		add(btnP1minus);
		
		JButton btnP1plus = new JButton("");
		btnP1plus.setBounds(100, 584, 60, 40);
		add(btnP1plus);
		
		JLabel EventLbl = new JLabel("Event");
		EventLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		EventLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EventLbl.setBounds(20, 89, 67, 14);
		add(EventLbl);
		
		p1sponsorField = new JTextField();
		p1sponsorField.setColumns(10);
		p1sponsorField.setBounds(97, 193, 303, 20);
		add(p1sponsorField);
		
		JLabel p1aliaslbl = new JLabel("Alias");
		p1aliaslbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1aliaslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1aliaslbl.setBounds(20, 199, 67, 14);
		add(p1aliaslbl);
		
		p1nameField = new JTextField();
		p1nameField.setColumns(10);
		p1nameField.setBounds(97, 224, 303, 20);
		add(p1nameField);
		
		JLabel p1sponsorlbl = new JLabel("Sponsor");
		p1sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1sponsorlbl.setBounds(20, 230, 67, 14);
		add(p1sponsorlbl);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer.setBounds(10, 145, 229, 43);
		add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer_1.setBounds(10, 283, 229, 43);
		add(lblPlayer_1);
		
		p2nameField = new JTextField();
		p2nameField.setColumns(10);
		p2nameField.setBounds(97, 331, 303, 20);
		add(p2nameField);
		
		p2sponsorField = new JTextField();
		p2sponsorField.setColumns(10);
		p2sponsorField.setBounds(97, 362, 303, 20);
		add(p2sponsorField);
		
		JLabel p2sponsorlbl = new JLabel("Sponsor");
		p2sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2sponsorlbl.setBounds(20, 363, 67, 14);
		add(p2sponsorlbl);
		
		JLabel p2aliaslbl = new JLabel("Alias");
		p2aliaslbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2aliaslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2aliaslbl.setBounds(20, 332, 67, 14);
		add(p2aliaslbl);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 95));
		label.setBounds(251, 478, 149, 102);
		add(label);
		
		JButton button = new JButton("");
		button.setBounds(340, 584, 60, 40);
		add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(251, 584, 60, 40);
		add(button_1);
		
		JLabel p1namelbl = new JLabel("Alias");
		p1namelbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1namelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1namelbl.setBounds(10, 455, 150, 14);
		add(p1namelbl);
		
		JLabel label_2 = new JLabel("Sponsor");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 430, 150, 14);
		add(label_2);
		/*
		Thread t = new Thread(new Runnable() { public void run() { 
			while(true)
			{
				String old = textField.getText();
				if(old != textField.getText())
					lblNewLabel.setText(textField.getText());
				
				old = textField.getText();
			}
		}});
		t.start();*/
	}
}
