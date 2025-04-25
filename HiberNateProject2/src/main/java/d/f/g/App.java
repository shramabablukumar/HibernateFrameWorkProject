package d.f.g;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	
    	// create
//        Employee emp = new Employee();
//        emp.setF_Name("Bablu");
//        emp.setL_Name("Sharma");
//        emp.setCity("Bihar");
//      try {
//      tr = session.beginTransaction() ;
//      session.save(emp);
//      tr.commit();
//  } catch (Exception ex) {
//      if (tr != null) tr.rollback();
//      ex.printStackTrace();  // or use Logger
//  } finally {
//      session.close();
//      st.close();
    	
//  }
    	
    	// step2 concept

        Configuration cof = new Configuration();
        cof.configure("/n/y/u/hibernate.cfg.xml");

        SessionFactory st = cof.buildSessionFactory();
        Session session = st.openSession();
        Transaction tr = session.beginTransaction();
        
        // Read
//        Employee eo1 = session.get(Employee.class, 1);
//        try {
//        	if(eo1 != null) {
//        		System.out.println("Id: + " + eo1.getId());
//        		System.out.println("First Name" + eo1.getF_Name());
//        		System.out.println("Last Name " + eo1.getL_Name());
//        		System.out.println("City Name is " + eo1.getCity());
//        	}else {
//        		System.out.println("Result is Not Found");
//        	}
//        }catch(Exception ex) {
//        	ex.printStackTrace();
//        }
        
        // update
        
//       try {
//    	   Employee eo1 = session.get(Employee.class, 1);
//           eo1.setCity("Patna");
//           session.saveOrUpdate(eo1);
//           tr.commit();
//           System.out.println("City is Updated");
//       }catch(Exception ex) {
//    	   tr.rollback();
//    	   ex.printStackTrace();
//       }
        
        // delete
        
        Employee eo4 = new Employee();
        eo4.setId(1);
        session.delete(eo4);
        tr.commit();
        System.out.println("Data is Deleted");
        
        
        
       
        


        
        
        
    }
}
