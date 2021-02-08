package com.example.userinfo.controller;

import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import com.example.userinfo.service.ResourceAlreadyExistsException;
import com.example.userinfo.service.ResourceNotFoundException;
import com.example.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService service;
    @Autowired
    public UserController(UserService service){
        this.service = service;
    }


    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public User addUser(@RequestBody User user) throws ResourceAlreadyExistsException {
        return service.createUser(user);
    }

    @GetMapping(path = "/users/{id}", produces = "application/json")
    public User getUser(@PathVariable Integer id) throws ResourceNotFoundException {
        return service.getUserById(id);
    }

    @GetMapping(path = "/users", produces = "application/json")
    public List<User> getUsers() throws ResourceNotFoundException {
        return service.getAll();
    }


}
