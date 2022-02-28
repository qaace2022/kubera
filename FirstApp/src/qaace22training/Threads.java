package qaace22training;
class display implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=6;i++) 
		{
			System.out.println("CSK");
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class view extends Thread
{
	public void run()
	{
		String[] s = {"Dhoni","Raina","jadeja","faf","Dj Bravo"};
		for(int i=0;i<5;i++) 
		{
			System.out.println(" Name :"+s[i]);
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class Threads
{
	public static void main(String[] args)
	{
		Thread v = new view();
		v.start();
		Runnable d = new display();
		Thread t1 = new Thread(d);
		t1.start();
    }
}