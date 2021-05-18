package java_20210514;

import java.util.ArrayList;
class Product{
	private int number;
	private String name;
	private double price;
	//alt+shift+s=>o 자동생성
	Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	//alt+shift+s=>setter getter자동생성
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
public class ListDemo {
	//static을 안하면 인스턴스 만들어서 호춣해야하니까
	public static Product selectByNumber() {
		//객체를 return 많이 할거임 3개를 return하고 싶어서 객체화해서(Product) return 
		/*Product pro = new Product(1, "신발", 100000);
		return pro;*/
		return new Product(1, "신발", 100000);//(~~~);로 합쳐도 된다 (단, 선언후 다시 사용 할일 없다면)
		
	}
	public static ArrayList select() {
		//Product와 같은 상품을 여러개 return하고 싶으면 list를 만들어서 return
		ArrayList list = new ArrayList();
		list.add(new Product(2,"라면",1000));
		list.add(new Product(3,"계란",5000));
		list.add(new Product(4,"우유",1000));
		list.add(new Product(5,"요플레",1000));

		return list; 
	}
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		//선언
		ArrayList list = new ArrayList();
		//할당
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");
		//출력
		for(int i=0;i<list.size();i++) {
		String temp =(String)list.get(i);
		System.out.println(temp);
	}
		Product pro = selectByNumber();
		System.out.printf("%d ,%s, %f %n", pro.getNumber(),pro.getName(), pro.getPrice());
		
		ArrayList list2 = select();
		for (int i = 0; i < list2.size(); i++) {
			Product p = (Product)list2.get(i);
			System.out.printf("%d, %s, %f %n", p.getNumber(), p.getName(), p.getPrice());
			
		}
		}

}
