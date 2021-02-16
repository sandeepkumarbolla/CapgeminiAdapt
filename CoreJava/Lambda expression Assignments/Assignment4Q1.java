import java.util.Scanner;
interface Operation
{
    double math(int a,int b);
}
public class Assignment4Q1
{
    public double addition(int num1,int num2)
    { 
    	Operation a= (int i,int j) -> i+j; 
    	return a.math(num1, num2);
    }

    public double subtraction(int num1,int num2)
    { 
    	Operation s= (int i,int j)-> i-j; 
    	return s.math(num1, num2);
    }
    public double multiplication(int num1,int num2)
    { 
    	Operation m= (int i,int j)-> i*j; 
    	return m.math(num1, num2);
    }
    public double division(int num1,int num2)
    { 
    	Operation d= (int i,int j)-> (double)i/j; 
    	return d.math(num1, num2);
    }
    
    public static void main(String[] args) 
    {
    	Scanner ss=new Scanner(System.in);
    	int a,b;
    	a=ss.nextInt();
    	b=ss.nextInt();
    	Assignment4Q1 obj= new Assignment4Q1();
    	System.out.println("sum : "+obj.addition(a,b));
    	System.out.println("difference : "+obj.subtraction(a,b));
    	System.out.println("product : "+obj.multiplication(a,b));
    	System.out.println("division : "+obj.division(a,b));
    }
}
