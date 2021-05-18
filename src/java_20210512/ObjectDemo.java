package java_20210512;
class Test{
	String name;
	Test(String name){
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
}
public class ObjectDemo {
	public static void main(String[] args) {
		Test t1= new Test("이수연");
		Test t2 =new Test("이수연");
		Test t3=t2;
		System.out.println(t1==t2);
		//위에서 오버라이딩으로 "이수연"으로 같으므로 해쉬코드 같게 만들어서 true나옴!! 
		System.out.println(t1.equals(t2));
		//hashCode같으면 같다 
		System.out.println(t2.equals(t3));
	
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println(t1.toString());
	
	
	}
}
