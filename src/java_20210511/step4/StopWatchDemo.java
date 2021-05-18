package java_20210511.step4;

public class StopWatchDemo {
	public static void run(StopMiliWatch s) {
	s.start();
	for(long i=0;i<300_000_000l;i++) {
		
	}
	s.stop();
	double elapsedTime = s.getElaspedTime();
	System.out.printf("경과시간 : %,.3f",elapsedTime);
}
	public static void run(StopNanoWatch s) {
	s.start();
	for(long i=0;i<300_000_000l;i++) {
		
	}
	s.stop();
	double elapsedTime = s.getElaspedTime();
	System.out.printf("경과시간 : %,.9f",elapsedTime);
}
	 public static void main(String[] args) {   	//main에는 실행만 있어야한다
			StopMiliWatch s =new StopMiliWatch();
			run(s);
}
}
