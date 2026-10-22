package Polymorphism;

public class OverRiding extends OverRidesParent
{
	@Override
	public void m1()
	{
		super.m1();
		super.m2();
	}
	
	@Override
	public void m2() 
	{
		System.out.println("this is child");
	}
	public static void main(String[] args)
	{
		OverRiding o = new OverRiding();
		o.m1();
		o.m2();
		
	}
}
