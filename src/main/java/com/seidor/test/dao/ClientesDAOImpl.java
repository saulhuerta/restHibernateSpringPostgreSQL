package com.seidor.test.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.seidor.test.model.clientes;

@Repository
public class ClientesDAOImpl implements ClientesDAO{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
	
	@Transactional
	@Override
	public List<clientes> getAllClientes() {
		
		Session 		session 		= this.sessionFactory.getCurrentSession();
		List<clientes> 	clientesList 	= (List<clientes>)session.createQuery("FROM clientes").list();
        
        return clientesList;
		
	}
	
	@Transactional
	@Override
	public List<clientes> clientesByFecha(String fecha) throws Exception {
		
		Session		session		= this.sessionFactory.getCurrentSession();
		Criteria	criteria	= session.createCriteria(clientes.class);

		criteria.add(Restrictions.like("updateDate", new SimpleDateFormat("YYYY-MM-dd").parse(fecha)));
			
		List<clientes> 	clientesList 	= criteria.list();
        
        return clientesList;
		
	}

}
