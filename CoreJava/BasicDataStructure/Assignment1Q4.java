import java.lang.*;
import java.util.Scanner;
class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks)
    {
        String message=" ";
        if((subject1Marks+subject2Marks+subject3Marks)<60||subject1Marks>60||subject2Marks>60||subject3Marks>60)
        {
            message="failed";
        }
        else if((subject1Marks+subject2Marks>60)||(subject2Marks+subject3Marks>60)||(subject3Marks+subject1Marks>60))
        {
            message= "passed\npromoted";
        }
        else if ((subject1Marks+subject2Marks+subject3Marks)>60)
        {
            message="passed";
        }

        return message;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        double sub1,sub2,sub3;
        Scanner s=new Scanner(System.in);
        sub1=s.nextDouble();
        Scanner t=new Scanner(System.in);
        sub2=t.nextDouble();
        Scanner u=new Scanner(System.in);
        sub3=u.nextDouble();
        ResultDeclaration h=new ResultDeclaration();
        System.out.println(h.declareResults(sub1,sub2,sub3));
    }
}
