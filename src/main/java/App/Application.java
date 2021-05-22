package App;

import App.config.ApplicationConfig;
import App.repository.BranchRepository;
import App.repository.CourierRepository;
import App.services.DayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "App")
public class Application {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        DayService dayService = context.getBean(DayService.class);

        dayService.start();

    }

}
