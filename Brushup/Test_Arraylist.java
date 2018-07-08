import java.util.ArrayList;
class Test_Arraylist{
	public static void main(String[] args)
	{
		//Creating a generic ArrayList
		ArrayList arlTest = new ArrayList();
		//Size of arrayList
		System.out.println("Size of ArrayList at creation: "+arlTest.size());
		//Adding some elements to it
		arlTest.add("D");
		arlTest.add("U");
		arlTest.add("C");
		arlTest.add("K");

		//Rechecking the size after adding Elements
		System.out.println("Size of ArrayList after adding elements: "+arlTest.size());

		//Display all the contents of ArrayList
		System.out.println("List of Elements: "+arlTest);

		//Removing some elements
		arlTest.remove("D");
		System.out.println("Size of ArrayList after removing elements: "+arlTest.size());
		System.out.println("List of Elements: "+arlTest);

		//Remove Element by Index
		arlTest.remove(2);
		System.out.println("Size of ArrayList after removing elementsby Index: "+arlTest.size());
		System.out.println("List of Elements: "+arlTest);

		// Check if list contains "K"
		System.out.println(arlTest.contains("K"));

	}
}