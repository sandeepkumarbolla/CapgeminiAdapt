abstract class Sample
{
    int n;
}
abstract class Assignment extends Sample
{
    abstract public int x();}

class A extends Assignment
{
    public int x()
    {
        n=50;
        return n;
    }
}
public class Assignment2Q4 {
    public static void main(String[] args) {
        A obj=new A();
        int d=obj.x();
        System.out.println(d);
    }
}
