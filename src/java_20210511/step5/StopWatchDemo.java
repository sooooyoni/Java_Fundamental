package java_20210511.step5;

public class StopWatchDemo {
	public static void run(StopWatch s) {
		s.execute();

}
	 public static void main(String[] args) {   	//main에는 실행만 있어야한다
			StopMiliWatch s =new StopMiliWatch();
			run(s);
}
}
