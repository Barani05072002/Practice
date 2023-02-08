import java.util.*;
public class Second {
	public static void main(String arg[])
	{
		Queue<Integer> q= new LinkedList<>();
		q.add(23);
		q.add(22);
		q.add(34);
		q.add(21);
		q.add(56);
		
		Queue<Integer> n = new ArrayList<Integer>();
		
		
		System.out.println(q);
		System.out.println("head:"+q.peek());
		System.out.println("remove:"+q.remove());//remove and return if empty throws exception
		System.out.println("poll:"+q.poll());//remove and return and if empty returns null 
		
		System.out.println(q.size());
		
	}

}
