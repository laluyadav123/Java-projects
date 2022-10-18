package thread;

public class MainThread extends Thread{

	public static void main(String[] args) {
		 
		  
		EvenNumberThread ent = new EvenNumberThread();
		ent.start();
		OddNumberThread oet  = new OddNumberThread();
		oet.start();
		
		System.out.println(" \tThread running" +MainThread.activeCount() + Thread.currentThread().getName());

	}

}
