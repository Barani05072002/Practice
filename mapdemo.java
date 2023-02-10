import java.util.*;

public class mapdemo {
	public static void main(String arg[])
	{
		//A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Barani");
		map.put(2,"sai");
		map.put(3,"saravana");
		map.put(4,"vicky");
		
		//Map<Integer,String,String> map1 = new HashMap<>(); map<key,value>
				System.out.println("Map:"+map);
				
		//travesel
		Set set=map.entrySet();//Converting to Set so that we can traverse  
		
		Iterator i = set.iterator();
		while(i.hasNext())
			{System.out.println(i.next());
			//i.remove();
			}
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
			        //Converting to Map.Entry so that we can get key and value separately  
			        Map.Entry entry = (Map.Entry)itr.next() ;
			        System.out.println(entry.getKey()+" "+entry.getValue());  
			    }  
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey() +" "+m.getValue());
		
		Set keys = map.keySet();
		Collection l = map.values();
		System.out.println(l.getClass());	//
		System.out.println(keys);
		System.out.println(l);
		
	}
}
