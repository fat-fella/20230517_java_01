package kh.lclass.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing96 extends JFrame{
	public Swing96() {
		setTitle("Swing Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("HELLO NIGGA");
		la.setLocation(130, 50);
		la.setSize(200,20);
		c.add(la);
		
		for(int i=0;i<=9;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing96();
	}
}
