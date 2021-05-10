package java_20210506;

public class LotteryDemo {

	public static void main(String[] args) {
		//로또 오름차순으로 구하기
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			// 1보다 크고 45보다 작은 임의의 int 반환
			int random = (int) (Math.random() * 45) + 1;
			lotto[i] = random;
		}
		//오른차순정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length-(i+1); j++) {
				if(lotto[j]>lotto[j+1]) {//부등호 방향 < 이면 내림 차순
					int temp=lotto[j];
					lotto[j]=lotto[j+1];//1을 0에 저장하고
					lotto[j+1]=temp;//0을 1에 저장
			}			
		}
	}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
}
	}
}
