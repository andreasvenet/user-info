package com.example.userinfo.service;

import com.example.userinfo.model.Device;
import com.example.userinfo.model.Employee;
import com.example.userinfo.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;
    @Autowired
    public DeviceService(DeviceRepository deviceRepository){
        this.deviceRepository=deviceRepository;
    }

    public Device createDevice(Device device){
        return deviceRepository.save(device);
    }

    public Optional<Device> getDeviceById(String serialNumber){
        return deviceRepository.findById(serialNumber);
    }

    public List<Device> getAll(){

        return (List<Device>) deviceRepository.findAll();
    }


}
