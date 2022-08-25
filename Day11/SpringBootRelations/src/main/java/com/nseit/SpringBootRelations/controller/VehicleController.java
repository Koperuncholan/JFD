package com.nseit.SpringBootRelations.controller;

import com.nseit.SpringBootRelations.model.Vehicle;
import com.nseit.SpringBootRelations.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vehicle")
@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public void add(Vehicle vehicle) {
        vehicleService.add(vehicle);
    }

    @PutMapping
    public void update(Vehicle vehicle) {
        vehicleService.update(vehicle);
    }

    @GetMapping("/all")
    public void view() {
        vehicleService.view();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        vehicleService.delete(id);
    }

}
