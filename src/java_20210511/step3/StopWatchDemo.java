package java_20210511.step3;

public class StopWatchDemo {
	
	 public static void main(String[] args) {   //main에는 실행만 있어야한다
			StopMiliWatch s =new StopMiliWatch();
			s.start();
			for(long i=0;i<300_000_000l;i++) {
				
			}
			s.stop();
			double elapsedTime = s.getElaspedTime();
			System.out.printf("경과시간 : %,.3f",elapsedTime);
		}
}
