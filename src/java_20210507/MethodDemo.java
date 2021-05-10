package java_20210507;

public class MethodDemo {
	//달력 출력
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear =  isLeafYear(year);//밑에서 호출
		if(isLeafYear)
		{
			monthArray[1] = 29;
		for (int i = 1; i <=monthArray[month-1]; i++) {
		System.out.print(i+"\t");
		if(i%7==0) System.out.println();
		
		}
		}
	}

		
		
	public int[] ascending(int[] array) {

				//오른차순정렬
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length-(i+1); j++) {
						if(array[j]>array[j+1]) {//부등호 방향 < 이면 내림 차순
							int temp=array[j];
							array[j]=array[j+1];//1을 0에 저장하고
							array[j+1]=temp;//0을 1에 저장
			}
					}
				}
				return array;
			}
		public boolean isLeafYear(int year) {
			return year%4==0 && year%100!=0 || year%400==0;
		}

		public int plus(int first, int second) {//firt, second => 매개변수(parameter)
			return first+second;//int안에서만 덥셈가능 
		}
		public static void main(String[] args) {
			MethodDemo m= new MethodDemo();
			int sum =m.plus(10, 20);
			System.out.printf("%d %n", sum);
	
			boolean isLeafYear = m.isLeafYear(2000);
			System.out.printf("%s %n", isLeafYear);
			
			int [] test = {10,20,1,30,4,89,100,25};
			int [] afterTest = m.ascending(test);
			for (int i = 0; i < afterTest.length; i++) {
				System.out.printf(afterTest[i]+"\t");
				
			}
		

			System.out.println();
			m.print(2020,2);//반환값이 없는 void는 호출만 해주면됨
			
		}

}
