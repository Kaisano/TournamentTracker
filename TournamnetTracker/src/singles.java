import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class singles extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public singles() {
		setBounds(0,30,440,740);
		setLayout(null);
		setFocusable(false);
		
		textField = new JTextField();
		textField.setBounds(354, 0, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFocusable(false);
		lblNewLabel.setBounds(0, 726, 363, 14);
		add(lblNewLabel);
		
		Thread t = new Thread(new Runnable() { public void run() { 
			while(true)
			{
				String old = textField.getText();
				if(old != textField.getText())
					lblNewLabel.setText(textField.getText());
				
				old = textField.getText();
			}
		}});
		t.start();
	}
}
