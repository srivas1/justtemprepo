import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.Color;

public class MainPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static MainPage frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnStaff = new JButton("Staff");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Staff().setVisible(true);
			}
		});
		btnStaff.setBackground(new Color(255, 0, 0));
		btnStaff.setForeground(new Color(0, 0, 0));
		layeredPane.add(btnStaff);
		
		JButton btnSupplies = new JButton("Manage \nEquipments");
		btnSupplies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Supplies().setVisible(true);
			}
		});
		btnSupplies.setBackground(new Color(0, 255, 255));
		layeredPane.add(btnSupplies);
		
		JButton btnFunding = new JButton("Funding");
		btnFunding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Funding().setVisible(true);
			}
		});
		layeredPane.add(btnFunding);
		
		JButton btnTasks = new JButton("Tasks");
		btnTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Mytasks().setVisible(true);
			}
		});
		layeredPane.add(btnTasks);
	}

	public static JPanel newPanel() {
		// TODO Auto-generated method stub
		return null;
	}



}
