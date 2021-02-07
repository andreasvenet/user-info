package com.example.userinfo.controller;


import com.example.userinfo.model.Address;
import com.example.userinfo.service.AddressService;
import com.example.userinfo.service.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {
    private AddressService service;
    @Autowired
    public AddressController(AddressService service){
        this.service = service;
    }

    @PostMapping(path = "/addresses", consumes = "application/json", produces = "application/json")
    public Address addAddress(@RequestBody Address address){
        return service.createAddress(address);
    }

    @GetMapping(path="/addresses/{id}", produces = "application/json")
    public Address getAddress(@PathVariable Integer id) throws ResourceNotFoundException {
        return service.getAddressById(id);
    }
}
