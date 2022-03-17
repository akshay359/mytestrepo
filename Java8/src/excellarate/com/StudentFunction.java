package excellarate.com;

import java.util.function.*;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class StudentFunction {

	public static void main(String[] args) {
		Function<Student, String> ss = i -> {
			int marks = i.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Dictinction]";
			else if (marks >= 60)
				grade = "B[FirstClass]";
			else if (marks >= 50)
				grade = "c[SecondClass]";
			else if (marks >= 30)
				grade = "D[ThirdClass]";
			else
				grade = "E[Fail]";
			return grade;
		};
		Predicate<Student> p = i -> i.marks >= 60; // if stud marks is greater than 60
		Consumer<Student> c = s1 -> { // for printing purpose
			System.out.println("Student name:" + s1.name);
			System.out.println("Student marks:" + s1.marks);
			System.out.println("Student grade:" + ss.apply(s1));
			System.out.println();
		};
		Student[] s = { new Student("kailas", 100), new Student("kiran", 75), new Student("amit", 55),
				new Student("sunil", 33), new Student("atish", 25),

		};
		for (Student s1 : s) {
			if (p.test(s1)) {
				c.accept(s1);
			}

		}

	}
}
