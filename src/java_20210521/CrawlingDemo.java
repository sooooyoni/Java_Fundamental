package java_20210521;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
		public static void main(String[] args) {
			String url = "https://coinmarketcap.com/currencies/ethereum/historical-data/";
			//html문서를 관리하기 위한 객체
			Document doc = null;
			
			try {
				doc=Jsoup.connect(url).get();
				System.out.println("성공");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Elements elements = doc.select(".notice-list");
			for(Element element : elements) {
			System.out.println(element.text());
		}

		}
}
