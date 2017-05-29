package com.seidor.test.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.seidor.test.dao.ProductosDAO;
import com.seidor.test.model.productos;

@Service
public class ProductosServiceImpl implements ProductosService {
	
	private ProductosDAO	productosDAO;

	public ProductosDAO getProductosDAO() {
		return productosDAO;
	}
	
	public void setProductosDAO(ProductosDAO productosDAO) {
		this.productosDAO = productosDAO;
	}


	@Override
	public List<productos> listProductos() {
		return productosDAO.getAllProductos();
	}

}
