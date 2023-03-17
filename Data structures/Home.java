import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CHOOSE A DATA STRUCTURE");
		heading.setForeground(new Color(128, 0, 64));
		heading.setFont(new Font("Arial Black", Font.BOLD, 20));
		heading.setBounds(178, 23, 357, 29);
		contentPane.add(heading);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.setBounds(235, 92, 145, 34);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place stack window opening code here
				new Stack().setVisible(true);
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBounds(68, 132, 85, 34);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place queue window opening code here
				new Queue().setVisible(true);
			}
		});
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(471, 132, 117, 34);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place circular queue window opening code here
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		cqueue.setBounds(68, 229, 184, 34);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place singly linked list window opening code here
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setFont(new Font("Constantia", Font.BOLD, 14));
		sll.setBounds(396, 229, 192, 34);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place doubly linked list window opening code here
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setFont(new Font("Constantia", Font.BOLD, 14));
		dll.setBounds(207, 297, 214, 34);
		contentPane.add(dll);
		
		JLabel lblNewLabel = new JLabel("suneel.y");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(632, 351, 64, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ABOUT");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop home=Desktop.getDesktop();
				try
				{
					home.browse(new URI("https://www.javatpoint.com/data-structure-introduction"));
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setBounds(593, 0, 113, 29);
		contentPane.add(btnNewButton);
	}
}
