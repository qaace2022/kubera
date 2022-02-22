package qaace22training;
class MaxLimitReached extends Exception{
	public MaxLimitReached(String n) {
		super(n);
	}
}
public class instanceCount
{
	static int count;
	public instanceCount()   
	{
		count++;
	}
	static void countobject(int count) throws MaxLimitReached
	{
		if(count>3) 
		{
			throw new MaxLimitReached("Max limit reached");
		}
		else
		{
			System.out.println("No of instance:" + count);
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			instanceCount ob1 = new instanceCount();
			instanceCount ob2 = new instanceCount();
			instanceCount ob3 = new instanceCount();
			instanceCount ob4 = new instanceCount();
			instanceCount ob5 = new instanceCount();
			countobject(count);
		}
		catch(MaxLimitReached ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
}