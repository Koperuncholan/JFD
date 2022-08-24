package com.nseit.SpringBootPerson;

import com.nseit.SpringBootPerson.model.Person;
import com.nseit.SpringBootPerson.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPersonApplication implements CommandLineRunner {
    @Autowired
    private PersonServiceImpl personService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootPersonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person persons = new Person(1,"Ashith",27,"Trainer",false);
        Person persons1 = new Person(2,"Sachin",22,"Trainee Associate System Analyst",false);
        Person persons2 = new Person(3,"KoperunCholan",21,"Trainee Associate System Analyst",false);
        personService.addPerson(persons);
        personService.addPerson(persons1);

        personService.viewPerson();

        personService.updatePerson(1);
        personService.addPerson(persons2);
        personService.updatePerson(3);


        personService.removePerson(3);
        personService.viewPerson();
    }
}
