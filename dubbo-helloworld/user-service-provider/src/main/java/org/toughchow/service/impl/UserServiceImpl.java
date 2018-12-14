package org.toughchow.service.impl;

import org.springframework.stereotype.Service;
import org.toughchow.pojo.User;
import org.toughchow.service.UserService;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {

    private static HashMap<Integer, User> userMap = new HashMap<>();
    static {
        userMap.put(1, new User(1,"tough","Betough"));
        userMap.put(2, new User(2,"rikey","Bericky"));
    }

    public User getUserById(Integer id) {
        User user = userMap.get(id);
        return user;
    }
}
