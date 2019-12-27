package guru.springframework.di.services;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 7:06 PM
 */
public class HelloWorldServiceFrenchImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Bonjour le monde";
    }
}
