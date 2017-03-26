package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApplication {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author author1 = new Author();
        author1.setFirstName("Sargam");
        author1.setLastName("Sachdeva");
        session.save(author1);//create

        Author author2 = new Author();
        author2.setFirstName("Ankit");
        author2.setLastName("Kumar");
        session.save(author2);//create

        Author author3 = session.get(Author.class,1);//read data
        author3.setFirstName("updated emp sar");
        session.update(author3);//update
        session.delete(author3);//delete

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        System.out.println(author3);
        System.out.println("Hello World 1234 !!!!");


    }
}
