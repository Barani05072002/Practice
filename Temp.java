import java.util.*;
class Temp
{
    public static void main(String arg[])
    {
    ArrayList n = new ArrayList();
    ArrayList temp1 = new ArrayList();
    ArrayList temp2 = new ArrayList();
    
    for(int i=0;i<=10;i++)
    {temp1.add(i);}
    
    for(int i=0;i<=10;i++)
    {temp2.add(i);}
    
    n.add(temp1);
    n.add(temp2);
    
    System.out.println(n);
    System.out.println(n.size());
    System.out.println(n.isEmpty());
    System.out.println(n.stream()); //java.util.stream.ReferencePipeline$Head@5e91993f

    System.out.println(n.contains(10));
    System.out.println(n.get(0));
    
    Iterator<Integer> i = n.iterator();
    
    //while(i.hasNext())
    	//System.out.println(i.next());
   // ArrayList inner;
    while(i.hasNext())
    {
    	inner = i.next();
    	Iterator<Integer> j = inner.iterator();
    	//Iterator<Integer> j = i.next().Iterator();
    	while(j.hasNext())
    		System.out.println(j.next());
    }
    
}
}

