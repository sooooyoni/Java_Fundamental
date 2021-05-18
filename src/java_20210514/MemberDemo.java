package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m =new MemberManager();
		m.insert("aaaa","이수연1",10);
		m.insert("bbbb","이수연2",20);
		m.insert("cccc","이수연3",30);
		m.insert("dddd","이수연4",40);
		
		//select호출
		//m.select();
		//호출해서 arraylist에 뿌려줌
		ArrayList list = m.select();
		for (int i = 0; i < list.size(); i++) {
			Member m1 = (Member)list.get(i);
			System.out.printf("%s %s %d %n", m1.getId(), m1.getName(),m1.getAge());
		}
		System.out.println("===========================");
		m.delete("cccc");
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s %s %d %n", m2.getId(), m2.getName(),m2.getAge());
		}
		System.out.println("===========================");
	
	 
	 m.update("aaa","이수연1",100);
	for (int i = 0; i < list.size(); i++) {
		Member m2 = (Member)list.get(i);
		System.out.printf("%s %s %d %n", m2.getId(), m2.getName(),m2.getAge());
	}
	
	System.out.println("===========================");
	
	Member m3 = m.select("ddd");
	System.out.printf("%s %s %d %n",m3.getId(), m3.getName(),m3.getAge());
	}

}
