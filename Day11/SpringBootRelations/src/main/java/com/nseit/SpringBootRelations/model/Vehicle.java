package com.nseit.SpringBootRelations.model;

import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer number;
   // @ManyToOne(optional = false)
    //@JoinColumn(name = "owner_id", nullable = false, referencedColumnName = "id")
    //private Owner owner;

}
