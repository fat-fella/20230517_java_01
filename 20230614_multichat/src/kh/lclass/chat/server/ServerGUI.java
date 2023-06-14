package kh.lclass.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1
public class ServerGUI extends JFrame implements ActionListener{
	//컴파일 시 인식할 ServerGUI로 객체 고유 ID
	private static final long serialVersionUID = 6085316166659427339L;
	
	private JTextArea jta = new JTextArea(40,25); //채팅창
	private JTextField jtf = new JTextField(25); //글 입력 부분
	private ServerBackground  sb = new ServerBackground();
	
	public ServerGUI() {
		//생성자에서는 초기화( 즉 화면 초기화)
		setBounds(200, 100, 400, 600); //창이 뜨는 위치와 크기
		setTitle("서버창");
		jta.setEditable(false); // 채팅창 입력 안되게 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN,18));
		jta.setBackground(new Color(230, 255, 230));
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		sb.setGui(this);
		sb.setting();
		
	}

	//TODO 새 메시지 받았을 때 호출됨.
	public void appendMsg(String msg) {
		jta.append(msg);
		jta.append("\n");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력창에 글 입력하고 enter 눌렀을 때
		String msg = jtf.getText();
		appendMsg(msg);
		sb.sendMessage(msg);
		jtf.setText(""); //입력창 입력된 글을 초기화
		//TODO client에 전달하기 위해 background에 전달
	}
}
