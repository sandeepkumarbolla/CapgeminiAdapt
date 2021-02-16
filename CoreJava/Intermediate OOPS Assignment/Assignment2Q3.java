import java.util.*;
import java.lang.*;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {return totalDeposits-creditLimit;}
}


class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {return totalDeposits+fixedDepositAmount;}
}


public class Assignment2Q3 {
    
    public int totalCashInBank(ArrayList<Integer> cash){ 
        int sum=0; 
        for (int i : cash) {sum+=i;} 
        return sum;
    }


    public int getCash(){ return 0;}


    public static void main(String[] args) {

        ArrayList<Integer> cash =new ArrayList<>();

        Assignment2Q3 obj1= new SavingsAccount();
        Assignment2Q3 obj2= new CurrentAccount();

        cash.add(obj1.getCash());
        cash.add(obj2.getCash());

        System.out.println(obj1.totalCashInBank(cash));

    }
}
