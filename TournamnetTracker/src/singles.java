import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class singles extends JPanel implements ActionListener{
	private static JTextField eventField, p1nameField, p1sponsorField, p2nameField, p2sponsorField;
	private static JLabel EventLbl, singlesLbl;
	private static JLabel p1scorelbl, p1sponsorlbl, p1aliaslbl, lblPlayer1, p1sponsorGamelbl, p1namelbl;
	private static JLabel lblPlayer2, p2sponsorlbl, p2aliaslbl, p2namelbl, p2sponsorGamelbl, p2scorelbl;
	private JButton p1minusbtn, p1plusbtn;
	private JButton p2minusbtn, p2plusbtn;
	private static fileHelper p1name, p1sponsor, p2name, p2sponsor, p1scr, p2scr, event;
	
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public singles() throws IOException {
		p1name = new fileHelper("P1_Name","Player 1");
		p2name = new fileHelper("P2_Name","Player 2");
		p1sponsor = new fileHelper("P1_Sponsor","Player 1");
		p2sponsor = new fileHelper("P2_Sponsor","Player 2");
		p1scr = new fileHelper("P1_Score","Player 1");
		p2scr = new fileHelper("P2_Score","Player 2");
		event = new fileHelper("Event_Name");
		
		p1scr.write("0");
		p2scr.write("0");
		
		setBounds(0,30,440,740);
		setLayout(null);
		setFocusable(false);
		
		singlesLbl = new JLabel("SINGLES");
		singlesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		singlesLbl.setFont(new Font("Tahoma", Font.BOLD, 35));
		singlesLbl.setBounds(10, 11, 420, 66);
		add(singlesLbl);
		
		eventField = new JTextField();
		eventField.setBounds(97, 88, 303, 20);
		add(eventField);
		eventField.setColumns(10);
		
		p1scorelbl = new JLabel("0");
		p1scorelbl.setFont(new Font("Tahoma", Font.PLAIN, 95));
		p1scorelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1scorelbl.setBounds(10, 478, 150, 102);
		add(p1scorelbl);
		
		p1minusbtn = new JButton("-");
		p1minusbtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		p1minusbtn.setBounds(10, 584, 68, 40);
		add(p1minusbtn);
		p1minusbtn.addActionListener(this);
		
		p1plusbtn = new JButton("+");
		p1plusbtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		p1plusbtn.setBounds(92, 584, 68, 40);
		add(p1plusbtn);
		p1plusbtn.addActionListener(this);
		
		EventLbl = new JLabel("Event");
		EventLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		EventLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EventLbl.setBounds(20, 89, 67, 14);
		add(EventLbl);
		
		p1nameField = new JTextField();
		p1nameField.setColumns(10);
		p1nameField.setBounds(97, 193, 303, 20);
		add(p1nameField);
		
		p1aliaslbl = new JLabel("Alias");
		p1aliaslbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1aliaslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1aliaslbl.setBounds(20, 199, 67, 14);
		add(p1aliaslbl);
		
		p1sponsorField = new JTextField();
		p1sponsorField.setColumns(10);
		p1sponsorField.setBounds(97, 224, 303, 20);
		add(p1sponsorField);
		
		p1sponsorlbl = new JLabel("Sponsor");
		p1sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1sponsorlbl.setBounds(20, 230, 67, 14);
		add(p1sponsorlbl);
		
		lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer1.setBounds(10, 145, 229, 43);
		add(lblPlayer1);
		
		lblPlayer2 = new JLabel("Player 2");
		lblPlayer2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer2.setBounds(10, 283, 229, 43);
		add(lblPlayer2);
		
		p2nameField = new JTextField();
		p2nameField.setColumns(10);
		p2nameField.setBounds(97, 331, 303, 20);
		add(p2nameField);
		
		p2sponsorField = new JTextField();
		p2sponsorField.setColumns(10);
		p2sponsorField.setBounds(97, 362, 303, 20);
		add(p2sponsorField);
		
		p2sponsorlbl = new JLabel("Sponsor");
		p2sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2sponsorlbl.setBounds(20, 363, 67, 14);
		add(p2sponsorlbl);
		
		p2aliaslbl = new JLabel("Alias");
		p2aliaslbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2aliaslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2aliaslbl.setBounds(20, 332, 67, 14);
		add(p2aliaslbl);
		
		p2scorelbl = new JLabel("0");
		p2scorelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2scorelbl.setFont(new Font("Tahoma", Font.PLAIN, 95));
		p2scorelbl.setBounds(251, 478, 149, 102);
		add(p2scorelbl);
		
		p2minusbtn = new JButton("-");
		p2minusbtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		p2minusbtn.setBounds(251, 584, 68, 40);
		add(p2minusbtn);
		p2minusbtn.addActionListener(this);
		
		p2plusbtn = new JButton("+");
		p2plusbtn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		p2plusbtn.setBounds(332, 584, 68, 40);
		add(p2plusbtn);
		p2plusbtn.addActionListener(this);
		
		p1namelbl = new JLabel("Alias");
		p1namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1namelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1namelbl.setBounds(10, 436, 150, 40);
		add(p1namelbl);
		
		p1sponsorGamelbl = new JLabel("Sponsor");
		p1sponsorGamelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1sponsorGamelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1sponsorGamelbl.setBounds(10, 407, 150, 30);
		add(p1sponsorGamelbl);
		
		p2namelbl = new JLabel("Alias");
		p2namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2namelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p2namelbl.setBounds(250, 436, 150, 40);
		add(p2namelbl);
		
		p2sponsorGamelbl = new JLabel("Sponsor");
		p2sponsorGamelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2sponsorGamelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p2sponsorGamelbl.setBounds(250, 407, 150, 30);
		add(p2sponsorGamelbl);
		
		checkFieldsp1();
		checkFieldsp2();
		checkEvent();
	}

	public static void checkEvent()
	{
		Thread t = new Thread(new Runnable() { public void run() { 
			String old = eventField.getText();
			while(true)
			{
				String newStr = eventField.getText();
				if(old != newStr) {
					try {
						event.write(newStr);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				old = eventField.getText();
			}
		}});
		t.start();
	}	
	
	public static void checkFieldsp1()
	{
		Thread t = new Thread(new Runnable() { public void run() { 
			String old1 = p1nameField.getText();
			String old2 = p1sponsorField.getText();
			while(true)
			{
				String new1 = p1nameField.getText();
				String new2 = p1sponsorField.getText();
				if(old1 != new1) {
					p1namelbl.setText("<html>" + new1 + "</hmtl>");
					try {
						p1name.write(new1);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(old2 != new2) {
					p1sponsorGamelbl.setText("<html>" + new2 + "</html>");
					try {
						p1sponsor.write(new2);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				
				old1 = p1nameField.getText();
				old2 = p1sponsorField.getText();
			}
		}});
		t.start();
	}
	public static void checkFieldsp2()
	{
		Thread t = new Thread(new Runnable() { public void run() { 
			String old1 = p2nameField.getText();
			String old2 = p2sponsorField.getText();
			while(true)
			{
				String new1 = p2nameField.getText();
				String new2 = p2sponsorField.getText();
				if(old1 != new1) {
					p2namelbl.setText("<html>" + new1 + "</hmtl>");
					try {
						p2name.write(new1);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(old2 != new2) {
					p2sponsorGamelbl.setText("<html>" + new2 + "</html>");
					try {
						p2sponsor.write(new2);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				
				old1 = p2nameField.getText();
				old2 = p2sponsorField.getText();
			}
		}});
		t.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == p1minusbtn)
		{
			int score = Integer.parseInt(p1scorelbl.getText());
			if(score > 0)
				p1scorelbl.setText((score - 1) + "");
			try {
				p1scr.write("" + (score - 1));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource() == p1plusbtn)
		{
			int score = Integer.parseInt(p1scorelbl.getText());
			p1scorelbl.setText((score + 1) + "");
			try {
				p1scr.write("" + (score +1));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource() == p2minusbtn)
		{
			int score = Integer.parseInt(p2scorelbl.getText());
			if(score > 0)
				p2scorelbl.setText((score - 1) + "");
			try {
				p2scr.write("" + (score - 1));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource() == p2plusbtn)
		{
			int score = Integer.parseInt(p2scorelbl.getText());
			p2scorelbl.setText((score + 1) + "");
			try {
				p2scr.write("" + (score + 1));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
