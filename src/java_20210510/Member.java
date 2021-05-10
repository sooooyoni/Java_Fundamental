package java_20210510;

public class Member {
	private String name;
	private String email;
	private String zipcode; 
	private String adrr1;
	private String adrr2;
	private int age;
//단축키:오른쪽클릭 =>source=>generate setter/getter or alt+shift+s =>r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAdrr1() {
		return adrr1;
	}
	public void setAdrr1(String adrr1) {
		this.adrr1 = adrr1;
	}
	public String getAdrr2() {
		return adrr2;
	}
	public void setAdrr2(String adrr2) {
		this.adrr2 = adrr2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
