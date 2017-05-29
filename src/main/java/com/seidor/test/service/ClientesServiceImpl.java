package com.seidor.test.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.seidor.test.dao.ClientesDAO;
import com.seidor.test.model.clientes;

@Service
public class ClientesServiceImpl implements ClientesService {
	
	private ClientesDAO clientesDAO;
	
	public ClientesDAO getClientesDAO() {
		return clientesDAO;
	}

	public void setClientesDAO(ClientesDAO clientesDAO) {
		this.clientesDAO = clientesDAO;
	}

	@Override
	public List<clientes> listClientes() {
		return clientesDAO.getAllClientes();
	}

	@Override
	public List<clientes> clientesByFecha(String fecha) throws Exception {
		return clientesDAO.clientesByFecha(fecha);
	}

}
