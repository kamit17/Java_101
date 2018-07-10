// creating a class called threaddemo which is implemeting the Runnable interface
public class threaddemo implements Runnable{
	public void run()
	{
		//overrides run method of runnable interface since it is mandatory
	}

	// defining` the main method to start execution of the  thread
	public static void main(String[] args) {
		Thread thread1=new Thread();  //creating a new thread by instantiating a new class of thread
		thread1.start();  //using start method of thread to  using thread1 instance
		try{
			thread1.sleep(1000); //using sleep method of thread

		}catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		thread1.setPriority(3);
		int threadpiriroty = thread1.getPriority();
		System.out.println(threadpiriroty);
		System.out.println("Thread Running");
	}
}