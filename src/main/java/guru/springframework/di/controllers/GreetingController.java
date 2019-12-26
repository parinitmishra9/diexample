package guru.springframework.di.controllers;

import guru.springframework.di.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:21 PM
 */
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public GreetingController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreetings();
        System.out.println(greeting);
        return greeting;
    }
}
