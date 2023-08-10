package ThreadTest;

public class ThreadPiMain {
	public static void main(String[] args) {
		Thread p1 = new PiTest();
		Thread p2 = new PiTest();
		Thread p3 = new PiTest();
		Thread p4 = new PiTest();
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		
	}
}
