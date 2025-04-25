package u.l.m;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpId(12);
        e1.setName("Bablu");

        Laptop l1 = new Laptop();
        l1.setLapId(100);
        l1.setLaptopName("HP");
        l1.setEmployee(e1);

        Laptop l2 = new Laptop();
        l2.setLapId(101);
        l2.setLaptopName("Acer");
        l2.setEmployee(e1);

        Laptop l3 = new Laptop();
        l3.setLapId(102);
        l3.setLaptopName("Dell");
        l3.setEmployee(e1);

        List<Laptop> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        e1.setLpts(list);
       l1.setEmployee(e1);
       l2.setEmployee(e1);
       l3.setEmployee(e1);

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();
        session.close();
    }
}
