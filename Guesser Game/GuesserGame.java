package guessergame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class GuesserGame extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	int pn1;
	int pn2;
	int pn3;
	int cn;
	String msg="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuesserGame frame = new GuesserGame();
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
	public GuesserGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1037, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuesserGame = new JLabel("GUESSER GAME");
		lblGuesserGame.setForeground(new Color(255, 0, 128));
		lblGuesserGame.setFont(new Font("Dialog", Font.BOLD, 22));
		lblGuesserGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuesserGame.setBounds(365, 10, 238, 51);
		contentPane.add(lblGuesserGame);
		
		JLabel lblPlayer = new JLabel("PLAYER1");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPlayer.setForeground(Color.BLUE);
		lblPlayer.setBounds(21, 287, 96, 29);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_2 = new JLabel("PLAYER2");
		lblPlayer_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_2.setForeground(Color.BLUE);
		lblPlayer_2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPlayer_2.setBounds(334, 288, 102, 26);
		contentPane.add(lblPlayer_2);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER3");
		lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1.setForeground(Color.BLUE);
		lblPlayer_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPlayer_1.setBounds(695, 290, 102, 29);
		contentPane.add(lblPlayer_1);
		
		JLabel lblComputer = new JLabel("COMPUTER");
		lblComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblComputer.setForeground(Color.BLUE);
		lblComputer.setFont(new Font("Dialog", Font.BOLD, 17));
		lblComputer.setBounds(62, 546, 102, 23);
		contentPane.add(lblComputer);
		
		t1 = new JTextField();
		t1.setBounds(120, 295, 155, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(448, 295, 155, 20);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(799, 295, 115, 20);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(383, 407, 155, 20);
		contentPane.add(t4);
		
		JButton generate = new JButton("GENERATE");
		generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CODE HERE
				pn1=Integer.valueOf(t1.getText());
				pn2=Integer.valueOf(t2.getText());
				pn3=Integer.valueOf(t3.getText());
				Random rand = new Random();
				cn = rand.nextInt(10);
				t4.setText(String.valueOf(cn));
				
			
				
			}
		});
		generate.setFont(new Font("Sitka Text", Font.BOLD, 14));
		generate.setForeground(new Color(64, 0, 0));
		generate.setBackground(Color.RED);
		generate.setBounds(231, 404, 138, 29);
		contentPane.add(generate);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(781, 501, 155, 26);
		contentPane.add(t5);
		
		JButton result = new JButton("RESULT");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Result code here
				int res=compare(pn1,pn2,pn3,cn);
				if (res==1)
				{
					msg="PLAYER 1 WINS";
					t5.setText(msg);
				}
				if (res==2)
				{
					msg="PLAYER 2 WINS";
					t5.setText(msg);
				}
				if (res==3)
				{
					msg="PLAYER 3 WINS";
					t5.setText(msg);
				}
				if (res==-1)
				{
					msg="COMPUTER WINS";
					t5.setText(msg);
				}
				
			}
		});
		result.setFont(new Font("Sitka Text", Font.BOLD, 14));
		result.setBackground(new Color(204, 51, 0));
		result.setForeground(new Color(64, 0, 0));
		result.setBounds(631, 496, 120, 39);
		contentPane.add(result);
		
		JLabel label1 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/player1.png")).getImage();
		label1.setIcon(new ImageIcon(img));
		label1.setBounds(21, 83, 254, 176);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/player2.png")).getImage();
		label2.setIcon(new ImageIcon(img1));
		label2.setBounds(352, 83, 266, 176);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(707, 83, 213, 176);
		Image img11=new ImageIcon(this.getClass().getResource("/player333.png")).getImage();
		label3.setIcon(new ImageIcon(img11));
		contentPane.add(label3);
		
		JLabel label1_1 = new JLabel("");
		label1_1.setBounds(21, 360, 190, 176);
		Image img111=new ImageIcon(this.getClass().getResource("/computer.png")).getImage();
		label1_1.setIcon(new ImageIcon(img111));
		contentPane.add(label1_1);
		
		

	}
	public int compare(int t1,int t2,int t3,int t4)
	{
		int res=0;
		if(cn ==t1) {
			return 1;
		}
		else if(cn ==t2) {
			return 2;
		}
		else if(cn ==t3) {
			return 3;
		}
		else {
			return -1;
		}
	}
}
