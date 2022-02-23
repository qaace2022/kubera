package qaace22training;
import java.util.*;
public class HashMapOne {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"January");
        map.put(2,"febraury");
        map.put(3,"march");
        map.put(4,"april");
        map.put(5,"May");
        map.put(3,"june");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("febraury"));
        System.out.println(map.containsValue(4));
        System.out.println(map.get("may"));
         for(Map.Entry m : map.entrySet())
         {    
                System.out.println(m.getKey()+" "+m.getValue());   
         map.remove("january");
         System.out.println(map);
         System.out.println(map.size());
         }     
	}
	}
