import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b 
{
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list)
    {
    	Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer no = (Integer)itr.next(); 
            System.out.println(no); 
            if (no == 7) 
            {
                list.add(23); 
            }
                
        } 
		return list;
    }
    public static void main(String args[]) {
    	CopyOnWriteArrayList<Integer> obj = new CopyOnWriteArrayList<Integer>(new Integer[] { 4, 9, 7, 34 }); 
    	failFast(obj);
    }
}
