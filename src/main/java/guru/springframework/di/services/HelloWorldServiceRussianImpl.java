package guru.springframework.di.services;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 7:08 PM
 */
public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Привет мир";
    }
}
