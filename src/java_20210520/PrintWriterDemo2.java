package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2 {
		public static void main(String[] args) {
			FileReader fr=null;
			BufferedReader br=null;
		
			FileWriter fw=null;
			BufferedWriter bw=null;
			PrintWriter pw = null;
			
			
			try {
				fr =new FileReader(
						"C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
				br = new BufferedReader(fr);
				fw = new FileWriter(
						"C:\\dev\\test\\2021\\05\\18\\FileDemo-copy2.java",true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw,true); //true=>auto flush
				String readLine=null;
						//한줄을 읽고 한줄을 쓰는것
				while((readLine = br.readLine())!=null) {
					//개행이 없으니까ln으로 출력
					System.out.println(readLine);
					pw.write(readLine);//readLine 변수에는 개행을 포함 X
					//bw.newLine(); //개행을 넣어준다 System.out.println(); 해도 무방(Window-\r\n Unix-\n)
					
				}
				//bw.flush();auto flush된다 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
					try {
						if(fr!=null) fr.close();
						if(br!=null) br.close();
						
						if(fw!=null) fw.close();
						if(pw!=null) pw.close();
						if(bw!=null) bw.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
}
}
