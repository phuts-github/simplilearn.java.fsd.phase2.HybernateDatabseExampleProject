package hibernate.example;

import javax.security.auth.login.Configuration;

public class DataManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

}
