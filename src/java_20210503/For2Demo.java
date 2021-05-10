package java_20210503;

public class For2Demo {

	public static void main(String[] args) {
//소수개수 구하기
		//소수개수 구하는데 사용한 횟수
		//i를 j로 나누었을때 나머지가 0인게 있으면 소수가 아니다 
		
		int totalPrimeNumber=0;
		int totalCountNumber=0;
		
		for (int i = 2; i < 100; i++) {
			int count=0;
			for (int j = 2; j*j<=i ; j++) {
				if(i%j==0) {
					count++;
				}
				totalCountNumber++;
			}			
			if(count==0) {
				totalPrimeNumber++;
				System.out.println(i+"는 소수입니다.");
				
			}
			totalCountNumber++;
		}
			System.out.println(totalPrimeNumber);
			System.out.println(totalCountNumber);
			
	
	}


}
