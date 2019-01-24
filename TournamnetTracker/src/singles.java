import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class singles extends JPanel {

	/**
	 * Create the panel.
	 */
	public singles() {
		setBounds(0,30,440,740);
		setFocusable(false);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{420, 0};
		gridBagLayout.rowHeights = new int[]{66, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblSingles = new JLabel("SINGLES");
		lblSingles.setHorizontalAlignment(SwingConstants.CENTER);
		lblSingles.setFont(new Font("Tahoma", Font.BOLD, 35));
		GridBagConstraints gbc_lblSingles = new GridBagConstraints();
		gbc_lblSingles.fill = GridBagConstraints.BOTH;
		gbc_lblSingles.gridx = 0;
		gbc_lblSingles.gridy = 0;
		add(lblSingles, gbc_lblSingles);
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
