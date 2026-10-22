package Set;


import java.util.Set;
import java.util.TreeSet;

public class Tree 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer>l= new TreeSet<>();
		l.add(1);
		l.add(5);
		l.add(2);
		l.add(4);
		
		
		System.out.println(l);
		l.add(3);

		System.out.println(l.reversed());
	}
}
