package kh.lclass.chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = -6309558503354317301L;
	private JTextArea jta = new JTextArea(40, 25);
	private JTextField jtf = new JTextField(25);

	private String nickname; // 클라이언트닉네임
	private ClientBackground cb = new ClientBackground();// 채팅socket기능을 담당할 객체

	public ClientGUI(String nickname) {
		this.nickname = nickname;

		// 화면 초기화
		setBounds(200, 100, 400, 600);
		setTitle(nickname + "chat");

		jta.setEditable(false);
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18));
		jta.setBackground(new Color(230, 255, 230));

		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		cb.setNickname(nickname);
		cb.setGui(this);
		cb.connection();
	}

	// TODO
	public void appendMsg(String msg) {
		// jta (채팅창)에 msg를 추가함.
		jta.append(msg);
		jta.append("\n");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력창에 글 입력하고 enterkey 눌렀을 때
		String msg = jtf.getText();
		System.out.println(msg + "\n");
		jtf.setText("");
		// server에 전달하기 위해 client background에 전달
		cb.sendMessage(msg);
	}
}
