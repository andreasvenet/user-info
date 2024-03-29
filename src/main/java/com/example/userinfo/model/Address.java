package com.example.userinfo.model;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String homeAddress;
    @Column
    private String workAddress;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Address() {

    }

    public Address(String homeAddress, String workAddress, User user){
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.user = user;
    }

    public Address(Integer id, String homeAddress, String workAddress, User user) {
        this.id = id;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
