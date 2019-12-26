package guru.springframework.di.services;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:23 PM
 */
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreetings() {
        return "Hello World";
    }
}
