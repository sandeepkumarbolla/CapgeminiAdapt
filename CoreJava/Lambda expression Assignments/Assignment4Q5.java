import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Assignment4Q5 {
	
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    public static void main(String[] args) 
    {
    	Consumer<String> obj = a -> System.out.println(a);
    	obj.accept(processWords(new Assignment4Q5().list));
    }

    public static String processWords(List<String> list)
    {
    	StringBuffer SB = new StringBuffer("");
    	list.forEach(n -> SB.append(n.charAt(0)));
    	return SB.toString();
    }
}
