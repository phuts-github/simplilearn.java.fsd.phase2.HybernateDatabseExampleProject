package hibernate.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure("hibernate/example/hibernate.cfg.xml")
				.buildSessionFactory();
			Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
		
//					Employee emp = new Employee();
//						emp.setFirstName("jamess");
//						emp.setLastName("jamass");
//					session.save(emp);

//					
//					System.out.println();
//					System.out.println("Get one record");
//					Employee emp1 = session.get(Employee.class,1);
//					System.out.println(emp1.toString());
//
////					** to get list
//					System.out.println();
//					System.out.println("Get list of record");
//					List <Employee> empList = session.createQuery("FROM Employee").list();
//					System.out.println(empList.toString());
//					
//					System.out.println();
//					System.out.println("Get list of record 2");					
//					List<Employee> empList1 = new ArrayList<Employee>();
//					empList1 = session.createQuery("FROM Employee").list();
//					System.out.println(empList1.toString());
//

//					** to delete 
					System.out.println();
					System.out.println("Delete one record");
					Employee emp3 = new Employee();
					emp3.setId(1);
					session.delete(emp3);					
					
				transaction.commit();
			session.close();
		sessionFactory.close();
		
	}
}
