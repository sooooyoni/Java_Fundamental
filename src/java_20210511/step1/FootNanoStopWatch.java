package java_20210511.step1;

public class FootNanoStopWatch {
	long startTime;
	long endTime;
	public double getElaspedTime() {
		return (double)(endTime- startTime)/100000000;
	}
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		//1970년 1월1일부터 현재까지의 시간을 밀리세컨드로 반환
		f.startTime = System.nanoTime();

		
		for(long i=0;i<300_000_000l;i++) {
			
		}
		f.endTime = System.nanoTime();
		double elapsedTime = f.getElaspedTime();
		System.out.printf("경과시간 : %,.3f",elapsedTime);
	}
}
