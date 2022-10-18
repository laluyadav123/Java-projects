package thread;

public class OddNumberThread extends Thread {
	public void run() {
		int number=10;  
		System.out.print(" \n odd numbers from 1 to "+number+": ");  
		for (int i=1; i<=number; i++)   
		{  
	
		if (i%2!=0)   
		{  
		System.out.print(i + " ");  
		}  
		}  
		System.out.println(" \tThread running" +MainThread.activeCount() + Thread.currentThread().getName());
		}  
	


}
