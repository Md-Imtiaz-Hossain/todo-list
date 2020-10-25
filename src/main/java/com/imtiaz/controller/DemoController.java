package com.imtiaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-list/hello2
    @ResponseBody
    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }


    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
    // http://localhost:8080/todo-list/database
    @GetMapping("database")
    public String database() {
        return "database";
    }



    // http://localhost:8080/todo-list/welcome
    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
     @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }





}
