package qaace22training;
	import java.util.*;
	public class LinkedListOne 
	{
	    public static void main(String args[])
	    {
	        LinkedList<String> month = new LinkedList<String>();
	        month.add("january");
	        month.add("febraury");
	        month.addLast("march");
	        month.addFirst("april");
	        month.add(2, "may");	 
	        System.out.println(month);
	        month.remove("march");
	        month.remove(3);
	        month.removeFirst();
	        month.removeLast();
	 
	        System.out.println(month);
	    }
	}

