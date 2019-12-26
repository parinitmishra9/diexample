package guru.springframework.di.config;

import guru.springframework.di.services.HelloWorldService;
import guru.springframework.di.services.HelloWorldServiceEnglishImpl;
import guru.springframework.di.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Project diexample
 * Created by @Author Parinit on 12/26/2019
 * at 6:56 PM
 */
@Configuration
public class HelloConfig {

    @Bean
    @Profile( {"default", "english"})
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }
}
