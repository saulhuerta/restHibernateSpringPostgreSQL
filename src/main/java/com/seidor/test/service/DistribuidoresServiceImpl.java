package com.seidor.test.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.seidor.test.dao.DistribuidoresDAO;
import com.seidor.test.model.distribuidores;

@Service
public class DistribuidoresServiceImpl implements DistribuidoresService {
	
	private DistribuidoresDAO	distribuidoresDAO;

	public DistribuidoresDAO getDistribuidoresDAO() {
		return distribuidoresDAO;
	}

	public void setDistribuidoresDAO(DistribuidoresDAO distribuidoresDAO) {
		this.distribuidoresDAO = distribuidoresDAO;
	}

	@Override
	public List<distribuidores> listDistribuidores() {
		return distribuidoresDAO.getAllDistribuidores();
	}

}
