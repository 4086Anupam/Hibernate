package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

      //   Create Object
        Student student = new Student();
        student.setRoll(7);
        student.setName("Gourish");
        student.setAge(23);

        // Create SessionFactory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Open Session
        Session session = factory.openSession();

        // Begin Transaction
       Transaction transaction = session.beginTransaction();


        // Save Object
      session.persist(student);

        // Commit Transaction
      transaction.commit();

//  System.out.println(student1);

        // Close Session
        session.close();
        factory.close();

        System.out.println("Data Saved Successfully");
    }
}