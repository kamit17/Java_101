//package demotest;
public class GuruThread2 {    //main Class

 public static void main(String[] args) {  // main method of class
  // TODO Auto-generated method stub
  GuruThread3 threadguru1 = new GuruThread3("guru1");  //Creating an instance of a class 
  threadguru1.start();
  GuruThread3 threadguru2 = new GuruThread3("guru2");
  threadguru2.start();
 }
}
class GuruThread3 implements Runnable {  //Creating class  which is implementing the runnable interface.
 Thread guruthread; //creating class variables out of which one is thread type and the other is String type
 private String guruname;
 GuruThread3(String name) {   // overriding the constructor GuruThread3 which takes one String type argument that gets assigned to class variable guruname and hence the name of the thread is stored.
  guruname = name;
 }
 @Override
 public void run() {  // Overriding the run() method of the runnable interface
  System.out.println("Thread running" + guruname);  //output of the thread name using println

  /*
  Between line 28 - 34Here we are using a for loop with counter initialized to 0, and it should not be less than 4 
  (we can take any number hence here loop will run 4 times) and incrementing the counter. 
  We are printing the thread name and also making the thread sleep for 1000 milliseconds 
  within a try-catch block as sleep method raised checked exception.
  */
  for (int i = 0; i < 4; i++) {
   System.out.println(i);
   System.out.println(guruname);
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    System.out.println("Thread has been interrupted");
   }
  }
 }
 public void start() {  //overriding the start method of the runnable interface
  System.out.println("Thread started");
  /*
  Here we are taking an if condition to check whether class variable guruthread has value in it or no. 
  If its null then we are creating an instance using thread class which takes the name as a parameter 
  (value for which was assigned in the constructor). After which the thread is started using start() method.
  */

  if (guruthread == null) {
   guruthread = new Thread(this, guruname);
   guruthread.start();
  }

 }
}
