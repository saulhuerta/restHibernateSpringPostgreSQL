package com.seidor.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.seidor.test.model.clientes;
import com.seidor.test.model.distribuidores;

@Repository
public class DistribuidoresDAOImpl implements DistribuidoresDAO {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

	@Transactional
	@Override
	public List<distribuidores> getAllDistribuidores() {
		
		Session session = this.sessionFactory.getCurrentSession();
		
		List<distribuidores> distribuidoresList = (List<distribuidores>)session.createQuery("FROM distribuidores").list();
        
        return distribuidoresList;
	}

}
