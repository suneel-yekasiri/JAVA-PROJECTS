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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setBackground(new Color(64, 0, 0));
		heading.setForeground(new Color(128, 0, 0));
		heading.setFont(new Font("Constantia", Font.BOLD, 20));
		heading.setBounds(231, 49, 250, 25);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("ENTER THE STACK SIZE:");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 146, 181, 31);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setBounds(232, 147, 173, 25);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE STACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size:"+" "+size+" "+"is Created";
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
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(508, 143, 220, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterAnElement.setBounds(33, 216, 181, 31);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(231, 216, 173, 27);
		contentPane.add(element);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Push not possible");
					element.setText("");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push successful");
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
		btnPush.setFont(new Font("Constantia", Font.BOLD, 14));
		btnPush.setBounds(508, 217, 123, 29);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Pop not possible, because now STACK is empty");
				}
				else
				{
					String message="Element deleted is"+" "+s[top];
					JOptionPane.showMessageDialog(contentPane,message);
					--top;
				}
				}
				
		});
		btnPop.setFont(new Font("Constantia", Font.BOLD, 14));
		btnPop.setBounds(231, 274, 173, 27);
		contentPane.add(btnPop);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible,because now STACK is empty");
				}
				else
				{
				 for(int i=top;i>=0;i--)
				 {
					 msg=" "+msg+" "+s[i];
				 }
				 displaybox.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(42, 334, 157, 27);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(0, 255, 255));
		displaybox.setBounds(231, 333, 497, 25);
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
		btnNewButton_1.setBounds(640, 0, 116, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("ABOUT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop Stack=Desktop.getDesktop();
				try
				{
					Stack.browse(new URI("https://www.javatpoint.com/data-structure-stack"));
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
		btnNewButton_1_1.setBounds(524, 0, 116, 29);
		contentPane.add(btnNewButton_1_1);
	}
}
