package i.m.h;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        State S = new State();
        S.setS_id(11);
        S.setS_Name("Bihar");
        
        Capital C = new Capital();
        C.setC_id(54);
        C.setC_Name("Patna");
        
        S.setC1(C);
        C.setS1(S);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(S);
        session.save(C);
        session.getTransaction().commit();
       
    }
}
