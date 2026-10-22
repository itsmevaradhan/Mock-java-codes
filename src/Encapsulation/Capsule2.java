package Encapsulation;

public class Capsule2 extends Capsule1
{
	public static void main(String[] args)
	{
		Capsule2 c= new Capsule2();
		c.setGender('m');
		c.setName("varadhan");
		c.setRollNumber(8789);
		
		System.out.println(c.getName());
		System.out.println(c.getGender());
		System.out.println(c.getRollNumber());
		c.m2();
		
	}
}
