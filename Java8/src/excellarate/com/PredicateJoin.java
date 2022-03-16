package excellarate.com;

import java.util.function.*;

public class PredicateJoin {

	public static void main(String[] args) {
		int[] a = { 0, 10, 25, 30, 11, 23, 43, 2 ,40};
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		for (int a1 : a) {
			if (p1.and(p2).test(a1)) {
				System.out.println(a1);
			}
		}

	}

}
