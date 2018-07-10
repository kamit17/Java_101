class stringManipulation{
	
	//toString for every object
	//reference data type
	//immutable

	public static String reverseString(String original)
	{
		if(original.length() < 2){
			return original;
		}
		return reverseString(original.substring(1)) + original.charAt(0);
	}

	public static void main(String[] args)
	{
		//Literal -->String pool 9Heap -- perm heap)
		String s = "Hello World!";

		//New operator -->Heap
		String t = new String("Hello World");

		//Making a string

		//Concatenate
		String h = "Hello ";
		String w = "World";

		System.out.println(h.concat(w));
		System.out.println(h + w + "s"); 


		//Formatting
		String d = String.format("Steve has %d cats", 5);
		//%d -->integer
		//%s-->string
		//%f --.floats
		System.out.println(d);

		//Substrings
		System.out.println(h + d.substring(0,5));

		//String instance methods

		//Length
		String hiThere = "Hi There";
		System.out.println(hiThere.length());

		//charAt
		System.out.println(hiThere.charAt(3));

		//indexof
		System.out.println(hiThere.indexOf('e'));
		System.out.println(hiThere.indexOf('e',6));
		System.out.println(hiThere.lastIndexOf('e'));


		// toUpperCase()
		System.out.println(hiThere.toUpperCase());
		System.out.println(hiThere.toLowerCase());

		//replace
		System.out.println(hiThere.replace('e', 'z'));



//How to Reverse a String in Java
		String reverse = "Hello";

		//1. Library method
		StringBuilder sB = new StringBuilder(reverse).reverse();
		System.out.println(sB);

		String original = "hello";

		//2.iterative 
		String re = "";
		for (int i = original.length() -1; i > 0; i--)
		{
			re = re + original.charAt(i);
		}
		System.out.println(re);

		//3.Recursion
		System.out.println(reverseString(original));

















































	}
}