import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment3Q8a {
    public static void failFast(Map<String, String> ceo)
    {
        Iterator iterator = ceo.keySet().iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.println(ceo.get(iterator.next())); 
            ceo.put("Google", "sunder");
        }
    }
    public static void main(String[] args) 
    {
    	Map<String, String> obj = new HashMap<String, String>(); 
        obj.put("Tesla", "elon musk"); 
        obj.put("Amazon", "jeff bezos"); 
        obj.put("Microsoft", "Sathya Nadella"); 
        failFast(obj);
    }
}
