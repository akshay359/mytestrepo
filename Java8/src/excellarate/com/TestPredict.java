package excellarate.com;

import java.util.function.*;

public class TestPredict {

	public static void main(String[] args) {
// Predicate<Integer> p= i->i%10==0;
// System.out.println(p.test(10));
// System.out.println(p.test(15));

		String[] a = { "akshay", "kailas", "kiran", "sam" };
		Predicate<String> ss = s -> s.length() > 5;
		for (String s1 : a) {
			if (ss.test(s1)) {
				System.out.println(s1);
			}
		}
	}

}
