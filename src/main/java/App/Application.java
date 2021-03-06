package App;

import App.config.ApplicationConfig;
import App.model.Letter;
import App.repository.BranchRepository;
import App.repository.CourierRepository;
import App.services.DayService;
import App.services.springData.BranchService;
import App.services.springData.DeliveryService;
import App.services.springData.LetterService;
import App.services.springJPA.BranchServiceJPA;
import App.services.springJPA.DeliveryServiceJPA;
import App.services.springJPA.LetterServiceJPA;
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
        LetterService letterService = context.getBean(LetterService.class);
        LetterServiceJPA letterServiceJPA = context.getBean(LetterServiceJPA.class);
        BranchService branchService = context.getBean(BranchService.class);
        BranchServiceJPA branchServiceJPA = context.getBean(BranchServiceJPA.class);
        DeliveryService deliveryService = context.getBean(DeliveryService.class);
        DeliveryServiceJPA deliveryServiceJPA = context.getBean(DeliveryServiceJPA.class);
        Letter letter = new Letter();
        dayService.start(letterService, branchService, deliveryService);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        dayService.startJPA(letterServiceJPA, branchServiceJPA, deliveryServiceJPA);

    }

}
