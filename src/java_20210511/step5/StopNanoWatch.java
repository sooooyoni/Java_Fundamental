package java_20210511.step5;

public class StopNanoWatch extends StopWatch{

	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		startTime = System.nanoTime();
	}
	public double getElaspedTime() {
		return (double)(endTime- startTime)/100000000;
	}
	
	public void execute() {
		start();
		for(long i=0;i<300_000_000l;i++) {}
		stop();
		double elapsedTime = getElaspedTime();
		System.out.printf("경과시간 : %,.9f",elapsedTime);
	}
	
}
