package a.b.c;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadTest {

	public static void main(String[] args) {
		Executor executor = Executors.newCachedThreadPool();
	      executor.execute(new Task());
	      ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
	      pool.shutdown();

	}

	
	static class Task implements Runnable {
	      
	      public void run() {
	         
	         try {
	            Long duration = (long) (Math.random() * 5);
	            System.out.println("Running Task!");
	            TimeUnit.SECONDS.sleep(duration);
	            System.out.println("Task Completed");
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	}
}
