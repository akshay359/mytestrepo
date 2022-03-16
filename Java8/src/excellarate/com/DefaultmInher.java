package excellarate.com;

interface Left {
	default void m1() {
		System.out.println("Left method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right method");
	}
}

public class DefaultmInher implements Left, Right {
	public void m1() {
	Right.super.m1();
	}

	public static void main(String[] args) {
		DefaultmInher i = new DefaultmInher();
		i.m1();

	}

}
