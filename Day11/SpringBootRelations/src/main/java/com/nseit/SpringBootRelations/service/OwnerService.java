package com.nseit.SpringBootRelations.service;

import com.nseit.SpringBootRelations.model.Owner;
import com.nseit.SpringBootRelations.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    public void add(Owner owner) {
        ownerRepository.save(owner);
    }

    public List<Owner> view() {
        return ownerRepository.findAll();

    }
}
