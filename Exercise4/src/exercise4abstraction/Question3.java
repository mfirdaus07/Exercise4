package exercise4abstraction;

/*Question 3
*
 *author Mohammad Firdaus 275459
*/

abstract class Marks {
	abstract double getPercentage();
}

class A extends Marks {
	double marks1, marks2, marks3, percentage;
	
	public A(double mk1, double mk2, double mk3) {
		this.marks1 = mk1;
		this.marks2 = mk2;
		this.marks3 = mk3;
	}
	
	public double getPercentage() {
		percentage = (marks1 + marks2 + marks3)/300*100;
		return percentage;
	}
}

class B extends Marks {
	double marks1, marks2, marks3, marks4, percentage;
	
	public B(double mk1, double mk2, double mk3, double mk4) {
		this.marks1 = mk1;
		this.marks2 = mk2;
		this.marks3 = mk3;
		this.marks4 = mk4;
	}
	
	public double getPercentage() {
		percentage = (marks1 + marks2 + marks3 + marks4)/400*100;
		return percentage;
	}
}

public class Question3 {
	public static void main (String [] args) {
		A a = new A(65, 70, 85);
		B b = new B(67, 74, 80, 95);
		
		System.out.println("Student A : " + a.getPercentage() + "%");
		System.out.println("Student B : " + b.getPercentage() + "%");
	}
}
