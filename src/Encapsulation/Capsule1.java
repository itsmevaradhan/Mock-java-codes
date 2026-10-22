package Encapsulation;

public class Capsule1 
{
	private String name;
	private int rollNumber;
	private char gender;
	
	
	private void m1()
	{
		System.out.println("this is capsule1");
	}
	
	public void m2()
	{
		m1();
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
