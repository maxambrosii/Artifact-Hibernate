package domain;


import org.hibernate.Session;

import bl.HibernateUtil;
import entity.Client;


public class Domain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		
		session.beginTransaction();
		
		Client client = new Client();
		client.setFIO_Client("Ambrosii Maxim");
		client.setPol("M");
		client.setTelefon("0789864516");
		client.setRost(178L);
		client.setVes(65L);
		client.setAge(19L);
		

		session.save(client);
		
		
		session.getTransaction().commit();
		
		HibernateUtil.shutdown();
	}
	
}
