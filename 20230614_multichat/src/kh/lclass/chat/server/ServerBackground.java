package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import kh.lclass.chat.client.ClientGUI;

public class ServerBackground {
	private ServerSocket ss;
	private ServerGUI gui;

	// client 여러명 관리 : key:nickname, value: OutputStream객체
	private Map<String, BufferedWriter> mapClients = new HashMap<String, BufferedWriter>();
	// map.put("socket", socket);
	// map.put("nickname", "colin");
	// mapList.add(map);

	// map.put("colin", socket);

	private Socket socket;

	private int count; // current participants

	// 서버생성 및 설정
	public void setting() {
		try {
			ss = new ServerSocket(7777);
			// 방문자 접속을 계속 받아들임. 무한반복.
			while (true) {
				// 접속자 대기 중
				socket = ss.accept();

				new Client(socket).start();
				;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// show info when clients access
	public void addClient(String nickname) {
		gui.appendMsg(nickname + " ㅋㅋ..ㅎㅇ~\n");

	}

	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}

	public void sendMessage(String msg) {
		// clients 모두에게 msg 전달
		Set<String> keys = mapClients.keySet();
		for (String key : keys) {
			try {
			BufferedWriter wr = mapClients.get(key);
				wr.write(msg+"\n");
				wr.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	///////////////// inner class////////////////////
	class Client extends Thread {
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickname;

		public Client(Socket socket) {

			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				// 클라이언트 닉네임이 바로 이어서 들어옴.
				String nickname = br.readLine();
				//서버 화면에 디스플레이
				addClient(nickname);
				//클라이언트 아웃풋스트림 관리 맵에 추가
				mapClients.put(nickname, bw);
				//클라이언트 맵 모둥에게 접속 정보 전달
				sendMessage(nickname+"ㅋㅋ..ㅎㅇ!\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			// 각 클라이언트마다 전송되어 오는 메세지 확인하고 출력.
			// 클라이언트와 입력 통로가 끊어지지 않았다면 반복확인
			// 클라이언트에서 받은 메세지
			while (br != null) {
				try {
					String msg = br.readLine();
					gui.appendMsg(msg);
					//클라이언트 맵 모두에게 접속 정보 전달
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
