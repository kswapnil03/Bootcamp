package Q4;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config4.xml");
        Service service=applicationContext.getBean(Service.class);

       service.depMethod();


    }
}
