import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddExpense extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddExpense frame = new AddExpense();
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
	public AddExpense() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddExpense = new JLabel("Add Expense");
		lblAddExpense.setBounds(23, 18, 93, 16);
		contentPane.add(lblAddExpense);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(23, 60, 61, 16);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(129, 55, 248, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(23, 109, 81, 16);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 104, 248, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCose = new JLabel("Cost");
		lblCose.setBounds(23, 154, 61, 16);
		contentPane.add(lblCose);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 149, 248, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEntryType = new JLabel("Entry Type");
		lblEntryType.setBounds(23, 209, 81, 16);
		contentPane.add(lblEntryType);
		
		textField_3 = new JTextField();
		textField_3.setBounds(129, 204, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(271, 204, 33, 26);
		contentPane.add(spinner);
		
		JButton btnAddEntry = new JButton("Add Entry");
		btnAddEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainPage().setVisible(true);
			}
		});
		btnAddEntry.setBounds(6, 243, 117, 29);
		contentPane.add(btnAddEntry);
	}

}
