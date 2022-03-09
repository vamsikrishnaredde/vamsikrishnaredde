package treeSet1;
import java.util.*;
public class TreeSet1 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();  
		ts.add("Vamsi");  
		ts.add("Krishna");  
		ts.add("Reddy");  
		ts.add("Kopperla");  
		//Traversing elements  
		Iterator<String> itr=ts.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}
	}
}

