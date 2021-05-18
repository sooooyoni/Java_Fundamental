package java_20210514;

public class Member {
	
	private String id;
	private String name;
	private int age;
	
	//1.default 생성자!!!!!! 
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	//2.생성자 형성
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	//3.setter, getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
}
