package java_20210511.step5;

public class StopMiliWatch extends StopWatch{

	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		startTime = System.currentTimeMillis();
	}
	public double getElaspedTime() {
		return (double)(startTime- endTime)/1000;
	}
public void execute() {
	start();
	for(long i=0;i<300_000_000l;i++) {}
	stop();
	double elapsedTime = getElaspedTime();
	System.out.printf("경과시간 : %,.3f",elapsedTime);
}
}
