package kh.lclass.chat.client;

import javax.swing.JOptionPane;

public class ClientRun {
	public static void main(String[] args) {
		//사용자 닉네임을 gui 통해 입력받음
		String nickname =JOptionPane.showInputDialog("닉네임 입력");
		new ClientGUI(nickname); // 객체생성 --> 생성자에 화면 초기화 + event  등록
		
	}
}
