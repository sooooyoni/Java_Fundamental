package java_20210503;

public class BreakDemo {

	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;
			sum+=i;
			
		}
	System.out.println("합 : "+sum);
	



outter :
	for(int i=2; i<=9; i++) {
		inner :
			for(int j=1; j<=9;j++) {
				if(i==4&&j==8) break outter;//inner이면 5678단 있다. 어디에 있냐에 따라 달라짐
				
				System.out.printf("%d*%d=%d %n",i,j,i*j);
			}
	}
}
	}