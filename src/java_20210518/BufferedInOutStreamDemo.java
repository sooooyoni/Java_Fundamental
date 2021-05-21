package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//1.FileInputStream과 FileOutputStream을 이용하여 1Byte읽어 1Byte출력한 예제이고, 결과 경과시간은 43919(밀리세컨즈)(11,756Kb)
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy.zip");
				/* int readByte = 0;
				long start = System.currentTimeMillis();
				while((readByte = fis.read())!=-1) {
					fos.write(readByte);
				}
				long end = System.currentTimeMillis();
				System.out.printf("경과시간 : %d %n", (end-start));
				*/
				/*	
				//2. BufferedInputStream과 BuffereaOutputStream을 이용하여 바이트 읽어서 1바이트 출력한 예제이고
				//경과시간 :317(밀리세컨즈)이다.
				//BufferedOutputStream의 버퍼(byte[])공간에 가득 차있으면 출력한다. 만약 다 채워지지 않으면 출력하지 않음
				//이런 경우 flush() 메서드를 호출하여 모두 출력.
				bis = new BufferedInputStream(fis);
				bos= new BufferedOutputStream(fos);
				int readByte=0;
				long start=System.currentTimeMillis();
				while((readByte=bis.read())!=-1) {
					bos.write(readByte);
				}
				//마지막에 남은거 보내주는 거니까 마지막에 한번만 하면됨
				bos.flush();
				
				long end = System.currentTimeMillis();
				System.out.printf("경과시간 : %d %n",(end-start));*/
				
				int readByteCount = 0;
				byte[] readBytes= new byte[1024*10];			
				long start=System.currentTimeMillis();
				while((readByteCount=fis.read(readBytes))!=-1) {
					fos.write(readBytes,0,readByteCount);
				}
				//마지막에 남은거 보내주는 거니까 마지막에 한번만 하면됨
				//bos.flush();
				
				long end = System.currentTimeMillis();
				System.out.printf("경과시간 : %d %n",(end-start));
				
				
				
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {if(fis!=null) fis.close();
				if(bis!=null) bis.close();
				if(fos!=null ) fos.close();
				if(bos!=null) bos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
