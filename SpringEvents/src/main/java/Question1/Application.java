package Question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("web.xml");
        Employee employee=configurableApplicationContext.getBean(Employee.class);

        CustomEventPublisher customEventPublisher=(CustomEventPublisher)configurableApplicationContext.getBean("customEventPublisher", CustomEventPublisher.class);
        customEventPublisher.publish(employee);
        System.out.println("successfull");
    }
}
