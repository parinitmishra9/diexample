package guru.springframework.di.services;

import guru.springframework.di.services.HelloWorldService;
import org.springframework.stereotype.Component;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:23 PM
 */
@Component
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Hello World";
    }
}
