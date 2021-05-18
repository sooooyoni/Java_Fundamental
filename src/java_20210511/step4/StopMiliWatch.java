package java_20210511.step4;

public class StopMiliWatch {
	long startTime;
	long endTime;
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		startTime = System.currentTimeMillis();
	}
	public double getElaspedTime() {
		return (double)(endTime- startTime)/1000;
	}
}
