//package com.hibernate.demo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class Question2 {
//    public static void main(String[] args) {
//        //create
////        Author person=new Author();
////        person.setFname("Hibernate");
////        person.setId(2);
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//
//
////
////        //update
////        Author person=session.get(Author.class,1);
////        person.setFname("Updated Name");
////        session.update(person);
////        System.out.println(person);
////        //delete
////        Author person=session.get(Author.class,1);
////        session.delete(person);
//
//
//
//
//
//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();
//        System.out.println("Hello World 1234 !!!!");
//    }
//}
