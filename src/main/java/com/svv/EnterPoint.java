package com.svv;

import com.svv.entity.User;
import com.svv.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Evgeniy");
        user.setLastName("Vinogradov");
        user.setComplaints("bad breakfast");

        session.save(user);
        session.getTransaction().commit();
    }

}
