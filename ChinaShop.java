package day05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChinaShop {
	static String[] menu= {"짜장","짬뽕","우동"};
	static int[] price= {7000,8000,5000};
	static ImageIcon[] images= {
			new ImageIcon("src/day05/짜장.png"),
			new ImageIcon("src/day05/짬뽕.png"),
			new ImageIcon("src/day05/우동.png")
	};
	static int total=0;
	static int count=0;
	public static void main(String[] args) {
		JFrame f=new JFrame(":::홍콩반점:::");
		f.setSize(600,500);
		f.setLocation(100,100);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btn2 = new JButton("짬뽕");


		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("굴림", Font.BOLD, 30));
		btn2.setBorderPainted(false);
		btn2.setOpaque(true);
		
		btn2.setBackground(Color.RED);
		btn2.setBounds(137, 10, 114, 57);
		panel.add(btn2);
		
		JLabel lb1 = new JLabel("개수 : 0개");
		lb1.setFont(new Font("굴림", Font.BOLD, 30));
		lb1.setBounds(395, 10, 177, 57);
		panel.add(lb1);
		
		JButton btn1 = new JButton("짜장");

		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		btn1.setFont(new Font("굴림", Font.BOLD, 30));
		btn1.setBorderPainted(false);
		btn1.setBounds(12, 10, 114, 57);
		panel.add(btn1);
		
		JButton btn3 = new JButton("우동");

		btn3.setForeground(Color.DARK_GRAY);
		btn3.setFont(new Font("굴림", Font.BOLD, 30));
		btn3.setBackground(new Color(244, 164, 96));
		btn3.setBounds(263, 10, 114, 57);
		btn3.setBorderPainted(false);
		panel.add(btn3);
		
		JLabel lb3 = new JLabel("결제금액");
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		lb3.setFont(new Font("굴림", Font.BOLD, 30));
		lb3.setBounds(104, 372, 377, 57);
		panel.add(lb3);
		
		JLabel lb2 = new JLabel("");
		lb2.setIcon(new ImageIcon(ChinaShop.class.getResource("/day05/중국집.png")));
		
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setVerticalAlignment(SwingConstants.BOTTOM);
		lb2.setFont(new Font("굴림", Font.BOLD, 30));
		lb2.setBounds(12, 91, 560, 257);
		panel.add(lb2);
		f.setVisible(true);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lb2.setIcon(images[0]);
			
			count++;
			lb1.setText("개수 : "+count+"개");
			total+=price[0];
			lb3.setText("총 결제금액 : "+total+"원");
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb2.setIcon(images[1]);

				count++;
				lb1.setText("개수 : "+count+"개");
				
				total+=price[1];
				lb3.setText("총 결제금액 : "+total+"원");
			}
		});
		
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lb2.setIcon(images[2]);

					count++;
					lb1.setText("개수 : "+count+"개");
					
					total+=price[2];
					lb3.setText("총 결제금액 : "+total+"원");
				}
			});
		
		
		
		
		
		
		

	}
}
