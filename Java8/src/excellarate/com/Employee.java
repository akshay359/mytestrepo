package excellarate.com;

import java.util.ArrayList;
import java.util.Collections;

class Employe {
	String name;
	int id;

	Employe(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ":" + name;
	}

}

public class Employee {

	public static void main(String[] args) {
		ArrayList<Employe> e = new ArrayList<Employe>();
		e.add(new Employe("akshay", 100));
		e.add(new Employe("kailas", 101));
		e.add(new Employe("amit", 92));
		e.add(new Employe("kiran", 10));
		e.add(new Employe("sam", 30));

		System.out.println(e);
		Collections.sort(e, (e1, e2) -> (e1.id < e2.id) ? -1 : (e1.id > e2.id) ? 1 : 0);
		System.out.println(e);
	}

}
