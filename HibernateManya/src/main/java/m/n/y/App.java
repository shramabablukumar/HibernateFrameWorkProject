package m.n.y;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpid(24);
        e1.setEmplName("Kumar");

        Employee e2 = new Employee();
        e2.setEmpid(12);
        e2.setEmplName("Bablu");

        Project p1 = new Project();
        p1.setProjId(100);
        p1.setProjName("Facebook Project");

        Project p2 = new Project();
        p2.setProjId(101);
        p2.setProjName("Instagram Project");

        List<Project> projects = new ArrayList<>();
        projects.add(p1);
        projects.add(p2);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);

        // Set bidirectional relationships
        e1.setPj(projects);
        e2.setPj(projects);

        p1.setE(employees);
        p2.setE(employees);

        // Hibernate configuration
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        session.getTransaction().commit();

        session.close();
        sf.close();
    }
}
