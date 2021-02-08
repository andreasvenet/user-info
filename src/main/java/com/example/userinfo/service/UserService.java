package com.example.userinfo.service;


import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import com.example.userinfo.repository.AddressRepository;
import com.example.userinfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) throws ResourceAlreadyExistsException {
//       Optional<User> aUser = userRepository.findById(user.getId());
//       if (aUser.isEmpty()){
//           return userRepository.save(user);
//       }
//       else {
//           throw new ResponseStatusException(HttpStatus.FOUND, "User Already Exists");
//       }
       return userRepository.save(user);
    }



    public User getUserById(Integer id) throws ResourceNotFoundException {
        Optional<User> aUser = userRepository.findById(id);
        if(!aUser.isEmpty()){
            return aUser.get();
        }
        else {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND, "User Does Not Exist");
        }
    }

    public List<User> getAll(){

        return (List<User>) userRepository.findAll();
    }

}
