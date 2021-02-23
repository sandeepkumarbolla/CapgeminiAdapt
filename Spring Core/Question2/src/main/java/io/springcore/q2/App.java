package io.springcore.q2;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringQ2.xml");
        Question question1 = (Question)context.getBean("Question1");
        Question question2 = (Question)context.getBean("Question2");
        ArrayList<Question> answersList = new ArrayList<Question>();
        answersList.add(question1);
        answersList.add(question2);
        ArrayList<String> l = new ArrayList();
        HashSet<String> h= new HashSet();
        HashMap<String,String>h1= new HashMap();
        for(Question w: answersList) {
        	h1.put(w.question,w.answer);
        
        }
        for(Question q: answersList) {
        	l.add(q.answer);
        
        }
        for(Question a:answersList) {
        	h.add(a.answer);
        }
        System.out.println("In form of List");
        System.out.println(l);
        System.out.println("------------------------------------");
       System.out.println("in form of set");
        System.out.println(h);
        System.out.println("------------------------------------");
        System.out.println("in form of Map");
        System.out.println(h1);
        System.out.println("------------------------------------");
       System.out.println("Printing all Question and answers");
       question1.getQuestionId();
       question1.getQuestion();
      question1.getAnswer();
     question2.getQuestionId();
     question2.getQuestion();
     question2.getAnswer();  
       
    }
}
