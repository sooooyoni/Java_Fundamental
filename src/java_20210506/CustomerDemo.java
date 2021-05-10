package java_20210506;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name="이수연";
		c1.age=20;
		c1.email="test1@naver.com,";
		c1.phone="010-1110-1111";
		c1.balance=1_000_000;
		c1.released=false;
		//클래스변수(static)변수는 클래스 이름으로 접근하는것이 관례
		//변수로도 접근하나 권장하지 않음c1.interestRate이 아닌 Customer.interestRate<= static!!
		Customer.interestRate=6.2;
		//Customer.BANKNAME="국민은행";
		
		System.out.printf("%s, %d, %s, %s, %f, %s %n",c1.name,c1.age,c1.email,c1.phone,c1.balance,c1.released);

		Customer c2 = new Customer();
		c2.name="김영희";
		c2.age=20;
		c2.email="test@naver.com,";
		c2.phone="010-000-0000";
		c2.balance=1_000_000_000;
		c2.released=false;
		System.out.printf("%s, %d, %s, %s, %f, %s %n",c2.name,c2.age,c2.email,c2.phone,c2.balance,c2.released);
		
		Customer c3 = c2;
		c3.name="김영희1";
		
		System.out.printf("%s,%s %n", c2.name, c3.name);
		System.out.printf("%f",Customer.interestRate);
		
	}
}
