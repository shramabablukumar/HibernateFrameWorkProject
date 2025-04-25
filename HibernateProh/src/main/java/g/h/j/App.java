package g.h.j;

import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration; 
/** 
* Hello world! 
* 
*/ 
public class App  
{ 
public static void main( String[] args ) 
{ 
Student so1=new Student(); 
so1.setS_id(1); 
so1.setS_name("Nishant"); 
so1.setCity("Mumbai"); 
Configuration cfg=new Configuration(); 
cfg.configure("/c/b/d/hibernate.cfg.xml")
 ; 
SessionFactory 
sf=cfg.buildSessionFactory(); 
Session s=sf.openSession(); 
Transaction tr=s.beginTransaction(); 
try { 
s.save(so1); 
tr.commit(); 
} 
catch(Exception e) { 
tr.rollback(); 
e.printStackTrace(); 
} 
} 
}