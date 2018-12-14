package org.toughchow.bootorderserviceconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.toughchow.pojo.User;
import org.toughchow.service.OrderService;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootOrderServiceConsumerApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	public void contextLoads() throws IOException {
		User userInfo = orderService.getUserInfo();
		System.out.println(userInfo.toString());
		System.in.read();
	}

}

