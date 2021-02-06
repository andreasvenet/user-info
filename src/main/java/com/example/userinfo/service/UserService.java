package com.example.userinfo.service;


import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import com.example.userinfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void CreateUser(User user, Address address){
        var userId = user.getId();


    }
}
