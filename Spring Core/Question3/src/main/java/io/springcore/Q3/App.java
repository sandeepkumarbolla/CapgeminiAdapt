package io.springcore.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring3.xml");
        Controller b = (Controller)context.getBean("controller");
        b.deposit(12244L,10000);
        b.getBalance(12244L);
    }
}
