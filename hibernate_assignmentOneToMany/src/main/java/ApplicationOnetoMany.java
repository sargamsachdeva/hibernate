
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.text.DateFormat;
import java.util.List;

public class ApplicationOnetoMany {

    public static void main(String[] args) throws Exception{

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author2 author1 = new Author2();
        List<String> subjects = new ArrayList<>(Arrays.asList("java","Algorithms","Database","C#"));
        Book2 book1 = new Book2();
        Book2 book2 = new Book2();

        author1.setFirstName("Sargam");
        author1.setLastName("Sachdeva");
        author1.setDob( DateFormat.getDateInstance().parse("15 Mar, 1994"));


        Address2 address1 = new Address2();
        address1.setStreetNumber("Street-1");
        address1.setLocation("Rani Bagh");
        address1.setState("Delhi");
        author1.setAddress(address1);
        author1.setSubjects(subjects);
        book1.setBookName("Sumita arora C++");
        author1.getBook2().add(book1);
        session.save(author1);
        session.save(book1);
        Author2 author2 = new Author2();
        author2.setFirstName("Ankit");
        author2.setLastName("Kumar");
        author2.setDob( DateFormat.getDateInstance().parse("21 May, 1993"));

        Address2 address2 = new Address2();
        address2.setStreetNumber("Street-1");
        address2.setLocation("Rohini");
        address2.setState("Mumbai");
        author2.setAddress(address2);
        author2.setSubjects(subjects);
        book2.setBookName("JS Succinnity");

        author2.getBook2().add(book2);
        session.save(author2);
        session.save(book2);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        System.out.println("Hello World 1234 !!!!");


    }
}
