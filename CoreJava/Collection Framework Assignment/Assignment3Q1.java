import java.lang.*;
import java.util.*;

public class Assignment3Q1 {
    public static void main(String[] args) {

    	Scanner ss= new Scanner(System.in);

    	TreeSet<Person> tS = new TreeSet<Person>(new MyCompare());

    	System.out.print("enter number of objects you want to create :");
    	int i= ss.nextInt();

    	for (int j=0;j<i;j++){

	    	System.out.print("enter name : ");
	    	String st= ss.next();

	    	System.out.print("enter weight : ");
	    	double w= ss.nextDouble();

	    	System.out.print("enter height :");
	    	int h= ss.nextInt();

	    	tS.add(new Person(st,h,w));

    	}

    	for(Person e:tS){System.out.println(e);}

    }
}



class MyCompare implements Comparator <Person>{
	public int compare(Person a, Person b){

		if(a.getWeight()>b.getWeight()){return 1;}
		else if (a.getWeight()<b.getWeight())
		{
		    return -1;
		    
		}
		else
		{
			if(a.getHeight()>b.getHeight())
			{
			    return 1;
			    
			}
		    else if (a.getHeight()<b.getHeight())
		    {
		        return -1;
		        
		    }
		    else {
		        return 0;
		        
		    }
	    }
	}
}



class Person{
    private String name;
    private int height;
    private double weight;

    Person(String name,int height,double weight){
	this.name=name;
	this.height=height;
	this.weight=weight;
    }

    public String getName(){
        return name;
    }
    public int getHeight(){
        return height;
    }
    public double getWeight()
    {
        return weight;
    }

    public String toString(){
        return "Name: "+this.name+"		weight: "+this.weight+"		Height: "+this.height;
    }
}
