package project3.hostipalwork;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import project3.entity.Patient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start project" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        //System.out.println(session.isOpen());
     Transaction tx=session.beginTransaction();
    Patient p1=new Patient();
     p1.setPid(1);
     p1.setPname("sheetal");
     p1.setPdoc("sandeep");
     p1.setAge(30);
     
   session.save(p1);
   tx.commit();
   session.close();
   factory.close();
   
     
    
    
        
    }
}
