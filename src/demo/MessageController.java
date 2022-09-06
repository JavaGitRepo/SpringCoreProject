package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageController {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Message obj = context.getBean("msg",Message.class);
        System.out.println("Message is : "+obj.getMsg());
    }
}
