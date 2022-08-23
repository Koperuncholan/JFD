package com.nseit.SpringBootToDoList.service;

import com.nseit.SpringBootToDoList.model.ToDo;
import com.nseit.SpringBootToDoList.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoServiceImpl {
    @Autowired
    private ToDoRepository toDoRepository;

    public void addToDo(ToDo toDo) {
        ArrayList<ToDo> toDos = toDoRepository.getToDos();
        toDos.add(toDo);
    }

    public void viewToDo() {
        for (ToDo todo : toDoRepository.getToDos()) {
            System.out.println(todo.getId() + " . " + todo.getName() +
                    " Completed Status - " + (todo.isCompleted() ? "Yes" : "No"));

        }
    }

    public void updateToDo(int id) {
        for (ToDo toDo : toDoRepository.getToDos()) {
            if (id == toDo.getId()) {
                toDo.setCompleted(true);
                break;
            }

        }
    }

    public void removeToDo(int id) {
        for (ToDo toDo : toDoRepository.getToDos()) {
            if (id == toDo.getId()) {
                toDoRepository.getToDos().remove(toDo);
            }

        }
    }

}

