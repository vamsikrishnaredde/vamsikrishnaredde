package arraylist1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class arraylist1
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("111");
		l.add("444");
		l.add("333");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
	}
}