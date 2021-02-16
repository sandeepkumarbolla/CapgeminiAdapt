import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Assignment4Q7 {
    public static void main(String[] args) {
    	 HashMap<String,Integer> m = new LinkedHashMap<String,Integer>();   	
    	 Scanner ss= new Scanner(System.in);
   	 
	   	 System.out.print("Enter the number of elements: ");
	   	 int n= ss.nextInt();
	   	 
	   	 
	   	 for(int i=0;i<n;i++) {
	   		 
	   		 System.out.print("enter the key "+(i+1)+" in the map   : ");
	   		 String strkey= ss.next();
	   		 
	   		 System.out.print("enter the value "+(i+1)+" in the map : ");
	   		 int strvalue= ss.nextInt();
	   		 
	   		 m.put(strkey,strvalue);
	   	 }
	   	 
	   	System.out.print(new Assignment4Q7().convertKeyValueToString(m));
    }
    
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	StringBuilder obj=new StringBuilder("");
    	map.entrySet().stream().forEach(e -> {obj.append(e.getKey()); obj.append(e.getValue());});
    	return obj.toString();
    }
}
