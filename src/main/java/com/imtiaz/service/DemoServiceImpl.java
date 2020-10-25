package com.imtiaz.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "This WelcomeMessage is from === welcome3_and_welcomeMessage3_fromInterface";
    }
}
