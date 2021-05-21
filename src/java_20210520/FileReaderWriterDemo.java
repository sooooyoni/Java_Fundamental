package java_20210520;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr =new FileReader(
					"C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			
			
			fw = new FileWriter(
					"C:\\dev\\test\\2021\\05\\18\\FileDemo-copy.java",true);//true 파일에 이어쓰기ㅜ
			/*
			int readChar  = 0;
			//read() : 한개의 문자 읽는다
			while((readChar=fr.read())!=-1){
			System.out.print((char)readChar);	
			//write() :한개의 문자를 쓴다.	
			fw.write(readChar);
			}
			*/
			
			int readCharCount = 0;
			char[] readChars=new char[1024*10];
			while((readCharCount = fr.read(readChars))!=-1) {
				System.out.print(readChars);
								//fw.write(readChars);로 끝내버리면 나머지 데이터 그냥 출력해서 원본과 다르게 출력!!!!!!!
				fw.write(readChars,0,readCharCount);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
			try {
				if(fr!=null) fr.close();
				if(fw!=null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
