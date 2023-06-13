package kh.lclass.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Swing103 extends JFrame{
	public Swing103() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		
		btn.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else 
					b.setText("Action");
				setTitle(b.getText());
					
			}
		});
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing103();
	}
}
