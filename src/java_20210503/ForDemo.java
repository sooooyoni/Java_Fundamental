package java_20210503;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.", sum);

		// int를 또쓰면 안된다
		sum = 0;
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지의 짝수합은 %d 입니다.", sum);

		for (int first = 2; first < 10; first++) {
			System.out.printf("%d단 입니다.%n", first);
			// 수정
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);

			}

		}

		// 1부터 100까지 소수의 개수

		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if (count == 0) {
				totalCountOfPrimeNumber++;
				System.out.println("\n" + i + "\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);

	}


}