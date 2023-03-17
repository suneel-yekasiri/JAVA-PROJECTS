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
import java.awt.SystemColor;

public class DoublyLinkedList extends JFrame {

	class Node
	{
		private Node prelink;
		private int data;
		private Node nextlink;
	}
	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	private Node first;
	private JTextField element3;
	private JTextField pos1;
	private JTextField pos2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setBackground(new Color(64, 0, 0));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(183, 34, 399, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 105, 147, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(27, 163, 147, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element1 = new JTextField();
		element1.setBounds(229, 103, 127, 19);
		contentPane.add(element1);
		element1.setColumns(10);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(229, 161, 127, 19);
		contentPane.add(element2);
		
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
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Rear End of the DOUBLY LINKED LIST");
					element1.setText("");
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Rear End of the DOUBLY LINKED LIST");
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
		btnNewButton.setBounds(415, 102, 175, 27);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int elem;
				elem=Integer.valueOf(element2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Front End of the DOUBLY LINKED LIST");
					element2.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion successful at Front End of the DOUBLY LINKED LIST");
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
		btnInsertFront.setBounds(415, 154, 175, 27);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion is not possible because, DOUBLY LINKED LIST DOESN'T EXIST");
				}
				else if(first.nextlink==null)
				{
					String message="Element deleted is"+" "+first.data+" "+", at the rear end of the DOUBLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					String message="Element deleted is"+" "+temp.nextlink.data+" "+", at the rear end of the DOUBLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					temp.nextlink=null;
				}
			}
		});
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(620, 101, 201, 27);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion is not possible because, DOUBLY LINKED LIST DOESN'T EXIST");
				}
				else if(first.nextlink==null)
				{
					String message="Element deleted is"+" "+first.data+" "+", at the front end of the DOUBLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					first=null;
				}
				else
				{
					String message="Element deleted is"+" "+first.data+" "+", at the front end of the DOUBLY LINKED LIST";
					JOptionPane.showMessageDialog(contentPane,message);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(620, 155, 201, 25);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible because, DOUBLY LINKED LIST DOESN'T EXIST");
				}
				else if(first.nextlink==null)
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
						temp=temp.nextlink;
					}
				}
			}
		});
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayForward.setBounds(27, 342, 175, 27);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible because, DOUBLY LINKED LIST DOESN'T EXIST");
				}
				else if(first.nextlink==null)
				{
					msg=" "+msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=" "+msg+" "+temp.data;
						displaybox.setText(msg);
						temp=temp.prelink;
					}
				}
			}
		});
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayReverse.setBounds(27, 416, 175, 27);
		contentPane.add(btnDisplayReverse);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 255));
		displaybox.setBounds(227, 383, 594, 19);
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
		btnNewButton_1.setBounds(730, 0, 116, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(27, 225, 147, 18);
		contentPane.add(lblNewLabel_1_1_1);
		
		element3 = new JTextField();
		element3.setColumns(10);
		element3.setBounds(229, 223, 127, 19);
		contentPane.add(element3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("POSITION:");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1_1_1.setBounds(416, 226, 87, 18);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		pos1 = new JTextField();
		pos1.setColumns(10);
		pos1.setBounds(513, 223, 83, 19);
		contentPane.add(pos1);
		
		JButton btnInsertAtPosition = new JButton("INSERT AT POSITION");
		btnInsertAtPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Node temp=null;
				int count = 0; 
				int elem = Integer.valueOf(element3.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.nextlink = null; 
				newnode.prelink = null; 
				int pos = Integer.valueOf(pos1.getText()); 
				if(first == null)
				{
				JOptionPane.showMessageDialog(contentPane,"Doubly Linked List doesn't exist!");
				element3.setText("");
				pos1.setText("");
				} 
				else if(pos == 0)
				{
				newnode.nextlink = first;
				first.prelink=newnode;
				first = newnode;
				JOptionPane.showMessageDialog(contentPane,"Insertion Successfull at the position"+" "+pos+" of DOUBLY LINKED LIST");
				element3.setText(""); 
				pos1.setText("");
				} 
				else
				{
					temp = first; 
					while(temp.nextlink != null)

				{ 
						count++; 
						if(count== pos)

				{

				newnode.nextlink=temp.nextlink; 
				temp.nextlink.prelink=newnode;
				temp.nextlink=newnode; 
				newnode.prelink=temp;
				JOptionPane.showMessageDialog(contentPane,"Insertion Successfull at the position"+" "+pos+" of DOUBLY LINKED LIST"); 
				element3.setText("");
				pos1.setText("");
				return;
				}
				temp=temp.nextlink;
				}
				JOptionPane.showMessageDialog(contentPane,"Invalid position"); 
				element3.setText("");
				pos1.setText("");
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
		btnInsertAtPosition.setBounds(620, 222, 201, 21);
		contentPane.add(btnInsertAtPosition);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("POSITION:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1_1_1_1.setBounds(244, 279, 87, 18);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		pos2 = new JTextField();
		pos2.setColumns(10);
		pos2.setBounds(352, 277, 83, 19);
		contentPane.add(pos2);
		
		JButton btnDeleteAtPosition = new JButton("DELETE AT POSITION");
		btnDeleteAtPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Node temp=null;
				int count = 0;
				int pos = Integer.valueOf(pos2.getText());
				if(first == null)
				{
				JOptionPane.showMessageDialog(contentPane,"Doubly Linked List doesn't exist");
				pos2.setText(""); 
				return; 
				} 
				else if(pos == 0 && first.nextlink == null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+first.data+" "+"at the postion of"+" "+pos);
				pos2.setText("");
				first=null;
				return;
				}
				else if(pos == 0 && first.nextlink != null)
				{ 
				temp=first;
				JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.data+" "+"at the postion of"+" "+pos);
				pos2.setText("");
				first=temp.nextlink;
				first.prelink=null;
				temp=null;
				return;
				} 
				else
				{
					temp=first;
					while(temp.nextlink!=null)

				{ 
						temp=temp.nextlink;
						count++; 
						if(temp.nextlink!=null && pos == count)
				{

				JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.data+" "+"at the postion of"+" "+pos);
				pos2.setText("");

				temp.prelink.nextlink=temp.nextlink;
				temp.nextlink.prelink=temp.prelink; 
				return;
				}
				if(temp.nextlink==null && pos==count)
				{
				JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+temp.data+" "+"at the postion of"+" "+pos);
				pos2.setText("");
				temp.prelink.nextlink=null; return;
				}
				}
				}
				JOptionPane.showMessageDialog(contentPane,"Invalid position");
				pos2.setText("");
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
		btnDeleteAtPosition.setBounds(465, 276, 201, 21);
		contentPane.add(btnDeleteAtPosition);
		
		JButton btnNewButton_1_1 = new JButton("ABOUT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop DoublyLinkedList=Desktop.getDesktop();
				try
				{
					DoublyLinkedList.browse(new URI("https://www.javatpoint.com/doubly-linked-list"));
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
		btnNewButton_1_1.setBounds(616, 0, 116, 29);
		contentPane.add(btnNewButton_1_1);
	}
}
