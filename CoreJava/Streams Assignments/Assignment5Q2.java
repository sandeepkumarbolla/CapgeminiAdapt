import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;
public class Assignment5Q2 {
    public static void main(String[] args)
    {
        List<News> list = new ArrayList<>();
        Scanner ss= new Scanner(System.in);
        System.out.print("enter the number of news you want to enter : ");
        int n= ss.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("enter id of news "+i+" : ");
            int id= ss.nextInt();
            System.out.print("enter the postedByUser of news "+i+" : ");
            String posteduser= ss.next();
            System.out.print("enter the commentByUser of news "+i+": ");
            String cuser= ss.next();
            System.out.print("enter comment of news "+i+" : ");
            String comment= ss.next();
            System.out.println("--------------------------------------------");
            list.add(new News(id,posteduser,cuser,comment));
        }
        System.out.println(" which newsId has received the maximum comments : "+maxComments(list));
        System.out.println("how many times the word 'budget' arrived in user comments all news : "+budgetCount(list));
        System.out.println("user has posted maximum comments : "+maxCommentsByUser(list));
        sortMaxCommentsByUser(list).forEach((k,v)-> System.out.println(k+"  "+v));
    }
    public static int maxComments(List<News> news)
    {
        int max=0;
        int x=0;
        for (News n: news) {
            int c=0;
            for (News m: news){
                if ((m.getNewsId()) == (n.getNewsId()))
                {
                    c++;
                }
            }
            if(c>max) {
                max=c;
                x=n.getNewsId();
            }
        }
        return x;
    }
    public static int budgetCount (List < News > news)
    {
        int c=0;
        for (News n: news)
        {
            c+=count(n.getComment());
        }
        return c;
    }
    public static String maxCommentsByUser (List < News > news)
    {
        String a="";
        int max=0;
        for (News n: news) {
            int c=0;
            for (News m: news){
                if ((m.getCommentByUser()).equals(n.getCommentByUser()))
                {
                    c++;
                }
            }
            if(c>max){ a=n.getCommentByUser();  max=c; }
        }
        return a;
    }
    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news)
    {
        Map<String,Integer> map=new LinkedHashMap<>();
        for (News n: news)
        {
            int c=0;
            for (News m: news)
            {
                if ((m.getCommentByUser()).equals(n.getCommentByUser()))
                {
                    c++;
                }
            }
            map.put(n.getCommentByUser(),c);
        }
        Map<String,Integer> s = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,LinkedHashMap::new));
        return s;
    }
    public static int count(String a)
    {
        String[] arr =a.split(" ");
        int c = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if ("budget".equals(arr[j])) {c++;}
        }
        return c;
    }
}
class News
{
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        super();
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }
    public int getNewsId()
    {
        return newsId;
    }
    public String getPostedByUser()
    {
        return postedByUser;
    }
    public String getCommentByUser()
    {
        return commentByUser;
    }
    public String getComment()
    {
        return comment;
    }
}
