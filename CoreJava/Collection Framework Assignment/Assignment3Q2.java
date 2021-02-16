import java.lang.*;
import java.util.*;

public class Assignment3Q2
{
    public static void main(String[] args)
    {

        HashSet<Integer> obj1=new HashSet<Integer>();  
        System.out.println("HashSet "+unordered(obj1));  


        LinkedHashSet<Integer> obj2 = new LinkedHashSet<Integer>();  
        System.out.println("LinkedHashSet "+ordered(obj2));
           
    }

public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet)
    {

    	linkedHashSet.add(1);    
    	linkedHashSet.add(5);    
    	linkedHashSet.add(3);   
    	linkedHashSet.add(6);  
    	linkedHashSet.add(4); 
    	linkedHashSet.add(2);	
        return linkedHashSet; 

    }

    public static HashSet<Integer> unordered(HashSet<Integer> hashSet)
    {
    
    	hashSet.add(1);    
    	hashSet.add(3);    
    	hashSet.add(7);   
    	hashSet.add(9);  
    	hashSet.add(2); 
    	hashSet.add(4);	
        return hashSet;   
    }
}
