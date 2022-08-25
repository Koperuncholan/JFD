package com.nseit.SpringBootRelations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
@Data
@Entity

public class Owner {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
}
