package guru.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:23 PM
 */
@Component
@Profile( {"english", "default"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Hello World";
    }
}
