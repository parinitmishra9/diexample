package guru.springframework.di.services;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 7:07 PM
 */
public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello Welt";
    }
}
