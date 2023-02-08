import java.util.*;
public class First {
	public static void main(String arg[])
	{
		LinkedList<Integer> l = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		l.add(2002);
		l.add(null);
		l.add(2001);
		list.addAll(l);
		//l.remove(1);
		
		System.out.println(list.indexOf(null));
		System.out.println(l.indexOf(2001));
		System.out.println(l);
		list.remove(0); 	//must be mention index of the remove element
		l.removeLast();
		l.remove(); 	//remove in first element in the list
		System.out.println(l.indexOf(2001)); //if element not in the list returns -1
		System.out.println(l);
		System.out.println(list);
		
		for(int i=0;i<20;i++)
			l.add(i);
		System.out.println(l);
		//list.clear();
		l.retainAll(list);
		System.out.println(l);
		System.out.println(list);
	}
}
