import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddGrant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGrant frame = new AddGrant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddGrant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddNewGrant = new JLabel("Add New Grant");
		lblAddNewGrant.setBounds(30, 18, 61, 16);
		contentPane.add(lblAddNewGrant);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(30, 61, 61, 16);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(120, 56, 232, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(30, 99, 73, 16);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 94, 232, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSponsor = new JLabel("Sponsor ");
		lblSponsor.setBounds(30, 133, 61, 16);
		contentPane.add(lblSponsor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 128, 232, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(30, 173, 61, 16);
		contentPane.add(lblAmount);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 168, 232, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEntryType = new JLabel("Entry Type");
		lblEntryType.setBounds(30, 223, 73, 16);
		contentPane.add(lblEntryType);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 218, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(262, 218, 33, 26);
		contentPane.add(spinner);
		
		JButton btnAddEntry = new JButton("Add Entry");
		btnAddEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainPage().setVisible(true);
			}
		});
		btnAddEntry.setBounds(16, 251, 117, 29);
		contentPane.add(btnAddEntry);
	}
}
