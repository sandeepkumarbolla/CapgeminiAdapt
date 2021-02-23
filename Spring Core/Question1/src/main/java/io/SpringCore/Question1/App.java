package io.SpringCore.Question1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Customer customer= (Customer) context.getBean("Customer");
        customer.getCustomerName();
        customer.getCustomerNumber();
        customer.getCustomerId();
        Address address= (Address) context.getBean("Address");
        address.getAddress();
        
    }
}
