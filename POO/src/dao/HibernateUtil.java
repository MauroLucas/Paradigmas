/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	
	public static SessionFactory getSessionFactory() {
		try{
	        if (sessionFactory == null) {
				StandardServiceRegistry standardRegistry = 
						new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metaData = 
						new MetadataSources(standardRegistry).getMetadataBuilder().build();
				sessionFactory = metaData.getSessionFactoryBuilder().build();
	        } 
		} catch (HibernateException he) { 
          System.err.println("ERROR en la inicializaci�n de la SessionFactory: " + he); 
          he.printStackTrace();
          throw new ExceptionInInitializerError(he); 
		} 
				
	    return sessionFactory;
	}
}


//import org.hibernate.HibernateException;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
// 
//public class HibernateUtil {
//    private static SessionFactory sessionFactory;
//     
//    public static SessionFactory getSessionFactory() {
//    	try{
//	        if (sessionFactory == null) {
//	            // loads configuration and mappings
//	            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//	            ServiceRegistry serviceRegistry
//	                = new StandardServiceRegistryBuilder()
//	                    .applySettings(configuration.getProperties()).build();
//	             
//	            // builds a session factory from the service registry
//	            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
//	        }
//    	} catch (HibernateException he) { 
//         System.err.println("ERROR en la inicializaci�n de la SessionFactory: " + he); 
//         throw new ExceptionInInitializerError(he); 
//        } 
//        return sessionFactory;
//    }
//}

//import org.hibernate.HibernateException;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
////import org.hibernate.service.ServiceRegistryBuilder;
//
//public class HibernateUtil
//{  
//	private static SessionFactory sessionFactory;
//	
//
//    public static SessionFactory getSessionFactory() {
//    	try{
//        if (sessionFactory == null) {
//            Configuration configuration = new Configuration().configure();
//            
//           
//            ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
//            registry.applySettings(configuration.getProperties());
//            ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
//            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
//        }
//        
//    	} catch (HibernateException he) 
//        { 
//           System.err.println("ERROR en la inicializaci�n de la SessionFactory: " + he); 
//           throw new ExceptionInInitializerError(he); 
//        } 
//         
//        return sessionFactory;
//    }
//
//   
//}