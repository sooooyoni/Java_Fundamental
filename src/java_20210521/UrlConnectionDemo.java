package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
		public static void main(String[] args) throws IOException {
			URL url = new URL ("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0005364900");
			URLConnection urlCon = url.openConnection();
			String cacheControl =urlCon.getHeaderField("cache-control");
			String cacheType= urlCon.getHeaderField("cache-type");
			String date = urlCon.getHeaderField("date");
		
			System.out.println("cache-control:"+cacheControl);
			System.out.println("cache-type:"+cacheType);
			System.out.println("date:"+date);
			
			InputStream in =urlCon.getInputStream();
			InputStreamReader isr =new InputStreamReader(in,"euc-kr");
			BufferedReader br = new BufferedReader(isr);
			String readLine =  null;
			while((readLine = br.readLine())!=null) {
				System.out.println(readLine);
		}
}
}
