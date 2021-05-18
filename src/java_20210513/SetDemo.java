package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		//HashSet set = new HashSet();
		//TreeSet클래스는 데이터의 중복을 허용하지 않고,
		//natural ordering을 한다
		//TreeSet set = new TreeSet();
		//LinkedHashSet클래스는 데이터 중복허야하지 않고 순서는 FIFO(First in First out)
		LinkedHashSet set= new LinkedHashSet();
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("4");
		set.add("8");
		set.add("12");
		set.add("29");
		set.add("34");
		
		
		
		//set.add("1");//중복허용되지 않으므로 들어가지 않음
		//HashSet을 자체적으로 출력할 방법 없음
		/*Iterator i=set.iterator();
		while(i.hasNext()) {
			Integer temp1=(Integer)i.next();
			System.out.println(temp1);
		}*/
	
		
		
		TreeSet lottoSet = new TreeSet();
		while(true) {
			int random=(int)(Math.random()*45)+1;
			lottoSet.add(random);
			if(lottoSet.size()==6) break;
		}
		Iterator i2= lottoSet.iterator();
		
		
		
		while(i2.hasNext()){
			//hashNext():iterator에 츨력할객체가 존재하는지 판단하는 메서드
			//있으면 True 없으면 False
			Integer temp=(Integer)i2.next();
			System.out.print(temp+"\t");
		}

		
		
		System.out.println();
		StringBuffer s1= new StringBuffer("a");
		StringBuffer s2= new StringBuffer("a");
		
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s1.equals(s2));
		//HashSet 클래스는 데이터의 중복을 판단할 떄 equals()비교해서
		//true가 나오면 데이터가 중복되어있다고 판단하여 데이터를 추가해주지 않음
		HashSet set1= new HashSet();
		set.add(s1);
		set.add(s2);
		System.out.println(set1.size());
		//TreeSet 클래스는 데이터의 중복을 판단할때 CompareTo()로 비교하여
		//0가 나오면 데이터가 중복되었다고 판단하여 데이터를 추가해주지 않음
		
		TreeSet set2=new TreeSet();
		set.add(s1);
		set.add(s2);
		System.out.println(set2.size());
		
	}
		
}
