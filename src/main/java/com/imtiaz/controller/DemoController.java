package com.imtiaz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    // Directly print through methode Body
    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    // Directly print through methode Body
    // http://localhost:8080/todo-list/hello2
    @ResponseBody
    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    // Print through jsp file...
    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
    // http://localhost:8080/todo-list/database
    @GetMapping("database")
    public String database() {
        return "database";
    }


    // One type of create Model Attributes
    // http://localhost:8080/todo-list/welcome
    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
     @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("user", "Imtiaz");   //Model addAttribute(String var1, @Nullable Object var2);
         log.info("model = {}",model);
        return "welcome";
    }


    // @GetMapping name ==(is not mandatory) return Value (When working with 1 Model Attributes)
    // @GetModelAttributes name ==(is not mandatory) methode name (When working with 1 Model Attributes)
    // Another type of create Model Attributes
    // http://localhost:8080/todo-list/welcomeMessage
    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
    @GetMapping("welcomeMessage")
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return "welcome to this demo application";
    }



    // @GetMapping name == return Value (When combine of 2 Model Attributes)
    // Combinations of two type Model Attributes
    // http://localhost:8080/todo-list/welcome2_and_welcomeMessage2
    @GetMapping("welcome2_and_welcomeMessage2")
    public String welcome2(Model model) {
        model.addAttribute("user", "Imtiaz");
        log.info("model = {}",model);
        return "welcome2_and_welcomeMessage2";
    }
    // @GetModelAttributes name == methode name (When combine of 2 Model Attributes)
    @ModelAttribute("welcomeMessage2")
    public String welcomeMessage2() {
        log.info("welcomeMessage2() called");
        return "welcome to this demo application 2";
    }




}
