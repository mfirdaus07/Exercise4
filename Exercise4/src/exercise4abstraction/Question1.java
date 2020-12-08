package exercise4abstraction;

/*Question 1
 * 
 *author Mohammad Firdaus 275459
 *
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
