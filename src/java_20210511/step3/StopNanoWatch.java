package java_20210511.step3;

public class StopNanoWatch {
	long startTime;
	long endTime;
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		startTime = System.nanoTime();
	}
	public double getElaspedTime() {
		return (double)(endTime- startTime)/100000000;
	}
}
