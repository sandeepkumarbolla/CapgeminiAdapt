import java.util.*;

class Login {
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        String message=" ";
        String success="Welcome Ajay";
        String unsucess="login_unsuccesful";
        if(user.equals(userId)&&pass.equals(password))
        {
            message=success;
        }
        else
        {

            message=unsucess;
        }
        return message;
    }
}
public class Assignment1Q6
{
    public static void main(String[] args) {
        int i=0;
        System.out.println("Enter userId\n");
        Scanner s=new Scanner(System.in);
        String input=s.next();

        System.out.println("Enter password\n");
        Scanner j=new Scanner(System.in);
        String code=j.next();

        Login h=new Login();
        while(i!=4)
        {
            if((h.loginUser(input,code).equals("login_Successful")))
            {
                System.out.println("welcome Ajay");
                break;
            }
            else
            {
                if(i==2)
                {
                    System.out.println("You have enetered wrong credentials 3 times\n Contact Admin ");
                    break;
                }
                else
                {
                    i++;
                    System.out.println("You have enetered wrong credentials, please enter the righrt credentials");
                    System.out.println("Enter userId\n");
                    input=s.next();
                    System.out.println("Enter password\n");
                    code=j.next();
                    h.loginUser(input,code);
                }
            }
        }
    }
}
