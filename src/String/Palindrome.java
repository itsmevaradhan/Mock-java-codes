package String;

public class Palindrome
{
	//	public static void main(String[] args) 
	//	{
	//		String s= "malayalam";
	//		
	//		String rev= "";
	//		for (int i = s.length()-1; i >=0; i--) 
	//		{
	//			char c = s.charAt(i);
	//			rev=rev+c;
	//		}
	//		
	//		if(s.equals(rev))
	//		{
	//			System.out.println("  its palindrome  ");
	//		}
	//		else {
	//			System.out.println(s+"  its not palindrome  "+rev);
	//		}
	//	}
	public static void main(String[] args) 
	{
		int num=1234554321;	
		int a=num;
		int rev=0;
		
		while (num>0)
		{
			int res = num % 10;
			rev= rev *10 + res;
			num = num / 10;
		}
		System.out.println(a);
		System.out.println("   ");
		System.out.println(rev);
		System.out.println(" ");
		if(a==rev)
		{
			System.out.println("its palindrome  ");
		}
		else {
			System.out.println("its not palindrome  ");
		}
	}
}

