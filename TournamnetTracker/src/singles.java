import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class singles extends JPanel {
	private JTextField eventField;
	private JTextField p1sponsorField;
	private JTextField p1nameField;

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
		eventField.setBounds(121, 88, 279, 20);
		add(eventField);
		eventField.setColumns(10);
		
		JLabel scorePlayer1 = new JLabel("New label");
		scorePlayer1.setBounds(76, 409, 46, 14);
		add(scorePlayer1);
		
		JLabel scorePlayer2 = new JLabel("New label");
		scorePlayer2.setBounds(315, 409, 46, 14);
		add(scorePlayer2);
		
		JButton btnP1Up = new JButton("");
		btnP1Up.setBounds(137, 393, 21, 23);
		add(btnP1Up);
		
		JButton btnP1Down = new JButton("");
		btnP1Down.setBounds(137, 420, 21, 23);
		add(btnP1Down);
		
		JButton btnP2Down = new JButton("");
		btnP2Down.setBounds(399, 420, 21, 23);
		add(btnP2Down);
		
		JButton btnP2Up = new JButton("");
		btnP2Up.setBounds(399, 393, 21, 23);
		add(btnP2Up);
		
		JLabel EventLbl = new JLabel("Event");
		EventLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		EventLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EventLbl.setBounds(10, 89, 101, 14);
		add(EventLbl);
		
		p1sponsorField = new JTextField();
		p1sponsorField.setColumns(10);
		p1sponsorField.setBounds(121, 156, 279, 20);
		add(p1sponsorField);
		
		JLabel p1sponsorlbl = new JLabel("Event");
		p1sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1sponsorlbl.setBounds(10, 157, 101, 14);
		add(p1sponsorlbl);
		
		p1nameField = new JTextField();
		p1nameField.setColumns(10);
		p1nameField.setBounds(121, 187, 279, 20);
		add(p1nameField);
		
		JLabel p1namelbl = new JLabel("Event");
		p1namelbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1namelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1namelbl.setBounds(10, 188, 101, 14);
		add(p1namelbl);
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
