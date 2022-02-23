package qaace22training;
import java.util.*;  
public class HashSetOne
{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("January");  
           set.add("febraury");  
           set.add("march");  
           set.add("april");  
           System.out.println(set); 
           set.remove("Ravi");  
           System.out.println(set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("may");  
           set1.add("june");  
           set.addAll(set1);  
           System.out.println(set);    
           set.removeAll(set1);  
           System.out.println(set); 
           set.removeIf(str->str.contains("january"));    
           System.out.println(set); 
           set.clear();  
           System.out.println(set);  
 }  
}  
