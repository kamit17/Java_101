//Creating Threads by subclassing the thread class and instantiating a new Object of the Class
class MyClass extends Thread{

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

public class ThreadDemo2{
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.start();
		MyClass myClass1 = new MyClass();
		myClass1.start();

	}
}