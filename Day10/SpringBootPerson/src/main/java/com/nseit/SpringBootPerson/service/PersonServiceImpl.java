package com.nseit.SpringBootPerson.service;

import com.nseit.SpringBootPerson.model.Person;
import com.nseit.SpringBootPerson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PersonServiceImpl {
    @Autowired
    private PersonRepository personRepository;


    public void addPerson(Person person) {
        ArrayList<Person> persons = personRepository.getPersons();
        persons.add(person);

    }

    public void viewPerson() {
        for (Person person : personRepository.getPersons()) {
            System.out.println(person.getId() + " . " + person.getName() + " . " + person.getAge() +
                    " . " + person.getDesignation());
        }
    }


    public void updatePerson(int id) {
        for (Person person : personRepository.getPersons()) {
            if (id == person.getId()) {
                person.setCompleted(true);
            }
        }
    }

    public void removePerson(int id) {
        for (Person person : personRepository.getPersons()) {
            if (id == person.getId()) {
                personRepository.getPersons().remove(person);
                break;
            }

        }
    }
}
