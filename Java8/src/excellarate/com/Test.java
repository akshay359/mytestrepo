package excellarate.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(26);
		l.add(30);
		l.add(15);
		l.add(22);
		l.add(35);
		l.add(40);
		System.out.println(l);
		Comparator<Integer> c=(I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;//lamda expression
		Collections.sort(l,c);
		System.out.println(l);
	
	}

}
