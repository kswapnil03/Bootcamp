package Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config1.xml");
        Service service=applicationContext.getBean(Service.class);
        service.setName("swapnil");
        service.getName();
        service.setId(20);
        service.getId();

    }
}
