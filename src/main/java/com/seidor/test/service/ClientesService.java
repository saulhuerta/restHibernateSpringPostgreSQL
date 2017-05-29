package com.seidor.test.service;

import java.util.List;
import com.seidor.test.model.clientes;

public interface ClientesService {
	 public List<clientes> listClientes();
	 public List<clientes> clientesByFecha(String fecha) throws Exception;
}
