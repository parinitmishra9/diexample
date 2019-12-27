package guru.springframework.di.controllers;

import guru.springframework.di.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:21 PM
 */
//@Controller       -> defined in xml config
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceGerman;
    private HelloWorldService helloWorldServiceFrench;


    public void setHelloWorldService(@Qualifier("helloWorldServicePolish") HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }


    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }


    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());

        return greeting;
    }
}
