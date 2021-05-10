package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
		// Math.random()=>0보다 크거나 같고 1보다 작은 임의의 double반환
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			// 1보다 크고 45보다 작은 임의의 int 반환
			int random = (int) (Math.random() * 45) + 1;
			lotto[i] = random;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");

		
		}
		
		int[] lotto1 = new int[6];
		for (int k = 0; k < lotto1.length; k++) {
		int random1 = (int) (Math.random() * 45) + 1;
		boolean isExisted = false;
		for (int j = 0; j < k; j++) {
			if(random1==lotto1[j]) {
				isExisted = true;
				break;
			}
		}if(isExisted) {
			k--;
			}else{
		lotto1[k] = random1;
	}
	
		System.out.print(lotto1[k] + "\t");
	}
	}
}


