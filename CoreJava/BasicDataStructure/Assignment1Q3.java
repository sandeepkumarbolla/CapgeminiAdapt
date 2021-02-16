import java.util.*;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return((principalAmount*time*interestRate)/100);
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	return principalAmount *(Math.pow((1 + interestRate/100), time))-principalAmount;
    }
}



public class Assignment1Q3 {
	public static void main(String []args) {
		int p,r,n;
		SiCi x=new SiCi();
		Scanner ss=new Scanner(System.in);
		 p=ss.nextInt();
		 r=ss.nextInt();
		 n=ss.nextInt();
		 double SI,CI;
		 SI=x.simpleInterest(p,n,r);
		 CI=x.compoundInterest(p, r, n);
		 System.out.println(SI);
		 System.out.println(CI);
		
	}
}
