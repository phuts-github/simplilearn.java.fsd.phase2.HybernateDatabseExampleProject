package hibernate.example.with.annotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure("hibernate/example/hibernate.cfg.xml")
				.buildSessionFactory();
	}

}
