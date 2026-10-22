package Polymorphism;

public class Overload//compile time polymorphism
{
	public void over(int a) 
	{
		System.out.println("method 1");
	}
	
	public void over(int a , String b) 
	{
		System.out.println("method 2");

	}
	public void over(String a, int b) 
	{
		System.out.println("method 3");

	}
	public void over(int a , String b, char c ) 
	{
		System.out.println("method 4");

	}
	public static void main(String[] args)
	{
		Overload o= new Overload();
		o.over(5);
		o.over(3, "dd", '@');
		o.over(null,99);
		o.over(0, null);
	}
}


















