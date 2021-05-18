package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
	
		for (int i = 0; i < list.size(); i++) {
			//generic으로 선언되어 list 앞에 (String)필요없다.
			String value = list.get(i);			
			System.out.println(value);
		}
		//generic선언으로 inhence for문 가능
		for (String value :list) {
			System.out.println(value);
			
		}
	}
}
