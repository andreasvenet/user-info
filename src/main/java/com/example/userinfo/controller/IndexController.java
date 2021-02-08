package com.example.userinfo.controller;

import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import com.example.userinfo.repository.UserRepository;
import com.example.userinfo.service.AddressService;
import com.example.userinfo.service.ResourceAlreadyExistsException;
import com.example.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @Autowired
    UserRepository repository;
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String home(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "display", method = RequestMethod.GET)
    public String display(ModelMap model) {

        model.addAttribute("names", userService.getAll());

        return "display";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(ModelMap model) {
        User user = new User();
        Address address = new Address();
        model.addAttribute("user",user);
        model.addAttribute("address", address);
        return "register";
    }

    @PostMapping("/register")
    public void submitForm(@ModelAttribute("user") User user, @ModelAttribute("address") Address address) throws ResourceAlreadyExistsException {
        userService.createUser(user);
        if (address.getHomeAddress()!="" || address.getWorkAddress()!=""){
            addressService.createAddress(address);
        }



    }

}
