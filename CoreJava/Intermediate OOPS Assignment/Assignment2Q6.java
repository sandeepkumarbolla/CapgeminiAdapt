import java.lang.*;
import java.util.*;

public class Assignment2Q6 {
    public static void main(String[] args) {

    	Scanner x=new Scanner(System.in);

    	System.out.println("enter 1 for file (or) enter 2 for database :");
    	int a=x.nextInt();

    	if (a==1)
    	{
    	    runTimeInstance(new FilePersistence());
    	    
    	}
    	if (a==2){
    	    runTimeInstance(new DatabasePersistence());
    	    
    	}
    }

    public static void runTimeInstance(Persistence p){
        System.out.println(p.persist());	
    }
}


abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() 
    {
        return ("FilePersistence class");
        
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist()
    {
        return ("DatabasePersistence class");
    }
}
