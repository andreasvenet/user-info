package com.example.userinfo.repository;

import com.example.userinfo.model.Address;
import com.example.userinfo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    Optional<Address> findByUser(User user);
}
