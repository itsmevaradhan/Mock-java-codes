package Set;

import java.util.HashSet;

public class Hashse 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h= new HashSet<>();
		
		h.add(23);
		h.add(34);
		h.add(54);
		h.add(null);
		h.add(null);
		h.add(23);
		System.out.println(h);
	}
}
