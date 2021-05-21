package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos = null;
		try{
			fis =new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-jee-.zip");
			//매개변수 psth의 디렉토리가 존재하지 않으면 예외발생
			//예외가 발생하지 않고 객체가 생성되면 파일을 생성한다.
			//이때무조건 빈파일을 생성함
			fis =new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-jee-copy.zip");
			/*int readByte=0;		
			long start = System.currentTimeMillis();
			//read()는 1바이트 읽어서 읽은바이트를 반환한다
			while((readByte = fis.read())!=-1) {
				//write()는 1바이트 쓰기를 한다.
				fos.write(readByte);
			}long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d초 %n", (end-start));
			*/
			
			int readByteCount=0;
			byte[] readBytes= new byte[1024*10];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes))!=-1) {
									//10240개의 배열을 돌리고 남은 나머지를 구하기위해
				fos.write(readBytes, 0 ,readByteCount);
			}long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d초 %n", (end-start));
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
		if(fis !=null) fis.close();
		if(fos !=null) fos.close();
		}catch(IOException e) { e.printStackTrace(); }
			}
	}
}