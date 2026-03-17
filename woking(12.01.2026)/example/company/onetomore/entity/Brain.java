package project3.example.company.onetomore.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class Brain {

	public static void main(String[] args) {
		
			Configuration cfg=new Configuration();
			cfg.configure("control1.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			//Course (one)

			Department d1 = new Department();
			Employee e1= new Employee();
			
			
			d1.setDid(111);
			d1.setDname("bca deploer");
			
			e1.setEid(211);
			e1.setEanme("sandeep");
			e1.setDepatment(d1);
			
			Employee e2= new Employee();
			e2.setEid(311);
			e2.setEanme("sandeep");
			e2.setDepatment(d1);
			
			
			List<Employee> list = new ArrayList<>();
			list.add(e1);
			list.add(e2);
			
			d1.setEmployee(list);
			
			
			//Save
			session.save(d1);
			session.save(e1);
			session.save(e2);
			
			tx.commit();
			
			session.close();
			factory.close();

			

	}

}
