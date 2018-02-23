package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
//
//          //Question 1 create table initially
//        Author author1 = new Author();
//        author1.setId(1);
//        author1.setAge(20);
//        author1.setFname("swapnil");
//        author1.setLname("khanna");
//        session.save(author1);
//
//        Author author2 = new Author();
//        author2.setId(5);
//        author2.setAge(21);
//        author2.setFname("pushkar");
//        author2.setLname("singh");
//        session.save(author2);

//        //get
//        Author person=session.get(Author.class,1);
//        //update
//        Author person=session.get(Author.class,1);
//        person.setFname("Updated Name");
//        session.update(person);
//        System.out.println(person);
//        //delete
//        Author person=session.get(Author.class,1);
//        session.delete(person);

//        //Question 10
//        Author author3=new Author();
//        Address address=new Address();
//        author3.setId(4);
//        author3.setAge(22);
//        author3.setFname("archit");
//        author3.setLname("chauhan");
//        author3.setDob("27-7-1996");
//        address.setState("up");
//        address.setStreet_No(4);
//        address.setLoc("Itc road");
//        author3.setAddress(address);
//        session.save(author3);

        //Question12
        Author obj1=session.get(Author.class,1);
        List<String> listA=new ArrayList<String>();
        listA.add("abc");
        listA.add("def");
        listA.add("ghi");
        session.update(obj1);

        Author obj2=session.get(Author.class,2);
        List<String> listB=new ArrayList<String>();
        listB.add("abc");
        listB.add("def");
        listB.add("ghi");
        session.update(obj2);

        Author obj3=session.get(Author.class,3);
        List<String> listC=new ArrayList<String>();
        listC.add("abcdd");
        listC.add("defdd");
        listC.add("ghidd");
        session.update(obj3);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("Hello World 1234 !!!!");
    }
}
