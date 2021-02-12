package com.example.userinfo.service;

import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import com.example.userinfo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;
    @Autowired
    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public Address createAddress(Address address) {
//        Optional<Address> aAddress = addressRepository.findById(address.getId());
//        if(aAddress.isEmpty()){
//            return addressRepository.save(address);
//        }
//        else {
//            throw new ResponseStatusException(HttpStatus.FOUND, "Address Already Exists");
//        }
        return addressRepository.save(address);
    }

    public Address getAddressById(Integer id) throws ResourceNotFoundException {
        Optional<Address> aAddress = addressRepository.findById(id);
        if(!aAddress.isEmpty()){
            return aAddress.get();
        }
        else {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND, "Address Does Not Exist");
        }
    }

    public List<Address> getAll(){

        return (List<Address>) addressRepository.findAll();
    }

    public Address findByUser(User user){
        Optional<Address> aAddress = addressRepository.findByUser(user);
        if(!aAddress.isEmpty()){
            return aAddress.get();
        }
        else {
            return new Address();
        }
    }

}
