package io.springcore.Q9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext cap = new ClassPathXmlApplicationContext("Spring9.xml"); 
             HelloWorld hw= (HelloWorld)cap.getBean("helloworld");
         ((ConfigurableApplicationContext) cap).close();
        
    }
}
