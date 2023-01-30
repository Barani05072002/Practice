import java.io.*;
class Num extends Thread
{
	int n;
Num(int i)
{
	n=i;
}
public void run()
{
	this.display();
}
synchronized void display()
{
	for(int i=n;i<20;i+=2)
	{
	System.out.println(i);
	try
	{sleep(2000);}
	catch(Exception e)
	{}
	}
}
}
class NumMain
{
public static void main(String arg[])
{
	Num n1 = new Num(1);
	Num n2 = new Num(2);

	n1.setPriority(1);
	n2.setPriority(10);

	n1.start();	
	n2.start();
	
}
}