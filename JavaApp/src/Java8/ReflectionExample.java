package Java8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Simple {
    private String name;

    public Simple(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

public class ReflectionExample {
    public static void main(String args[]) {

        Simple employee = new Simple("Shreyansh");
        Class employeeClass = employee.getClass();
        Field[] fields = employeeClass.getDeclaredFields();
        Method[] methods = employeeClass.getMethods();
        for (Field f : fields) {
            System.out.println(f);
        }
        for (Method m : methods) {
            System.out.println(m);
        }

    }
}








