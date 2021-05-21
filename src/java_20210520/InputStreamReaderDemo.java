package java_20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		/*
		InputStream in =System.in;//source가 키보드인 경우
		byte[] b = new byte[100];

		int readByteCount = 0;
		System.out.print("입력하세요>");
		while((readByteCount = in.read(b))!=-1) {
		String message =new String(b,0,readByteCount);
		if(message != null&&message.trim().equals("quit")) break;//개행이 포함되어있어 문자length가 +2가 됨 trim을 사용하여 공백제거해야 equals성립
		System.out.print(message); //\r\n이 포함되어 있음 println할 필요없다
		System.out.print("입력하세요>");
		}
		*/
		
		InputStream in =System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine= null;
		System.out.print("입력하세요>");
		while((readLine= br.readLine())!=null) {
			if(readLine!=null&&readLine.equals("quit")) break;
			System.out.println(readLine);//개행 포함안됨
			System.out.print("입력하세요>");
		}
		
	}
}
	