import java.util.*;
import java.lang.*;
public class Assignment3Q3
{
    public static void main(String[] args)
    {
    	ArrayList<String> obj=new ArrayList<String>();
    	obj.add("dog");
    	obj.add("cat");
    	obj.add("lion");
    	obj.add("tiger");
    	obj.add("wolf");
    	System.out.println(traverseReverse(obj));
    }
    public static List<String> traverseReverse(ArrayList<String> aList)
    {
    	ListIterator<String> li = aList.listIterator(aList.size()); 
    	List<String> mylist = new ArrayList<String>();
    	while (li.hasPrevious())
    	{
        mylist.add(li.previous());
        }
    	return mylist;
    }
}
