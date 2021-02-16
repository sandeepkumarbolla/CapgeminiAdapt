import java.util.*;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int r=0,sum=0;
    
        int a=num;
        while(num!=0)
        {
            r=num%10;
            sum+=(int) Math.pow(r,3);
            num=num/10;
        }
        
        if(sum==a)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
} 

public class Assignment1Q1 {
    public static void main(String args[]) {
    		ArmstrongOrNot x=new ArmstrongOrNot();
    		int n;
    		Scanner ss=new Scanner(System.in);
    		n=ss.nextInt();
    		boolean q;
    		q=x.armstrongCheck(n);
    		if(q==true)
    		{
    			System.out.println("yes it is armstrong");
    		}
    		else
    		{
    			System.out.println("no it is not armstrong");
    		}
    	}
	}
