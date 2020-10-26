package com.imtiaz.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    private static int idValue = 1;

    public List<TodoItem> itemList = new ArrayList<>();

    public TodoData() {
        addItem(new TodoItem("One", "One details", LocalDate.now()));
        addItem(new TodoItem("Two", "Two details", LocalDate.now()));
        addItem(new TodoItem("Three", "Three details", LocalDate.now()));
    }



    public void addItem(@NonNull TodoItem toAdd){
        toAdd.setId(idValue);
        itemList.add(toAdd);
        idValue++;
    }

    public void updateItem(@NonNull TodoItem toUpdate){
        ListIterator<TodoItem> listIterator = itemList.listIterator();

        while (listIterator.hasNext()){
            TodoItem todoItem = listIterator.next();

            if (todoItem.equals(toUpdate)){
                listIterator.set(toUpdate);
                break;
            }
        }
    }

    public void removeItem(int id){
        ListIterator<TodoItem> listIterator = itemList.listIterator();

        while (listIterator.hasNext()){
            TodoItem todoItem = listIterator.next();

            if (todoItem.getId() == id ){
                listIterator.remove();
                break;
            }
        }


    }

    public List<TodoItem> items(){
        return Collections.unmodifiableList(itemList);

    }

    public TodoItem item(int id){

        for (TodoItem item : itemList){
            if (item.getId()==id){
                return item;
            }
        }
        return null;
    }



}
