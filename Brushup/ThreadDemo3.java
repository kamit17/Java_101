//Implementing the Runnable interface
class MyClass implements Runnable{
	public void run()
	{
		for (int i=0; i < 10; i++)
		{
			//System.out.println("Value "+i);
			System.out.println(Thread.currentThread().getId()+"  Value  "+i);
		}
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadDemo3{

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass());
		Thread t2 = new Thread(new MyClass());
		t1.start();
		t2.start();

	}
}