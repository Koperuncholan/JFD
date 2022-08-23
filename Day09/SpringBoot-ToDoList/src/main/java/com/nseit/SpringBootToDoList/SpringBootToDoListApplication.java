package com.nseit.SpringBootToDoList;

import com.nseit.SpringBootToDoList.model.ToDo;
import com.nseit.SpringBootToDoList.repository.ToDoRepository;
import com.nseit.SpringBootToDoList.service.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootToDoListApplication implements CommandLineRunner {

    @Autowired
    private ToDoServiceImpl toDoService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootToDoListApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ToDo toDo = new ToDo(1, "abcd", false);
        ToDo toDo1 = new ToDo(2, "efgh", false);
        ToDo toDo2 = new ToDo(3, "ijkl", false);
        toDoService.addToDo(toDo);
        toDoService.addToDo(toDo1);
        toDoService.addToDo(toDo2);

        toDoService.viewToDo();

        toDoService.updateToDo(1);
        toDoService.removeToDo(2);
        toDoService.viewToDo();
    }
}
