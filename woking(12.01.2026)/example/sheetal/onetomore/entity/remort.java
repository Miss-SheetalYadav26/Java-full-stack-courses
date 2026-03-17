package project3.example.sheetal.onetomore.entity;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class remort {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("control1.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
//		Coureses c1=new Coureses();
//		c1=session.get(Coureses.class,101);
//		System.out.println(c1.getCouname());
//		System.out.println(c1.getStudent());
//		
//		for(Students st:c1.getStudent())
//		{
//			System.out.println(st.getChildid()+" "+st.getChildname());
//			
//		}
		
		Transaction tx=session.beginTransaction();
		
		//Course (one)

		Coureses c1 = new Coureses();
		Students s1= new Students();
		
		
		
		c1.setCouid(101);
		c1.setCouname("java");
		
		s1.setChildid(11);
		s1.setChildname("ashutosh");
		s1.setCours(c1);
		
		Students s2= new Students();
		s2.setChildid(12);
		s2.setChildname("ashutosh");
		s2.setCours(c1);
		
		List<Students> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		c1.setStudent(list);
		
		//Save
				session.save(c1);
				session.save(s1);
				session.save(s2);
				
				tx.commit();
				
				session.close();
			factory.close();



	



	}

}
