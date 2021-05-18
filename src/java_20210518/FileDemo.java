package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	//메서드로 만들기 //모든 프로젝에서 쓰려면 클래스로 만들기
	public static String format(File f) {
		//1970년1월1일00:00:00초부터 파일을 수정한 날까지의 시간을 밀리세컨드로 반환한값
		long lastModified=f.lastModified();
		Calendar cal= Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String format = sdf.format(cal.getTime());
		return format;
		
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		if(f1.mkdirs()) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 존재합니다.");
		}
	File f2 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse-jee-.zip");
	long len = f2.length();
	System.out.printf("%,dKB %n",len/1024);
	boolean isFile= f2.isFile();//isDirectory()
	if(isFile) {
		String path = f2.getPath();
		System.out.println(path);
		if(path.endsWith("zip")) {
			System.out.println("압축파일");
		}else if(path.endsWith("txt")) {
			System.out.println("텍스트파일");
		}else if(path.endsWith("java")) {
			System.out.println("자바파일");
		}else {
		System.out.println("디렉토리 입니다.");
		}
	
	System.out.println(format(f2));
	
	}
	
	
	
	
	File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");
	File f4 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse3.zip");
	f3.renameTo(f4);//f3의 파일을 f4로변경
	
	String path = f4.getPath();
	String parent = f4.getParent();
	String name= f4.getName();
			
	System.out.printf("%s, %s, %s %n", path, parent, name);
	f4.delete();
	
	File f5 = new File("C:\\Users\\user\\eclipse-workspace\\java_Fundamental");
	//단순 나열은 f4.list(); 
	File[] files = f5.listFiles(); //배열이니까 File[]  & inhance for문 사용가능
	for (int i = 0; i < files.length; i++) {
		File f= files[i];
		if (f.isDirectory()) {
		 String lastModified = format(f);
		 String fileName = f.getName();
		 System.out.printf(" %s, %s, 파일폴더 %n", fileName, lastModified);
	}else if(f.isFile()) {
			String lastModified = format(f);
			String fileName = f.getName();
			long fileSize = f.length();
			
			System.out.printf(" %s, %s, 파일, %dByte %n", fileName, lastModified, fileSize);
				}	
	}
	
  }
}

