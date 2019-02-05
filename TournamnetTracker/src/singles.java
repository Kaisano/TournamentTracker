import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
/**
 * 
 * @author leeal
 *	there is so much to do
 *	try to optimize the threads so that it isn't using up a bunch of cpu
 */
public class singles extends JPanel implements ActionListener{
	private static JTextField eventField, p1nameField, p1sponsorField, p2nameField, p2sponsorField;
	private static JLabel eventLbl, singlesLbl;
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
		
		//all files that need to be written to that calls methods from the fileHelper.java class
		p1name = new fileHelper("P1_Name","Player 1");
		p2name = new fileHelper("P2_Name","Player 2");
		p1sponsor = new fileHelper("P1_Sponsor","Player 1");
		p2sponsor = new fileHelper("P2_Sponsor","Player 2");
		p1scr = new fileHelper("P1_Score","Player 1");
		p2scr = new fileHelper("P2_Score","Player 2");
		event = new fileHelper("Event_Name");
		//set the score of both players to 0
		p1scr.write("0");
		p2scr.write("0");
		
		setBounds(0,30,440,740);
		setLayout(null);
		setFocusable(false);
		
		//labels and components that the user can interact with
		singlesLbl = new JLabel("SINGLES");
		singlesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		singlesLbl.setFont(new Font("Tahoma", Font.BOLD, 35));
		singlesLbl.setBounds(10, 11, 420, 66);
		singlesLbl.setFocusable(false);
		add(singlesLbl);		
		
		//event components
		eventLbl = new JLabel("Event");
		eventLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		eventLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		eventLbl.setBounds(20, 89, 67, 14);
		eventLbl.setFocusable(false);
		add(eventLbl);
		
		//event text field to type in
		//auto updates the files
		eventField = new JTextField();
		eventField.setBounds(97, 88, 303, 20);
		eventField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				try {
					event.write(eventField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				try {
					event.write(eventField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(eventField);
		
		//player 1 components
		lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer1.setBounds(10, 145, 229, 43);
		lblPlayer1.setFocusable(false);
		add(lblPlayer1);
		
		//does not change -- text right b4 the textfield
		p1aliaslbl = new JLabel("Alias");
		p1aliaslbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1aliaslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1aliaslbl.setBounds(20, 199, 67, 14);
		p1aliaslbl.setFocusable(false);
		add(p1aliaslbl);
		
		//name field to write in
		//auto update files
		p1nameField = new JTextField();
		p1nameField.setColumns(10);
		p1nameField.setBounds(97, 193, 303, 20);
		p1nameField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				p1namelbl.setText("<html>" + p1nameField.getText() + "</html>");
				try {
					p1name.write(p1nameField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				p1namelbl.setText("<html>" + p1nameField.getText() + "</html>");
				try {
					p1name.write(p1nameField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				
			}
		});
		add(p1nameField);
		
		//does not change and is the label before the text field
		p1sponsorlbl = new JLabel("Sponsor");
		p1sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p1sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1sponsorlbl.setBounds(20, 225, 67, 14);
		p1sponsorlbl.setFocusable(false);
		add(p1sponsorlbl);
		
		//text field for sponsor
		//updates files automatically
		p1sponsorField = new JTextField();
		p1sponsorField.setColumns(10);
		p1sponsorField.setBounds(97, 224, 303, 20);
		p1sponsorField.getDocument().addDocumentListener(new DocumentListener() {
		    @Override
		    public void insertUpdate(DocumentEvent e) {
		    	p1sponsorGamelbl.setText("<html>" + p1sponsorField.getText() + "</html>");
		    	try {
					p1sponsor.write(p1sponsorField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }

		    @Override
		    public void removeUpdate(DocumentEvent e) {
		    	p1sponsorGamelbl.setText("<html>" + p1sponsorField.getText() + "</html>");
		    	try {
					p1sponsor.write(p1sponsorField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }

		    @Override
		    public void changedUpdate(DocumentEvent e) {

		    }
		});
		add(p1sponsorField);
		
		p1namelbl = new JLabel("Alias");
		p1namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1namelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1namelbl.setBounds(10, 436, 150, 40);
		p1namelbl.setFocusable(false);
		add(p1namelbl);
		
		p1sponsorGamelbl = new JLabel("Sponsor");
		p1sponsorGamelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1sponsorGamelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1sponsorGamelbl.setBounds(10, 407, 150, 30);
		p1sponsorGamelbl.setFocusable(false);
		add(p1sponsorGamelbl);
		
		p1scorelbl = new JLabel("0");
		p1scorelbl.setFont(new Font("Tahoma", Font.PLAIN, 95));
		p1scorelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1scorelbl.setBounds(10, 478, 150, 102);
		p1scorelbl.setFocusable(false);
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
		
		//player 2 components
		lblPlayer2 = new JLabel("Player 2");
		lblPlayer2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlayer2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPlayer2.setBounds(10, 283, 229, 43);
		lblPlayer2.setFocusable(false);
		add(lblPlayer2);
		
		p2aliaslbl = new JLabel("Alias");
		p2aliaslbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2aliaslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2aliaslbl.setBounds(20, 332, 67, 14);
		p2aliaslbl.setFocusable(false);
		add(p2aliaslbl);
		
		p2nameField = new JTextField();
		p2nameField.setColumns(10);
		p2nameField.setBounds(97, 331, 303, 20);
		p2nameField.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				p2namelbl.setText("<html>" + p2nameField.getText() + "</html>");
				try {
					p2name.write(p2nameField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				p2namelbl.setText("<html>" + p2nameField.getText() + "</html>");
				try {
					p2name.write(p2nameField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				
			}
		});
		add(p2nameField);
		
		p2sponsorlbl = new JLabel("Sponsor");
		p2sponsorlbl.setHorizontalAlignment(SwingConstants.RIGHT);
		p2sponsorlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2sponsorlbl.setBounds(20, 363, 67, 14);
		p2sponsorlbl.setFocusable(false);
		add(p2sponsorlbl);
		
		p2sponsorField = new JTextField();
		p2sponsorField.setColumns(10);
		p2sponsorField.setBounds(97, 362, 303, 20);
		p2sponsorField.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				p2sponsorGamelbl.setText("<html>" + p2sponsorField.getText() + "</html>");
				try {
					p2sponsor.write(p2sponsorField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				p2sponsorGamelbl.setText(p2sponsorField.getText());
				try {
					p2sponsor.write("<html>" + p2sponsorField.getText() + "</html>");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				
			}
			
		});
		add(p2sponsorField);
				
		p2sponsorGamelbl = new JLabel("Sponsor");
		p2sponsorGamelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2sponsorGamelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p2sponsorGamelbl.setBounds(250, 407, 150, 30);
		p2sponsorGamelbl.setFocusable(false);
		add(p2sponsorGamelbl);
		
		p2namelbl = new JLabel("Alias");
		p2namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2namelbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p2namelbl.setBounds(250, 436, 150, 40);
		p2namelbl.setFocusable(false);
		add(p2namelbl);		
		
		p2scorelbl = new JLabel("0");
		p2scorelbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2scorelbl.setFont(new Font("Tahoma", Font.PLAIN, 95));
		p2scorelbl.setBounds(251, 478, 149, 102);
		p2scorelbl.setFocusable(false);
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
	}

		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == p1minusbtn)
		{
			int score = Integer.parseInt(p1scorelbl.getText());
			if(score > 0)
				p1scorelbl.setText((score - 1) + "");
			try {
				p1scr.write(p1scorelbl.getText());
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
				p1scr.write(p1scorelbl.getText());
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
				p2scr.write(p2scorelbl.getText());
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
				p2scr.write(p2scorelbl.getText());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
