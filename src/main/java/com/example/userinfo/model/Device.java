package com.example.userinfo.model;

import javax.persistence.*;

@Entity
@Table(name = "device")
public class Device {

    @Id
    private String serialNumber;
    @Column(nullable = true)
    private String description;
    @Column(nullable = false)
    private Integer type;
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = true)
    private Employee employee;

    public Device() {
    }

    public Device(String serialNumber, String description, Integer type) {
        this.serialNumber = serialNumber;
        this.description = description;
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
