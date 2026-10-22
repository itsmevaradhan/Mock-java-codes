package String;

public class Each_word_1st_caps 
{
	
	
//	public static void main(String[] args)
//	{
//		String str= "hello everyone this is my program";
//		
//		String[] split = str.split(" ");
//		
//		String temp="";
//	
//		for (String s : split)
//		{
//			char c = s.charAt(1);
//			String substring = s.substring(0);
//			String upperCase = substring.toUpperCase();		
//			
//			temp=temp+upperCase+substring;
//			
//		}		
//		System.out.println(temp);
//	}
	
	
	
	public static void main(String[] args) 
	{
		int num=6;
		int fac=1;
		
		for (int i = 1; i <=num; i++) 
		{
			fac=fac*i;
			System.out.println(fac);
		}
	}
}
