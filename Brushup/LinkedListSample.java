import java.util.LinkedList;

public class LinkedListSample {
	public static void main(String[] args)
	{
		LinkedList<String> name = new LinkedList<String>();
		name.add("patrick");
		name.add("mark");
		name.add("Harry");
		name.add("Tim");
		name.addFirst("jack");
		name.addLast("Zack");
		for(String x : name)
			System.out.println(x);
	}
}