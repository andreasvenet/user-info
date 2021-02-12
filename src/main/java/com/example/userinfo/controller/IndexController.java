package com.example.userinfo.controller;

import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import com.example.userinfo.repository.UserRepository;
import com.example.userinfo.service.AddressService;
import com.example.userinfo.service.ResourceAlreadyExistsException;
import com.example.userinfo.service.ResourceNotFoundException;
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
        model.addAttribute("addresses", addressService.getAll());
        return "display";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(ModelMap model) {
        User user = new User();
        Address address = new Address();
        model.addAttribute("user", user);
        model.addAttribute("address", address);
        return "register";
    }


    @RequestMapping(value = "/details/{id}", produces = "application/json")
    public String details(@PathVariable Integer id, ModelMap model) throws ResourceNotFoundException {
        User user = userService.getUserById(id);
        model.addAttribute("name", user);
        //model.addAttribute("address", addressService.findByUser(user));
        model.addAttribute("address", addressService.findByUser(user));


        return "details";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user, @RequestParam(value = "homeAddress", required = false, defaultValue = "") String homeAddress, @RequestParam(value = "workAddress", required = false, defaultValue = "") String workAddress) throws ResourceAlreadyExistsException {
        userService.createUser(user);
        if (!homeAddress.equals("") || !workAddress.equals("")) {
            addressService.createAddress(new Address(homeAddress, workAddress, user));
        }

        return "index";

    }

}
