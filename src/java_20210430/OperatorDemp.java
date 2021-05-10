package java_20210430;

public class OperatorDemp {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = 0;
		double d= 0.0;
	
	c = a + b;	
	System.out.println(c);
	c = b / a;
    System.out.println(c);
    c = b % a;
    System.out.println(c);
	d = (double)b / a;
    System.out.println(d);
    
    if(a%2==0) {
    	System.out.println("짝수입니다.");
    }else {
    	System.out.println("홀수입니다.");
    
    }
	
	//복합대입 연산자
	a += b; //a = a + b
	System.out.println(a);
	
	int sum= 0;
	for(int i=1; i<=100;i++) { //++증가연산자
		sum+=i;
	}
	System.out.println(sum);
	//증감 연산자
	
	a = 0;
	b = 10;
	a++;
	++b;
	System.out.println(a);
	System.out.println(b);
	
	
	//대입후 증가
	a=10;//a를 10으로 초기화한다
	c = a++;
	System.out.println(c);
	//증가후 대입
	a=10;
	c = ++a;
	System.out.println(c);
	
	a = 10;
	b = 20;
	
	boolean isSuccess = a > b;
	System.out.println(isSuccess);
	
	if(a>b) {
		System.out.println("a가 b보다 크다.");
	}else {	System.out.println("a가 b보다 작다.");

	}
	d = 10.0;
	isSuccess = a==d;
	System.out.println(isSuccess);
	
	//논리연산자 
	//&&는 A가 F이기때문에 short circuit B는 계산하지 않음 
	a = 10;
	b = 20;
	isSuccess = (a == b) && (++a == b++);
	System.out.println(isSuccess);
	System.out.println(a);
	System.out.println(b);
	
	//||는 or이니까 A가 F이더라도 뒷 명제B도 계산해본다
	//||는 A가 T이면 short circuit 발생
	a = 10;
	b = 20;
	isSuccess = (a == b) || (++a == b++);
	System.out.println(isSuccess);
	System.out.println(a);
	System.out.println(b);
	

	}
	
}
