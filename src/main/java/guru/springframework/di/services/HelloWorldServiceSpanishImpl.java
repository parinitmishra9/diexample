package guru.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:30 PM
 */
@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Hola mundo!!";
    }
}
