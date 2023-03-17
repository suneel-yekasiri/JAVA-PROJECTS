import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(64, 0, 0));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(231, 46, 257, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(23, 142, 151, 18);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(190, 137, 186, 25);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				size=Integer.valueOf(sizefield.getText());
				q=new int[size];
				String message="QUEUE of size:"+" "+size+" "+"is Created";
				JOptionPane.showMessageDialog(contentPane,message);
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
					String message="Exception caught, please check and give the valid input ";
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(502, 133, 188, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(23, 200, 151, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(190, 195, 186, 25);
		contentPane.add(element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
					element.setText("");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful");
					element.setText("");
				}
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
					String message="Exception caught, please check and give the valid input ";
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		btnInsert.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnInsert.setBounds(502, 198, 188, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible,because QUEUE is empty");
				}
				else
				{
					String message="Element deleted is"+" "+q[f];
					JOptionPane.showMessageDialog(contentPane,message);
					++f;
				}
				
			}
		});
		btnDelete.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnDelete.setBounds(190, 254, 186, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible,because QUEUE is empty");
				}
				else
				{
				 for(int i=f;i<=r;i++)
				 {
					 msg=" "+msg+" "+q[i];
				 }
				 displaybox.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnDisplay.setBounds(23, 310, 141, 27);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 255));
		displaybox.setColumns(10);
		displaybox.setBounds(190, 312, 500, 25);
		contentPane.add(displaybox);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(255, 128, 255));
		btnNewButton_1.setBounds(644, 0, 116, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("ABOUT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop Queue=Desktop.getDesktop();
				try
				{
					Queue.browse(new URI("https://www.javatpoint.com/data-structure-queue"));
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(new Color(255, 128, 192));
		btnNewButton_1_1.setBounds(532, 0, 113, 29);
		contentPane.add(btnNewButton_1_1);
	}

}
