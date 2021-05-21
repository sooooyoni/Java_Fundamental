package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintSreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis=null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos=null;
		 
		PrintStream ps=null;  //파일
		PrintStream ps1=null; //모니터

		ps1 = System.out;
		ps1.println("Hello");
		ps1.println("안녕");
		
		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bis = new BufferedInputStream(fis);//Stream chaining
			
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy.zip");
			bos = new BufferedOutputStream(fos); //Stream chaining
			
			//PrintStrem
			//1. PrintStream의 메서드는 IOException을 발새하지 않는다.
			//2.auto flush 기능을 가짐.=>true
									//auto-flushing
			ps = new PrintStream(bos,true); //Stream chaining
			
			int readByte = 0;
			while((readByte=bis.read())!=-1) {
				ps.write(readByte);
			}
			//ps.flush(); true로 오토프러싱
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null);
				try {
					fis.close();
					if(bis!=null) bis.close();

					if(fos!=null) fos.close();
					if(ps!=null) ps.close();
					if(bos!=null) bos.close();
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	}
}
