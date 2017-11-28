import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddTask extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTask frame = new AddTask();
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
	public AddTask() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(47, 66, 61, 16);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(103, 61, 281, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(47, 115, 61, 16);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 110, 271, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("50%");
		label.setBounds(187, 223, 61, 16);
		contentPane.add(label);
		
		JSlider slider = new JSlider();
		slider.setBounds(103, 193, 190, 29);
		contentPane.add(slider);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(47, 196, 33, 26);
		contentPane.add(spinner);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainPage().setVisible(true);
			}
		});
		btnAdd.setBounds(316, 218, 117, 29);
		contentPane.add(btnAdd);
	}
}
