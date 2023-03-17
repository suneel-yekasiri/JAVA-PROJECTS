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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	private Node first;
	private JTextField element3;
	private JTextField position1;
	private JTextField position2;
	
	class Node{
		private int data;
		private Node link;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(64, 0, 0));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(207, 57, 395, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(51, 114, 170, 18);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(265, 112, 141, 19);
		contentPane.add(element1);
		element1.setColumns(10);
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Node temp;
				int elem;
				elem=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Rear End of the SINGLY LINKED LIST");
					element1.setText("");
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Rear End of the SINGLY LINKED LIST");
					element1.setText("");
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
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(450, 108, 158, 24);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1.setBounds(51, 196, 170, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(265, 194, 141, 19);
		contentPane.add(element2);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int elem;
				elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Front End of the SINGLY LINKED LIST");
					element2.setText("");
				}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Front End of the SINGLY LINKED LIST");
					element2.setText("");
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
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBounds(450, 193, 158, 24);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not successful because SINGLY LINKED LIST Doesn't exist");
				}
				else if(first.link==null)
				{
					String message="Element deleted is"+" "+first.data+" "+", at the read end of the SINGLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					String message="Element deleted is"+" "+temp.link.data+" "+", at the read end of the SINGLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					temp.link=null;
				}
			}
		});
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(640, 107, 201, 25);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not successful because SINGLY LINKED LIST Doesn't exist");
				}
				else if(first.link==null)
				{
					String message="Element deleted is"+" "+first.data+" "+", at the front end of the SINGLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					first=null;
				}
				else
				{
					
					String message="Element deleted is"+" "+first.data+" "+", at the front end of the SINGLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					first=first.link;
				}
			}
		});
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(640, 192, 201, 22);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible because SINGLY LINKED LIST doesn't exist");
					displaybox.setText("");
				}
				else if(first.link==null)
				{
					msg=" "+msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=" "+msg+" "+temp.data;
						displaybox.setText(msg);
						temp=temp.link;
					}
				}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(52, 374, 181, 20);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 255));
		displaybox.setBounds(265, 375, 576, 19);
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
		btnNewButton_1.setBounds(755, 0, 116, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1_1.setBounds(51, 263, 170, 18);
		contentPane.add(lblNewLabel_1_1_1);
		
		element3 = new JTextField();
		element3.setColumns(10);
		element3.setBounds(265, 261, 141, 19);
		contentPane.add(element3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("POSITION:");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1_1_1.setBounds(450, 263, 87, 18);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnInsertAtPosition = new JButton("INSERT AT POSITION");
		btnInsertAtPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Node temp=null;
				int count=0;
				int elem=Integer.valueOf(element3.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				int pos=Integer.valueOf(position1.getText());
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"INSERTION not possible because, SINGLY LINKED LIST doesn't exist");
					element3.setText("");
					position1.setText("");
				}
				else if(pos==0)
				{

					newnode.link = first;
					first= newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion at position "+" " +pos+" is Successfull");
					element3.setText("");
					position1.setText("");
					}
				else
				{ 
					temp = first;
					while(temp.link != null)
					{
						count++;
						if(count== pos)
						{
							newnode.link = temp.link;
							temp.link= newnode;
							JOptionPane.showMessageDialog(contentPane,"Insertion at position "+" " +pos+" is Successfull");
							element3.setText("");
							position1.setText("");
							return ;
						}
						temp = temp.link;
						}
					JOptionPane.showMessageDialog(contentPane,"position is INVALID ");
					element3.setText("");
					position1.setText("");
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
		btnInsertAtPosition.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertAtPosition.setBounds(640, 260, 201, 21);
		contentPane.add(btnInsertAtPosition);
		
		position1 = new JTextField();
		position1.setColumns(10);
		position1.setBounds(547, 261, 83, 19);
		contentPane.add(position1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("POSITION:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1_1_1_1.setBounds(265, 319, 87, 18);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		position2 = new JTextField();
		position2.setColumns(10);
		position2.setBounds(362, 317, 83, 19);
		contentPane.add(position2);
		
		JButton btnDeleteAtPosition = new JButton("DELETE AT POSITION");
		btnDeleteAtPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Node temp=null;
				int count = 0;
				int pos = Integer.valueOf(position2.getText());
				if(first == null)
				{
				JOptionPane.showMessageDialog(contentPane,"DELETION is not possible because SINGLY Linked List doesn't exist"); 
				position2.setText(""); 
				return;
				}
				else if(pos == 0 && first.link == null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+first.data+" " + "at the postion of"+" "+pos);
				first=null;
				position2.setText("");
				return;
				}
				else if(pos == 0 && first.link != null)
				{
				temp=first;
				JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.data+" " + "at the postion of"+" "+pos);
				first=temp.link;
				position2.setText("");
				temp=null;
				return;
				}
				else
				{
					temp=first; 
					while(temp.link.link != null)
				{
						count++;
						if(count== pos)
						{
							JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.link.data+" " + "at the postion of"+" "+pos);
							temp.link=temp.link.link; 
							position2.setText("");
							return;
							} 
						temp=temp.link;
						if(temp.link.link == null)
						{ 
							count++; 
							if(count== pos)
							{
								JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.link.data+" " +"at the postion of"+" "+pos);
								temp.link=null; 
								position2.setText(""); return;
							}
						}

				}
					count++;
					if(temp.link.link == null && count!=pos)
					{
						JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.link.data+" " +"at the postion of"+" "+pos);
						temp.link=null;
						return;
						}
					}
				JOptionPane.showMessageDialog(contentPane,"Invalid position");
				position2.setText("");
			}
			
			catch(Exception e1)
			{
				e1.printStackTrace();
				String message="Exception caught, please check and give the valid input ";
				JOptionPane.showMessageDialog(contentPane,message);
			}
			}
		});
		btnDeleteAtPosition.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteAtPosition.setBounds(485, 316, 201, 21);
		contentPane.add(btnDeleteAtPosition);
		
		JButton btnNewButton_1_1 = new JButton("ABOUT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop SinglyLinkedList=Desktop.getDesktop();
				try
				{
					SinglyLinkedList.browse(new URI("https://www.javatpoint.com/singly-linked-list"));
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
		btnNewButton_1_1.setBounds(640, 0, 116, 29);
		contentPane.add(btnNewButton_1_1);
	}
}
