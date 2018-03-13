package Question1;

import org.springframework.context.ApplicationEvent;


public class CustomEvent extends ApplicationEvent{
    private Employee employee;
    CustomEvent(Object object, Employee employee) {
        super(object);
        this.employee=employee;
    }

    public void function()
    {
        if(employee.salary>30000)
            System.out.println("salary greater than 30000"+employee.name);
    }

}
