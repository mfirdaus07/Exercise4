package exercise4abstraction;

/*Question 2
 *author Mohammad Firdaus 275459
 *Create an abstract class 'Bank' with an abstract method 'getBalance'. 
 *$100, $150 and $200 are deposited in banks A, B and C respectively. 
 *'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
 *Call this method by creating an object of each of the three classes.
*/

abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank{
	public void getBalance() {
		System.out.println("Bank A : $100");
	}
}

class BankB extends Bank{
	public void getBalance() {
		System.out.println("Bank B : $150");
	}
}

class BankC extends Bank{
	public void getBalance() {
		System.out.println("Bank C : $200");
	}
}

class Question2{
	public static void main(String [] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
}


