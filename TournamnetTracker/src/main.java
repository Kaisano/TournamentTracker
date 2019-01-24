import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class main extends JFrame implements ActionListener {
	private JRadioButton singlesRadio, doublesRadio;
	
	private JPanel contentPane;
	singles singlesPanel = new singles();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setBounds(0, 0, 450, 800);
		
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		singlesRadio = new JRadioButton("Singles/Other");
		singlesRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		singlesRadio.setBounds(219, 7, 137, 23);
		singlesRadio.addActionListener(this);
		singlesRadio.setFocusable(false);
		contentPane.add(singlesRadio);
		
		doublesRadio = new JRadioButton("Doubles");
		doublesRadio.setBounds(358, 7, 63, 23);
		doublesRadio.addActionListener(this);
		doublesRadio.setFocusable(false);
		contentPane.add(doublesRadio);
		
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
