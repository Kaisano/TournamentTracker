import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class main extends JFrame implements ActionListener {
	private JRadioButton singlesRadio, doublesRadio;
	
	private JPanel contentPane;
	static singles singlesPanel;
	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		singlesPanel = new singles();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setFocusable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 425, 800);
		setTitle("Tournament Tracker v0.2");
		
		
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//radio buttons for determining whether the event is doubles or singles and switches options
		singlesRadio = new JRadioButton("Singles/Other");
		singlesRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		singlesRadio.setBounds(175, 7, 137, 23);
		singlesRadio.addActionListener(this);
		singlesRadio.setFocusable(false);
		contentPane.add(singlesRadio);
		
		doublesRadio = new JRadioButton("Doubles");
		doublesRadio.setBounds(314, 7, 83, 23);
		doublesRadio.addActionListener(this);
		doublesRadio.setFocusable(false);
		contentPane.add(doublesRadio);
		singlesPanel.setBounds(0, 30, 424, 740);
		
		contentPane.add(singlesPanel);
		singlesPanel.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == singlesRadio)
		{
			doublesRadio.setSelected(false);
			singlesPanel.setVisible(true);
		}
		if(e.getSource() == doublesRadio)
		{
			singlesRadio.setSelected(false);
			singlesPanel.setVisible(false);
		}
	}
}
