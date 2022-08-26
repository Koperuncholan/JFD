package com.nseit.SpringBootRelations.controller;

import com.nseit.SpringBootRelations.model.Owner;
import com.nseit.SpringBootRelations.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @PostMapping
    public void add(Owner owner) {
        ownerService.add(owner);
    }


    @GetMapping("/all")
    public List<Owner> view() {
        return ownerService.view();
    }

}


