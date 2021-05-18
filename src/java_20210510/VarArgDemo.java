package java_20210510;

public class VarArgDemo {
		public long sum(int...temp) {
			long sum = 0;
			for (int i=0; i<temp.length; i++) {
				sum += temp[1];//배열의 두번자리 배열의 개수만큼 더해짐  
				
			}
			return sum;
		
		}
		public static void main(String[] args) {
			VarArgDemo v= new VarArgDemo();
			long s1= v.sum(0,1);//배열로 인식해라!!{}안써도 배열림
			System.out.println(s1);
			s1= v.sum(0,100,1,10000,2);
			System.out.println(s1);
		}

}