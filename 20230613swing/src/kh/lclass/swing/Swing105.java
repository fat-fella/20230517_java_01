package kh.lclass.swing;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Swing105 extends JFrame{
	private JLabel la = new JLabel("Hello Nigga");
	public Swing105() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new myMouseListener());
		
		c.setLayout(null);
		la.setSize(500,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	class myMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y  = e.getY();
			la.setLocation(x,y);
		}
	}
	public static void main(String[] args) {
		new Swing105();
	}
}