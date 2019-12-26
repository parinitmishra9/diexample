package guru.springframework.di.controllers;

import guru.springframework.di.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:21 PM
 */
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceGerman;
    private HelloWorldService helloWorldServiceFrench;

    @Autowired
    public void setHelloWorldService(@Qualifier("helloWorldServicePolish") HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreetings();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreetings());
        System.out.println(helloWorldServiceFrench.getGreetings());

        return greeting;
    }
}
