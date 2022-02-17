package qaace22training;

public class CountingObjects
{
	private static int count;
    public CountingObjects()   
    {
    count++;
    }
    public static void main(String[] args) 
    {
    	CountingObjects ob1 = new CountingObjects();
    	CountingObjects ob2 = new CountingObjects();
    	CountingObjects ob3 = new CountingObjects();
    	CountingObjects ob4 = new CountingObjects();
    	CountingObjects ob5 = new CountingObjects();
    	CountingObjects ob6 = new CountingObjects();
    	CountingObjects ob7 = new CountingObjects();
    	CountingObjects ob8 = new CountingObjects();
        System.out.print("Total Number of Objects: " + CountingObjects.count);
    }
}

	
