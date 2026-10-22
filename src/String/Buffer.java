package String;

public class Buffer //stringbuffer
{
	public static void main(String[] args) 
	{
		StringBuffer s= new StringBuffer("hii,");
		s.append("hello");
		s.append(" world");
		s.append(" welcome to java");
		System.out.println(s);
		System.out.println("--------------------------------------");

		for (int i = s.length()-1; i >=0; i--)
		{
			char c = s.charAt(i);
			System.out.print(c);
			
		}
	}
}
