package List;

import java.util.LinkedList;
import java.util.List;

public class LinkLis
{
	public static void main(String[] args)
	{
		List<String>l= new LinkedList<>();
		l.add("yes ");
		l.add("my ");
		l.add("name ");
		l.add("is  ");
		
		System.out.println(l);
		
		l.addFirst("hello");
		l.addLast("varadhan");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.addFirst("hey ");
		
		System.out.println(l);
		
		
	}
}
