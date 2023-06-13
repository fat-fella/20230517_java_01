package kh.lclass.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing107 extends JFrame{
	private JLabel la = new JLabel();
	
	public Swing107() {
		setTitle("keycod ex: F1:Green %:Yelllow");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new mykeylistener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	class mykeylistener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode())+" 가 입력됨");
			
			if(e.getKeyChar()=='%')
				getContentPane().setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				getContentPane().setBackground(Color.GREEN);
				
				
		}
	}
	public static void main(String[] args) {
		new Swing107();
	}
	
	
	
}
