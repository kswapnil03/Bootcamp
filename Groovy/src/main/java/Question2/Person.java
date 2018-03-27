package Question2;

public class Person {
    String name;
    int age;
    String gender;
    String address;

    public String getName() {
        System.out.println("abcd");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class result {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("swapnil");
        p.setAge(23);
        p.setAddress("saharanpur");
        p.setGender("male");

        System.out.println(p.getName() + " " + p.getAge() + " " + p.getGender() + " " + p.getAddress());

        System.out.println(p.name + " " + p.age + " " + p.gender + " " + p.address);
    }
}



