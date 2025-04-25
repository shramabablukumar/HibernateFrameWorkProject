package g.h.k;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Creating Employee instance
        Employee emp = new Employee();
        emp.setEmpName("Rahul Sharma1");
        emp.setUserName("Ramayana1");
        emp.setPassword("Tara@20211");
        Address Sp = new Address();
        Sp.setCity("Patna1");
        Sp.setState("Bihar1");
        Sp.setCountry("India1");
        emp.setA(Sp);
        
       
       
        
       

        // Hibernate SessionFactory and Session
        SessionFactory sessionFactory = null;
        Session session = null;

        try {
            // Configure SessionFactory using hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();

            // Open a session
            session = sessionFactory.openSession();
            session.beginTransaction();

            // Save the employee object
            session.save(emp);

            // Commit the transaction
            session.getTransaction().commit();
            System.out.println("Employee saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            if (session != null && session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) session.close();
            if (sessionFactory != null) sessionFactory.close();
        }
    }
}
