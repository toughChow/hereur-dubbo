package org.toughchow.bootorderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.toughchow.pojo.User;
import org.toughchow.service.OrderService;
import org.toughchow.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public User getUserInfo() {
        User user = userService.getUserById(1);
        System.out.println(user.toString());
        return user;
    }
}
