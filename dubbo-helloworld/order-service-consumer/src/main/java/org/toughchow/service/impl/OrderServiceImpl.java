package org.toughchow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.toughchow.pojo.User;
import org.toughchow.service.OrderService;
import org.toughchow.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public User getUserInfo() {
        User user = userService.getUserById(1);
        System.out.println(user.toString());
        return user;
    }
}
