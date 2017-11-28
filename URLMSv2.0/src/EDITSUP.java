import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EDITSUP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JSpinner textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EDITSUP frame = new EDITSUP();
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
	public EDITSUP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddEquipment = new JLabel("Add Equipment");
		lblAddEquipment.setBounds(21, 23, 107, 16);
		contentPane.add(lblAddEquipment);
		
		textField = new JTextField();
		textField.setBounds(102, 51, 214, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 113, 214, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JSpinner();
		textField_2.setBounds(102, 161, 130, 26);
		contentPane.add(textField_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(21, 56, 71, 16);
		contentPane.add(lblName);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(21, 118, 83, 16);
		contentPane.add(lblDescription);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(21, 166, 61, 16);
		contentPane.add(lblQuantity);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setBounds(21, 207, 61, 16);
		contentPane.add(lblTotalCost);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 202, 214, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddNewEquipment = new JButton("Add New Equipment");
		btnAddNewEquipment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainPage().setVisible(true);
			}
		});
		btnAddNewEquipment.setBounds(21, 243, 164, 29);
		contentPane.add(btnAddNewEquipment);
	}
}
