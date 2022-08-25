package com.nseit.SpringBootRelations.service;

import com.nseit.SpringBootRelations.model.Vehicle;
import com.nseit.SpringBootRelations.repository.OwnerRepository;
import com.nseit.SpringBootRelations.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public void add(Vehicle vehicle) {
        vehicleRepository.save(vehicle);

    }

    public List<Vehicle> view() {
        return vehicleRepository.findAll();
    }

    public void update(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public void delete(int id) {
        for(Vehicle vehicle : vehicleRepository.findAll()){
            if(id == vehicle.getId()){
                vehicleRepository.delete(vehicle);
                break;
            }
        }
    }


}
