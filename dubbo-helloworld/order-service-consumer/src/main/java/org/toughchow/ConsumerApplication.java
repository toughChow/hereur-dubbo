package org.toughchow;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.toughchow.pojo.User;
import org.toughchow.service.OrderService;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class ConsumerApplication
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = context.getBean(OrderService.class);
        User user = orderService.getUserInfo();
        System.out.println(user.toString());
        System.in.read();

    }
}
