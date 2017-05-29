package com.seidor.test.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.seidor.test.model.productos;

@Repository
public class ProductosDAOImpl implements ProductosDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;    
	}
	
	@Transactional
	@Override
	public List<productos> getAllProductos() {
		
		Session session = this.sessionFactory.getCurrentSession();
		
		List<productos> productosList = (List<productos>)session.createQuery("FROM productos").list();
        
        return productosList;
	}

}
