package com.seidor.test.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.seidor.test.dao.DirectorioDAO;
import com.seidor.test.model.directorio;

@Service
public class DirectorioServiceImpl implements DirectorioService{

	private DirectorioDAO  directorioDAO;
	
	public DirectorioDAO getDirectorioDAO() {
		return directorioDAO;
	}

	public void setDirectorioDAO(DirectorioDAO directorioDAO) {
		this.directorioDAO = directorioDAO;
	}


	@Override
	public List<directorio> listDirectorio() {
		return directorioDAO.getAllDirectorio();
	}

}
