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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueData = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblCircularQueueData.setBackground(new Color(64, 0, 0));
		lblCircularQueueData.setForeground(new Color(128, 0, 0));
		lblCircularQueueData.setFont(new Font("Constantia", Font.BOLD, 20));
		lblCircularQueueData.setBounds(213, 42, 364, 25);
		contentPane.add(lblCircularQueueData);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER CIRCULAR QUEUE SIZE:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(23, 133, 219, 18);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setColumns(10);
		sizefield.setBounds(255, 131, 186, 19);
		contentPane.add(sizefield);
		
		JButton btnCreateCircularQueue = new JButton("CREATE CIRCULAR QUEUE");
		btnCreateCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String message="CIRCULAR QUEUE of size:"+" "+size+" "+"is Created";
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
		btnCreateCircularQueue.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnCreateCircularQueue.setBounds(536, 130, 233, 25);
		contentPane.add(btnCreateCircularQueue);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(23, 196, 178, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(255, 194, 186, 19);
		contentPane.add(element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int elem;
				if(count==size&& count!=0)
				{
					JOptionPane.showMessageDialog(contentPane,"circular queue is full,Insertion not possible");
					element.setText("");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					++count;
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
		btnInsert.setBounds(536, 192, 157, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"CIRCULAR QUEUE is empty,Deletion not possible");
				}
				else
				{
					String message="Element deleted is"+" "+cq[f];
					JOptionPane.showMessageDialog(contentPane,message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		btnDelete.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnDelete.setBounds(284, 243, 157, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"CIRCULAR QUEUE is empty,Display not possible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg=" "+msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnDisplay.setBounds(30, 311, 157, 27);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 255));
		displaybox.setBounds(255, 311, 514, 24);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(255, 128, 255));
		btnNewButton_1.setBounds(700, 0, 116, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("ABOUT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop CircularQueue=Desktop.getDesktop();
				try
				{
					CircularQueue.browse(new URI("https://www.geeksforgeeks.org/introduction-and-array-implementation-of-circular-queue/"));
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(new Color(255, 128, 255));
		btnNewButton_1_1.setBounds(585, 0, 116, 29);
		contentPane.add(btnNewButton_1_1);
	}
}
