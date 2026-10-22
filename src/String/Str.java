package String;

public class Str
{
	
	
	
	public static void main(String[] args) 
	{
		String s1= "hello";

		String s= new String("hello");
		
		
		if(s1.equals(s))
		{
			System.out.println(" yes its same");
		}
		else
		{
			System.out.println("invalid");
		}
		
		if(s1==s)
		{
			System.out.println(" yes");
			
		}
		else
		{
			System.out.println("No");
		}
	}
	
			
}
