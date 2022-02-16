package qaace22training;

public class SmallestAndLargest 
{

	public static void main(String[] args) 
	{
		int numbers[] = new int[]{4000,3000,2000,5000,7000};
        int smallest = numbers[0];
        int largetst = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
         if (numbers[i] > largetst)
          largetst = numbers[i];
         else if (numbers[i] < smallest)
          smallest = numbers[i];
        }
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
       }
      }
	

