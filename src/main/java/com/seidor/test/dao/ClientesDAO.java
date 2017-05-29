package com.seidor.test.dao;

import java.util.List;
import com.seidor.test.model.clientes;

public interface ClientesDAO {
	
	public List<clientes> getAllClientes();
	public List<clientes> clientesByFecha(String fecha) throws Exception;

}
