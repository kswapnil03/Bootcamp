package Java8;

import java.io.*;

class Question2 implements java.io.Serializable {
    public String name;
    public Integer age;

    public Question2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

public class Emp {
    public static void main(String[] args) {
        Question2 object = new Question2("swapnil", 23);
        String filename = "file.ser";
        Question2 obj1 = null;

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            System.out.println("IOException is caught");
        }
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            obj1 = (Question2) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("name is " + obj1.name);
            System.out.println("age is " + obj1.age);

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
