package bl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionfactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			return new Configuration().configure().buildSessionFactory();
		}
		catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
	public static void shutdown() {
		
		getSessionfactory().close();
	}
	
}
