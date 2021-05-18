package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	//insert할떄 저장공간을 arraylist로 할거다
	//return하는 list
	private ArrayList list;
	public MemberManager(){
		
	 list = new ArrayList();
		
	}
	
	public void insert(String id, String name, int age) {
		list.add(new Member(id,name,age));
		
	}

	public void delete(String id) {
		for (int i = 0; i < list.size(); i++) {
					Member m =(Member)list.get(i);
		if(id.equals(m.getId())) {
			list.remove(i);
			break;
		}
		}
	}
	public void update(String id, String name, int age) {
		for (int i = 0; i < list.size(); i++) {
			Member m2 =(Member)list.get(i);
			if(id.equals(m2.getId())) {
				//list.remove(i);
				//list.add(i, new Member(id,name,age));
			m2.setAge(age);
				break;
			}
		}
		
	}
	public  ArrayList select() {
		return list;
		
	}
	public Member select(String id) {
		Member member=	null;
		for (int i = 0; i < list.size(); i++) {
			Member m =(Member)list.get(i);
			if(id.equals(m.getId())) {
				member = m;
				break;
			}
		}
		return member;
	}
}
