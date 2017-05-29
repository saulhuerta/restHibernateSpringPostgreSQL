package com.seidor.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.seidor.test.model.directorio;

@Repository
public class DirectorioDAOImpl implements DirectorioDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
	
	@Transactional
	@Override
	public List<directorio> getAllDirectorio() {
		Session session = this.sessionFactory.getCurrentSession();
		
		List<directorio> directorioList = (List<directorio>)session.createQuery("FROM directorio").list();
        
        return directorioList;
	}

}
