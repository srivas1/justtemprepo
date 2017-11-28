import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Supplies extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnAddEquipment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supplies frame = new Supplies();
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
	public Supplies() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabEquipment = new JLabel("LAB Equipment");
		lblLabEquipment.setBounds(26, 25, 101, 16);
		contentPane.add(lblLabEquipment);
		
		table = new JTable();
		table.setBounds(22, 214, 411, -154);
		contentPane.add(table);
		
		btnAddEquipment = new JButton("Add Equipment");
		btnAddEquipment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EDITSUP().setVisible(true);
			}
		});
		btnAddEquipment.setBounds(29, 229, 140, 29);
		contentPane.add(btnAddEquipment);
	}

}
