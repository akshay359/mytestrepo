package excellarate.com;

interface Defalt {
	default void m1() {  
		System.out.println("This is default method");// default method
	}
}

public class DeafaultM implements Defalt {

	public void m1() {
		// we take public modifier instead of default because default modifier is not
		// allowed in class
		System.out.println("Overided default method"); // overriding default method
		// not compulsory to override
		// if implement class is not satisfy with default method then it can be
		// overided.
	}

	public static void main(String[] args) {
		DeafaultM d = new DeafaultM();
		d.m1();

	}

}
