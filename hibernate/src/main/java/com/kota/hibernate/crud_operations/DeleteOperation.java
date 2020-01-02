package com.kota.hibernate.crud_operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteOperation {
    public static void main(String[] args) {
    System.out.println("Entered Main");
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        //UserDetails userDetails = session.get(UserDetails.class, 9);
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);

        session.delete(userDetails);
        session.getTransaction().commit();
        session.close();
        System.out.println("userDetails.toString() = " + userDetails.toString());

    System.out.println("Exist Main");
    }

}
