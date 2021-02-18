package com.example.userinfo.controller;

import com.example.userinfo.model.Device;
import com.example.userinfo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("device")
public class DeviceController {
    private DeviceService deviceService;
    @Autowired
    public DeviceController(DeviceService deviceService){
        this.deviceService = deviceService;
    }

    @PostMapping(path = "/devices", consumes = "application/json", produces = "application/json")
    public Device addDevice(@RequestBody Device device){
        return deviceService.createDevice(device);
    }

    @GetMapping(path="/devices/{id}", produces = "application/json")
    public Optional<Device> getDevice(@PathVariable String id) throws ResourceNotFoundException {
        return deviceService.getDeviceById(id);
    }



}
