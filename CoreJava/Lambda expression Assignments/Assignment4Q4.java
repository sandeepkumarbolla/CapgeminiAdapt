import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Scanner;


public class Assignment4Q4 {

    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){

		Predicate<String> pre = e -> e.length()<8; 
    	employeeList.removeIf(pre);  	
    	return employeeList;
    }



    public static void main(String[] args) {

    	Scanner ss= new Scanner(System.in);

    	ArrayList<String> obj= new ArrayList<String>();

    	System.out.print("enter the number of Strings you want to insert : ");
    	int i= ss.nextInt();

    	for (int j=1;j<=i;j++){

	    	System.out.print("enter the string "+j+" : ");
	    	String s= ss.next();

	    	obj.add(s);

    	}

    	new Assignment4Q4().removeOddLength(obj).forEach(n -> System.out.println(n));

    }
}
