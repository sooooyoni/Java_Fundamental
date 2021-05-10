package java_20210503;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int i=1;//초기값
		while(i<=10) {//조건
			sum+=i;
			i++;//증감
		}
		
  int first=2;
  while(first<=9) {
	 System.out.printf("%d단 입니다.%n",first);
	int second=1;
	 while(second<=9) {
		 System.out.printf("%d*%d=%d %n", first, second, first*second);
		 second++;
	 }
	 first++;
  }
		  
		 i=2;
		while(i<=9) {
			System.out.printf("%d단 입니다.", i);
	    int j=1;
	    while(j<=9) {
	    	System.out.printf("%d * %d = %d %n",i,j,i*j);
	    	j++;
	    }
	    i++;
		}
		

	}

}
