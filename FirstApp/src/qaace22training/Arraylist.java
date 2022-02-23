package qaace22training;
import java.util.*;
import java.util.Iterator;
import java.util.List;

public class Arraylist 
{
	public static void main(String[] args)
	{
        List<String> names = new ArrayList();
        names.add("dhoni");
        names.add("raina");
        names.add("jadeja");
        names.add("ruthuraj");
        names.add("Bravo");
        System.out.println(names);    
        names.set(1, "faf");
        System.out.println(names); 
        System.out.format("%d %n",names.size());
        names.remove(1);
        System.out.format("%d %n",names.size());                   
        System.out.println(names.get(3));
        Iterator<String> itr = names.iterator();
        
        while (itr.hasNext()) {
            
            System.out.println(itr.next());
        }        
    }
}


