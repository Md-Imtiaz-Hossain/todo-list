package com.imtiaz.service;

import com.imtiaz.model.TodoData;
import com.imtiaz.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();

}
