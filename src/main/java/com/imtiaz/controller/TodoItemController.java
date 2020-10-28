package com.imtiaz.controller;

import com.imtiaz.model.TodoData;
import com.imtiaz.model.TodoItem;
import com.imtiaz.service.TodoItemService;
import com.imtiaz.util.AttributeNames;
import com.imtiaz.util.Mappings;
import com.imtiaz.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {

    private final TodoItemService itemService;

    @Autowired
    public TodoItemController(TodoItemService itemService) {
        this.itemService = itemService;
    }



    @ModelAttribute
    public TodoData todoData(){
        return itemService.getData();
    }


    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }



    // http://localhost:8080/todo-list/addItem
    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(Model model){
        TodoItem todoItem = new TodoItem("","", LocalDate.now());
        model.addAttribute(AttributeNames.TODO_ITEM, todoItem);
        return ViewNames.ADD_ITEM;
    }

     @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem){
        log.info("todo form from = {}", todoItem);
        itemService.addItem(todoItem);
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id, Model model){
        log.info("Deleting item with id = {}", id);
        itemService.removeItem(id);
        return "redirect:/" + Mappings.ITEMS;
    }


}
