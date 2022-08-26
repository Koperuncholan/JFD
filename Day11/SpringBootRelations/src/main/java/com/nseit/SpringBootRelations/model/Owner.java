package com.nseit.SpringBootRelations.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
@Data
@Entity
//@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue
    private int ownerId;
    private String ownerName;
    //@OneToMany(mappedBy = "owner",cascade = CascadeType.ALL)
    //private List<Vehicle> vehicles;
}
