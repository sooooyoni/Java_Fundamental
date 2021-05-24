package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	public EchoServer(int port) {
		this.port = port;
	}
	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw= null; 
		
		try {
			//1.ServerSocket인스턴스 생성
			//예외발생하므로 try catch로 묶는다
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		System.out.println("[서버화면 입니다.]");
		while(true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			try {
				//2. 클라이언트 접속을 기다린다.
				//accept() : 클라이언트 접속을 기다리다 클라이언트가 접속하면
				//클라이언트와 통신할 수 있는 Socket 객체를 생성해준다.
				Socket socket = serverSocket.accept();
				//4.클라이언트 통신할 수 있는 socket객체가 생성된다.
				//ip를 관리하는 어드레스
				InetAddress i = socket.getInetAddress();
				System.out.println("클라이언트가 접속했습니다.["+i.getHostAddress()+"]");
				//5.socket을 이용해서 클라이언트와 통신할 구 있는 입출력 스티림 생성
				//6-2
				InputStream in=  socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				//6-3		
				OutputStream out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				
				
				while(true) {
					String readLine = br.readLine();
					System.out.println("클라이언트 메세지 : "+readLine);
					bw.write(readLine);
					bw.newLine();
					bw.flush();					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		/*
		EchoServer echoServer =new EchoServer(3000);
		echoServer.run();
		밑이랑 같은 표현이다 두번이상 쓸때 써라!! 한번만 사용은 밑에처럼!*/
		new EchoServer(3000).run();
	}
}
