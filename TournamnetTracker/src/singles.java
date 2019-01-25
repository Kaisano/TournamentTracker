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
		scorePlayer1.setBounds(20, 478, 149, 168);
		add(scorePlayer1);
		
		JButton btnP1Up = new JButton("");
		btnP1Up.setBounds(179, 478, 40, 82);
		add(btnP1Up);
		
		JButton btnP1Down = new JButton("");
		btnP1Down.setBounds(179, 564, 40, 82);
		add(btnP1Down);
		
		JLabel EventLbl = new JLabel("Event");
		EventLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		EventLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EventLbl.setBounds(20, 89, 67, 14);
		add(EventLbl);
		
		p1sponsorField = new JTextField();
		p1sponsorField.setColumns(10);
		p1sponsorField.setBounds(97, 193, 303, 20);
		add(p1sponsorField);
		
		JLabel p1sponsorlbl = new JLabel("Alias");
		p1sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1sponsorlbl.setBounds(20, 199, 67, 14);
		add(p1sponsorlbl);
		
		p1nameField = new JTextField();
		p1nameField.setColumns(10);
		p1nameField.setBounds(97, 224, 303, 20);
		add(p1nameField);
		
		JLabel p1namelbl = new JLabel("Sponsor");
		p1namelbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1namelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1namelbl.setBounds(20, 230, 67, 14);
		add(p1namelbl);
		
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
		p2sponsorlbl.setBounds(20, 368, 67, 14);
		add(p2sponsorlbl);
		
		JLabel p2namelbl = new JLabel("Alias");
		p2namelbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2namelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2namelbl.setBounds(20, 337, 67, 14);
		add(p2namelbl);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 95));
		label.setBounds(281, 478, 149, 168);
		add(label);
		
		JButton button = new JButton("");
		button.setBounds(231, 478, 40, 82);
		add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(231, 564, 40, 82);
		add(button_1);
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
