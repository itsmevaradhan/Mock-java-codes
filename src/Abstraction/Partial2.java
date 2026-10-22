package Abstraction;

public class Partial2 extends Partial1
{

	@Override
	void m1() 
	{
		System.out.println("partial2-----1");
	}

	@Override
	void m2() {
		System.out.println("partial2-----2");
	}
	
	public static void main(String[] args) 
	{
		Partial2 p= new Partial2();
		p.m1();
		p.m2();
		p.m3();
	}

	
}
