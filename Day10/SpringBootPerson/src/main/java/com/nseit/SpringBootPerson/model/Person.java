package com.nseit.SpringBootPerson.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    private int age;
    private String designation;
    private boolean isCompleted;
}
