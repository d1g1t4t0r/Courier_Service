package App;

import App.config.ApplicationConfig;
import App.domain.Branch;
import App.domain.Courier;
import App.domain.Delivery;
import App.domain.Letter;
import App.repository.BranchRepository;
import App.repository.CourierRepository;
import App.repository.DeliveryRepository;
import App.repository.LetterRepository;
import App.services.DayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(
        basePackageClasses = {DayService.class,
                ApplicationConfig.class,
                BranchRepository.class,
                CourierRepository.class})
public class Application {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        DayService dayService = context.getBean(DayService.class);

        dayService.start();

    }

}
