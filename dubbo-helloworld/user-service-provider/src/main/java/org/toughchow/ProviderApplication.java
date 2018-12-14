package org.toughchow;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.toughchow.pojo.User;
import org.toughchow.service.OrderService;
import org.toughchow.service.UserService;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class ProviderApplication
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        UserService userService = context.getBean(UserService.class);

        userService.getUserById(1);
        System.out.println( "Hello World!" );
        System.in.read();
    }
}
