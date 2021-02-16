class ArmstrongNumBetweenRange {
	public int[] armstrongNumbersInRange(int min , int max)
	 {
		int lower, upper, i, temp1, temp2, rem, num = 0,j=0;;
        float sum_pow = 0.0f;
        int [] answer=new int[4];
	  for( i=min+1;i<=max;i++)
	  {
		temp1=temp2=i;
	      while(temp1!=0)
	      {
	         temp1 /=10; ++num;
	       }
	      while(temp2 !=0)
	      {
	           rem=temp2 %10;
	           sum_pow +=Math.pow(rem,num);
	           temp2 /=10;
	       }
	      if((int)sum_pow ==i)
	        {
	           answer[j]=i;
	           j++;
	        }
	        num=0;
	        sum_pow=0;
	  }
	return answer;
	  }
}

public class Assignment1Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minimum=100;
		int maximum=999;
		ArmstrongNumBetweenRange h=new ArmstrongNumBetweenRange();
		int answer[]=h.armstrongNumbersInRange(minimum, maximum);
		for(int i=0;i<answer.length;i++)
		{
			if(answer[i]!=0)
	    	   {
	    		   System.out.println(answer[i]);   
	    	   }
		}
	}

}
