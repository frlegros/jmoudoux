package chap54.hibernate;

import chap54.hibernate.model.Personnes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate1{


    public static void main(String[] Args){

        Configuration config = new Configuration();
        config.addClass(Personnes.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.close();

    }
}