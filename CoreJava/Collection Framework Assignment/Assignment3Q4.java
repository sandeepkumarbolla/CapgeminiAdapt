import java.util.*;
import java.lang.*;
class DateClass 
{
    private int date;
    private int month;
    private int year;
    public DateClass(int date,int month,int year)
    {
        this.date=date;
        this.month=month;
        this.year=year;
    }
	  @Override 
	  public int hashCode()
	  { 
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + date; 
	    result = prime * result + month; 
	 // result =prime * result + year; 
	    return result; 
	  }
	  @Override 
	  public boolean equals(Object obj)
	  { 
		  if (this == obj) return true;
		  if (obj == null) return false; 
		  if (getClass() != obj.getClass()) return false; 
		  DateClass other = (DateClass) obj; 
		  if (date != other.date) return false; 
		  if (month != other.month) return false;  
		  if (year == other.year) return false;
		  return true;
	  }
	public int getDate()
	{ 
	    return this.date;
	    
	}
    public int getMonth()
    {
        return this.month;
        
    }
    public int getYear()
    {
        return this.year;
    }
    public String toString()
    { 
        return "date: "+this.date+"  month: "+this.month+"  year: "+this.year+"  ";
    }
}

public class Assignment3Q4 
{
    public String getEmployee(HashMap<DateClass, String> hm,String employeeName)
    {
        String str="get method fails";
        for (Map.Entry<DateClass, String> entry : hm.entrySet()) 
        {
            if(entry.getValue().equals(employeeName))
            { 
                str=entry.getValue();
                break;
            }
        }
    return str;
    }
    public static void main(String[] args)
    {
        Scanner aa= new Scanner(System.in);
        HashMap<DateClass,String> hm= new HashMap<>();
        DateClass d1=new DateClass(4,7,95);
        hm.put(d1,"a1"); 
        DateClass d2=new DateClass(4,3,97);
        hm.put(d2,"a2"); 
        DateClass d3=new DateClass(4,7,95);
        hm.put(d3,"a"); 
        DateClass d4=new DateClass(4,3,95);
        hm.put(d4,"a3"); 
        System.out.println("hashmap : "+hm);
        System.out.print("enter the name of employee you want to check : ");
        String str1=aa.next();
        Assignment3Q4 obj=new Assignment3Q4();
        System.out.println("     "+obj.getEmployee(hm,str1));
    }
}
