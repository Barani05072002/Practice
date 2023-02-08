import java.util.*;
public class QueDemo {
	public static void main(String arg[])
	{
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	PriorityQueue<Integer> n=new PriorityQueue<>(); 
	
	n.add(5);
	n.add(10);
	for(int i=15;i>0;i--)
		n.add(i);
	System.out.println(n);//support same number
	System.out.println(n);//not sorted :?
	queue.add("Raj");  
	queue.add("Vijay ");  
	queue.add("Jai");  
	queue.add("Raj");  
	
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	
	
	
	
	System.out.println(queue);
	queue.remove(); //returns exception if queue is empty;and remove head
	System.out.println(queue);
	queue.poll();//remove head 
	System.out.println("after removing two elements:");  
	System.out.println(queue);
	Iterator<String> itr2=queue.iterator();  
	
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator(); 
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  
}
}