package utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
  private static final SessionFactory sessionFactory;
  // singleton initial with block static 
  static {
     sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
  }
  public static SessionFactory getSessionFactory() {  
    return sessionFactory;
  }

}
