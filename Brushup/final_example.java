/*
Final Keyword if used with :
A class - The class cannot be subclassed
A method - The mothod cannot be overwritten
Variable - The Variable is only initialized once. i.e It cannot be changed
*/

public class Hello{
	public final int number ;


	Hello()
	{
		number = 10;
	}
}

public class final_example{

	public static void main(String[] args) {
		Hello hel = new Hello();
		//hel.number = 20;
		
	}
}