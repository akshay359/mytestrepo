package excellarate.com;

interface Interf
{
	public void m1();
}

public class Excellarate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf d=()->System.out.println("m1 implementation");
		d.m1();
	}

}
