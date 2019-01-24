import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class singles extends JPanel {

	/**
	 * Create the panel.
	 */
	public singles() {
		setBounds(0,30,440,740);
		setLayout(null);
		setFocusable(false);
		
		JLabel lblSingles = new JLabel("SINGLES");
		lblSingles.setHorizontalAlignment(SwingConstants.CENTER);
		lblSingles.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSingles.setBounds(10, 11, 420, 66);
		add(lblSingles);
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
