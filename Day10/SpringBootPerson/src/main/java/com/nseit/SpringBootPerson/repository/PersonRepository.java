package com.nseit.SpringBootPerson.repository;

import com.nseit.SpringBootPerson.model.Person;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository
public class PersonRepository {
    ArrayList<Person> persons = new ArrayList<>();
}
