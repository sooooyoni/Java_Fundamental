package java_20210511.step2;

public class StopWatch {
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
	long startNanoTime;
	long endNanoTime;
	public void startNano() {
		startTime = System.nanoTime();
	}
	public void stopNano() {
		startTime = System.nanoTime();
	}
	public double getElaspedNanoTime() {
		return (double)(endNanoTime- startNanoTime)/100000000;
	}
}
