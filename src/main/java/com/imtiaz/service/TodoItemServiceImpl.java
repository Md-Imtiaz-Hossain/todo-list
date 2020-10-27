package com.imtiaz.service;

import com.imtiaz.model.TodoData;
import com.imtiaz.model.TodoItem;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TodoItemServiceImpl implements TodoItemService {


    @Getter
    private final TodoData todoData = new TodoData();

    @Override
    public void addItem(TodoItem toAdd) {
        todoData.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        todoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        todoData.updateItem(toUpdate);
    }

    @Override
    public TodoData getData() {
        return todoData ;
    }


}
