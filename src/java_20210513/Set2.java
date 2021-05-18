package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class Set2 {
 public static void main(String[] args) {
	TreeSet lottoSet=new TreeSet();
	
	while(true) {
		int random=(int)(Math.random()*45)+1;//+1은 0부터 시작.
		lottoSet.add(random);
		if(lottoSet.size()==6) break;
	}
	Iterator i =lottoSet.iterator();
	
	while(i.hasNext()) {
		Integer temp = (Integer)i.next();
		System.out.print(temp+"\t");
	}
	
	
	
	
	
	
	
}
}
