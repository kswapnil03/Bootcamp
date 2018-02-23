package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Question3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Author person=session.get(Author.class,2);
        person.setDob("03-06-1995");
        Author personA=session.get(Author.class,5);
        personA.setDob("12-65-1995");
        session.update(person);
        session.update(personA);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("Hello World 1234 !!!!");
    }
}
