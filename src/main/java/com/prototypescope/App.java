package com.prototypescope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Message message = ac.getBean("message", Message.class);

        /**Setting the object properties */
        message.setId(1001);
        message.setMessage("Hello world!");
        System.out.println(message.toString());

        /** Retrieve it again.*/
        Message message2 = ac.getBean("message", Message.class);
        System.out.println(message2.toString());

        /** Closing the context object */
        ((AbstractApplicationContext)ac).close();
    }
}
