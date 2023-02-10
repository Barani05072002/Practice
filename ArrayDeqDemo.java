import java.util.*;
public class ArrayDeqDemo {
	public static void main(String arg[])
	{
		Deque<Integer> arr= new ArrayDeque<>();
		Deque<Integer> arr1 = new LinkedList<>();
		Collection<Character> data = new LinkedList<>();
		
		
		
		//Collection<? extends Character> arr= new ArrayDeque<>();  ? what is it mean ?
		arr.add(8);
		arr.add(34);
		arr.add(24);
		arr.addFirst(23);
		arr.addFirst(34);
		
		for(char i='A';i<='Z';i++)
			data.add(i);
		
		for(int i=0;i<=20;i++)
			arr1.add(i);
		
		arr1.addAll(arr);
		System.out.println(arr1);
		//arr1.retainAll(arr);
		System.out.println("before "+arr1);
		arr1.removeIf(i->(i%2==0));
		
		// i is the counter veriable similar in for loop and throw the predicts
		System.out.println("after using removeif():"+arr1);
		System.out.println("after retaining:"+arr1);
		System.out.println(data);
		System.out.println(arr.removeLast());	//24 will be removed
		System.out.println(arr.removeFirst());	//34 
		System.out.println(arr.remove(23));
		//arr.clear();
		//int temp[] = new int[arr.size()];
		//int temp[]
		//temp = arr.toArray(); // error occured 
		// return the objects	
		
		//Objects[] temp = data.toArray(); //cannot convert from Object[] to Objects[]
		
		System.out.println(arr);
		System.out.println(arr1.size());
	}
}
