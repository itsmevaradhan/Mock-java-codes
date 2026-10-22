package Map;

import java.util.HashMap;

public class Hashma 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> l = new HashMap<Integer, String>();
		
		l.put(1, "hello");
		l.put(2, null);

		l.put(2, "heyy");
		l.put(3, "tanjore");
		
		System.out.println(l.entrySet());
		
		
	}
}
