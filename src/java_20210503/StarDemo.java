package java_20210503;

public class StarDemo {
		public static  void main(String[] args) {
			for(int i=1; i<=5;i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			System.out.println();
						
			}
			
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
