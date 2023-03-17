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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBackground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(250, 50, 254, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH:");
		lblEnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterArrayLength.setBounds(49, 129, 214, 27);
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setBounds(282, 129, 121, 25);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// code for creating the array
				
				try
				{
				int len=Integer.valueOf(length.getText());   // converting string to integer
				arr=new int[len];  // storing in an array by creating arr=new int[len]
				String message="Array of length:" + len +" "+"is Created";  //showing created msg
				JOptionPane.showMessageDialog(contentPane,message);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					String message="Exception caught, please check and give the valid input ";
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(421, 129, 181, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENT:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(47, 214, 232, 27);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(282, 212, 121, 27);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				if(pos<arr.length)
				{
				arr[pos]=elem;
				String message="Element"+" "+elem+" "+"Inserted at the position"+" "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
				}
				else
				{
					String message="Insertion not possible:because array index out of boundary";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					insertposition.setText("");
					
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				String message="Exception caught, please check and give the valid input ";
				JOptionPane.showMessageDialog(contentPane,message);
			}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(633, 214, 148, 27);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1 = new JLabel("DELETE POSITION:");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(47, 274, 181, 27);
		contentPane.add(lblNewLabel_1_1);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(282, 273, 121, 26);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		insertposition = new JTextField();
		insertposition.setBounds(515, 214, 96, 26);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("POSITION:");
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(421, 214, 84, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				try
				{
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element Deleted at the position"+" "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				String message="Exception caught, please check and give the valid input ";
				JOptionPane.showMessageDialog(contentPane,message);
			}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(427, 274, 148, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=" "+msg+" "+arr[i];
				}
				displaybox.setText(msg);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					String message="Exception caught, please check and give the valid input ";
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(49, 378, 130, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(0, 255, 255));
		displaybox.setBounds(202, 378, 579, 25);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 128, 255));
		btnNewButton.setBounds(705, 0, 116, 29);
		contentPane.add(btnNewButton);
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop Array=Desktop.getDesktop();
				try
				{
					Array.browse(new URI("https://www.javatpoint.com/data-structure-array"));
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnAbout.setForeground(Color.BLACK);
		btnAbout.setFont(new Font("Constantia", Font.BOLD, 16));
		btnAbout.setBackground(new Color(255, 128, 255));
		btnAbout.setBounds(592, 0, 116, 29);
		contentPane.add(btnAbout);
	}
}
