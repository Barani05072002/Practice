import java.io.*;
class Tabel extends Thread
{
	int n;
Tabel(int i)
{
	n =i;
}
public void run()
{
	for(int i=1;i<=10;i++)
	{
	System.out.println(i*n);
	try{sleep(8000);}
	catch(Exception e){}
	}
}
}
class TabelMain
{
public static void main(String arg[])
{
	Tabel t1 = new Tabel(5);
	Tabel t2 = new Tabel(4);
	t1.start();

	if(t1.isAlive())
	System.out.println("Is alive");

	t2.start();

	//t1.join();
	//t2.join();
	t1.setName("5th tabel");
	t2.setName("4th tabel");

	if(t1.isAlive())
	System.out.println("Is alive");
	
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
	System.out.println("After all complete");
}
}