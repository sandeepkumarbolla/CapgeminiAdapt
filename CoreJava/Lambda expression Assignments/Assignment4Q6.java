import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
public class Assignment4Q6 {
    public static void main(String[] args) 
    {
    	List<String> list = new ArrayList<String>();
   	    Scanner ss= new Scanner(System.in);
   	    System.out.print("Enter the number of elements: ");
   	    int n= ss.nextInt();
   	    for(int i=0;i<n;i++) 
   	    {
   	    	System.out.print("enter the element"+(i+1)+" in the list : ");
   		    String str= ss.next();
   		    list.add(str);
   		}
   	 System.out.print(new Assignment4Q6().convertToUpperCase(list));
    }
    public List<String> convertToUpperCase(List<String> list) 
    {
    	UnaryOperator<String> obj = item -> item.toUpperCase();
    	list.forEach(n -> Collections.replaceAll(list,n,obj.apply(n)));
    	return list;
    }  
}
