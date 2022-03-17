package excellarate.com;

import java.util.function.*;

public class FunctionString {

	public static void main(String[] args) {
//*For Count the length of string
		Function<String, Integer> s = i -> i.length();
		System.out.println(s.apply("akshay"));
		System.out.println(s.apply("excellarate"));
		Function<String, String> ss = i -> i.toUpperCase();
		
//For make lower case string to uppercase		
		System.out.println(ss.apply("akshay"));
		System.out.println(ss.apply("excellarate"));
		
		

	}

}
