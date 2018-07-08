class JavaException {
   public static void main(String args[]){
      int d = 0;
      int n = 20;
      try{
      	 int fraction = n/d;
      	 System.out.println("This line will not be executed");
      }
      catch(ArithmeticException e)
      {
      	System.out.println("In the catch block due to Exception =  "+ e);
      }
     
     System.out.println("End Of Main");
   }
}