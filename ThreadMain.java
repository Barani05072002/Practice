import java.io.*;
class Obj1 implements Runnable
{
	int n;
Obj1(int i)
{
	n = i;
}
public void run()
{
	for(int i=n;i<20;i+=2)
	System.out.println(i);	
}
}
class Obj2 implements Runnable
{
public void run()
{
	for(int i=0;i<20;i++)
	System.out.println("Loading...");
}
}
class ThreadMain
{
public static void main(String arg[])
{
	Obj1 o1 = new Obj1(1);
	Obj1 o2 = new Obj1(0);
	Obj2 o3 = new Obj2();
	Thread t1 = new Thread(o1);
	Thread t2 = new Thread(o2);
	Thread t3 = new Thread(o3);
	t1.start();
	t2.start();
	t3.start();
}
}