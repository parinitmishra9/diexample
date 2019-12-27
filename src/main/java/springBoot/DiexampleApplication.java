package springBoot;

import guru.springframework.di.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("guru.springframework")
@ImportResource("classpath:/spring/spring-config.xml")
public class DiexampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiexampleApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.sayHello();
    }

}
