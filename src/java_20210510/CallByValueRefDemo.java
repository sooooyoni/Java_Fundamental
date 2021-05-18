package java_20210510;
//import java.lang.*;이 묵시적으로 된것 => String Math 을 그냥 쓸수 있다
public class CallByValueRefDemo {//extend Object가 묵시적으로
	public static void ascending(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length - (i + 1); j++) {
				if (temp[j] > temp[j + 1]) {
					int temp2 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp2;
				}
			}
		}
	}
	public static void change(int i, int[]j) {
	i=20;
	j[3]=400;
	}
	public static void main(String[] args) {
	int i=0;//int를 초기화했기 때문에 call by value해도 값변화 없다 
	int[] j= {1,2,3,4};//레퍼런스는 참조하는것이기 때문에 값변화 있다
	System.out.println(i+","+j[3]);
	change(i,j);
	System.out.println(i+","+j[3]);
	
	int[] lotto= {3,5,12,45,23,1}; //temp와 lotto가 같기때문에 return할 필요 없고 void쓰면 됨
	ascending(lotto);
	for(int value : lotto) {
		System.out.print(value+"\t");
	}
	

}
}