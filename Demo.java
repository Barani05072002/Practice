import java.util.*;  
class Demo{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
ArrayList<Integer> temp = new ArrayList<Integer>();
ArrayList data = new ArrayList();

temp.add(1);
for(int i=0;i<=10;i++)
{temp.add(i);}

data.add("Ravi");
data.add("Saravana");
data.add(23);
//data.add(temp);  //normal add only one
data.addAll(temp);// adding all two or more
System.out.println(data);
//System.out.println(temp);

data.remove("Ravi");
//data.remove(1,2);  //error only remove one 
System.out.println("after removing ravi:"+data); 
//data.removeAll(temp);//remove set of element
//System.out.println("after using remove all"+data);
data.retainAll(temp);//remove all element without passing parameter
System.out.println("using retain all:"+data);
list.add("Ravi");//Adding object in arraylist 
list.add("Vijay");  
list.add("Ravi");  //support repeating datas
list.add("Ajay");

//Traversing list through Iterator  
//Iterator itr=list.iterator();  
//while(itr.hasNext()){  
//System.out.println(itr.next());  
//}
 
}  
}  
