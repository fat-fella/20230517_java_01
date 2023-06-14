package kh.lclass.chat.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientBackground {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private String nickname;
	private ClientGUI gui;

	// 클라이언트가 서버와 접속 끊기
	public void disconnection() {
		try {
			if (socket != null) {
				socket.close();
			}
		} catch (Exception e) {
		}
	}

	// client가 서버에 접속
	public void connection() {
		try {
			// 서버와 연결
			socket = new Socket("127.0.0.1", 7777);
			// 서봐와 입출력 통로 생성
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			bw.write(nickname + "\n");
			bw.flush();

			// 서버와 입력통로가 끊어지지 않았다면 계속 반복확인함.
			// 서버에서 받은 msg
			while (br != null) {
				String msg = br.readLine();
				gui.appendMsg(msg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg) {
		// 서버에 메세지 전달
		try {
			bw.write(msg + "\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setGui(ClientGUI gui) {
		this.gui = gui;
	}
}
