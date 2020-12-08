package exercise4abstraction;

/*Question 1
*
 *author Mohammad Firdaus 275459
 * Create an abstract class 'Parent' with a method 'message'. 
 * It has two subclasses each having a method with the same name 'message' 
 * that prints "This is first subclass" and "This is second subclass" respectively. 
 * Call the methods 'message' by creating an object for each subclass.
*/


abstract class Parent {
	abstract void message();
}

class X extends Parent {
	public void message() {
		System.out.println("This is first subclasses");
	}
}

class Y extends Parent{
	public void message() {
		System.out.println("This is second subclasses");
	}
	
}

public class Question1 {
	public static void main (String [] args) {
		X x = new X();
		Y y = new Y();
		
		x.message();
		y.message();
	}
}
