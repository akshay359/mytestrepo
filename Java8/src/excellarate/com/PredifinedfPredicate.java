package excellarate.com;

import java.util.ArrayList;
import java.util.function.*;

class Employ {
	String name;
	double sal;

	Employ(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}
}

public class PredifinedfPredicate {

	public static void main(String[] args) {

		ArrayList<Employ> e = new ArrayList<Employ>();
		e.add(new Employ("akshay", 2000));
		e.add(new Employ("kiran", 3000));
		e.add(new Employ("kailas", 4000));
		e.add(new Employ("amit", 5000));
		e.add(new Employ("ashish", 6000));
		e.add(new Employ("deva", 7000));
		Predicate<Employ> p = l -> l.sal > 3000;
		for (Employ e1 : e) {
			if (p.test(e1)) {
				System.out.println(e1.name + "" + e1.sal);
			}
		}
	}
}