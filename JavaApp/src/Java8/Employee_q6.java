package Java8;

import java.util.ArrayList;
import java.util.List;

class q6 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    q6(String name, Integer age)
    {
       this.name=name;
      this.age=age;
    }


}
class Employee_q6{
    public static void main(String[] args) {


        List<q6> l=new ArrayList<>();
        l.add(new q6("swapnil",24));
        l.add(new q6("nwapnil",21));
        l.add(new q6("awapnil",25));
        l.add(new q6("neelesh",25));
        l.add(new q6("pushkar",20));
        System.out.println("Required employees whose name starts with 'n' and age>24");
        l.stream().filter(p -> p.getName().startsWith("n")).filter(p->p.getAge()>24).map(p->p.getName()).forEach(System.out::println);
    }

}


