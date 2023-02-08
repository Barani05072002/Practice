import java.util.*;
public class SetDemo {
public static void main(String arg[])
{
	HashSet<Integer> h = new HashSet<>();
	h.add(3);
	h.add(1);
	h.add(5);
	h.add(7);
	
	for(int i=0;i<10;i++)
		h.add(i);
		
	System.out.println(h);	//repeating not allowed
							//sorted order
	HashSet<String> s = new HashSet<>();
	s.add("Saravana");
	s.add("Raj");
	s.add("Vijay");
	s.add("jai");
	s.add("Sai");
	
	System.out.println(s);
	s.remove("Raj");
	System.out.println(s);
	
	Iterator<String> i = s.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
	// ystem.out.println(i.next());  //Error occured
	/*xception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1599)
	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620)
	at SetDemo.main(SetDemo.java:31)
*/
	
	System.out.println("LinkedHashSet");
	LinkedHashSet<String> ls = new LinkedHashSet<>();
	
	ls.add("Saravana");
	ls.add("Raj");
	ls.add("Vijay");
	ls.add("jai");
	ls.add("Sai");
	
	System.out.println(ls);		//order maintain
	ls.add("Sai");
	System.out.println(ls);		//repeating not allowed

	System.out.println("TreeSet");
	
	TreeSet<Integer> t = new TreeSet<>();
	
	for(int j=10;j>0;j--)
		t.add(j);
	
	for(int j=10;j>0;j--)
		t.add(j);
	
	System.out.println(t); //sorted,repeating not allowed
	
	
}
}
