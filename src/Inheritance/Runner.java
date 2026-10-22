package Inheritance;

public class Runner extends B implements C
{

	@Override
	public void i1() 
	{
		System.out.println("interface 1");
	}

	@Override
	public void i2()
	{
		System.out.println("interface 2");
	}
	
	public static void main(String[] args)
	{
		Runner r= new Runner();
		
		r.a1();
		r.a2();
		r.b1();
		r.i1();
		r.i2();
		
		
	}
}
